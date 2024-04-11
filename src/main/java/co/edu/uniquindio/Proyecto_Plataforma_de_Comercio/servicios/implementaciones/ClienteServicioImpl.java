package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.servicios.implementaciones;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto.*;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Cliente;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.entidades.Cuenta;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.enums.EstadoRegistro;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.repositorios.ClienteRepo;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.repositorios.CuentaRepo;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.servicios.interfaces.ClienteServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class ClienteServicioImpl implements ClienteServicio {

    private final ClienteRepo clienteRepo;
    private final CuentaRepo cuentaRepo;


    private boolean existeEmail(String emain){
        return clienteRepo.findByEmail(emain).isPresent();
    }

    private boolean existeNickname(String nickname){
        return clienteRepo.findByNickname(nickname).isPresent();
    }

    private boolean existeCedula(String cedula){
        return clienteRepo.findByCedula(cedula).isPresent();
    }

    private Cliente traerCodigoCliente(String codigo)throws Exception{
        Optional<Cliente> optionalCliente = clienteRepo.findByCodigo(codigo);
        if (optionalCliente.isPresent()){
            return optionalCliente.get();
        }
        else {
            throw new Exception("el cliente con el codigo " + codigo + " no se ha encontrado");
        }
    }

    @Override
    public String registrarCliente(RegistroUsuarioDTO registroUsuarioDTO) throws Exception {

        //verificamos que el email sea único
        if(existeEmail(registroUsuarioDTO.email())){
            throw new Exception("El correo ya se encuentra registrado");
        }

        //verificamos que el nickname sea unico
        if(existeNickname(registroUsuarioDTO.nickname())){
            throw new Exception("El nickname ya se encuentra en uso");
        }

        //verificamos que la cedula sea unica
        if(existeCedula(registroUsuarioDTO.cedula())){
            throw new Exception("La Cedula ya se encuentra registrada");
        }

        //creamos el objeto cliente
        Cliente cliente = new Cliente();

        //asignamos los campos de cada atributo
        cliente.setCedula(registroUsuarioDTO.cedula());
        cliente.setNombre(registroUsuarioDTO.nombre());
        cliente.setApellido(registroUsuarioDTO.apellido());
        cliente.setNickname(registroUsuarioDTO.nickname());
        cliente.setEmail(registroUsuarioDTO.email());
        cliente.setCiudad(registroUsuarioDTO.ciudadResidencia());
        cliente.setPassword(registroUsuarioDTO.password());
        cliente.setPassword(registroUsuarioDTO.repitaPassword());
        cliente.setEstadoRegistro(EstadoRegistro.ACTIVO);

        //Guardamos en la base de datos y obtenemos el objeto registrado
        Cliente clienteGuardado = clienteRepo.save(cliente);

        //retornamos el id (codigo) del cliente registrado
        return clienteGuardado.getCodigo();
    }

    @Override
    public void actualizarPerfil(ActualizacionUsuarioDTO actualizacionUsuarioDTO) throws Exception {

        //Buscamos el cliente a actualizar
        //traerCodigoCliente(actualizacionUsuarioDTO.id());
        Optional<Cliente> optionalCliente = clienteRepo.findByCodigo(actualizacionUsuarioDTO.id());

        //Excepcion por si no encontramos el cliente
        if (optionalCliente.isEmpty()){
            throw new Exception("No se encontro el cliente a actualizar");
        }

        if (existeEmail(actualizacionUsuarioDTO.email())){
            throw new Exception("El email ingresado ya se encuentra en uso");
        }

        //si encontramos el cliente, entonces obtenemos el cliente a actualizar y le asignamos los nuevos valores.
        Cliente cliente = optionalCliente.get();
        cliente.setNombre(actualizacionUsuarioDTO.nombre());
        cliente.setApellido(actualizacionUsuarioDTO.apellido());
        cliente.setEmail(actualizacionUsuarioDTO.email());
        cliente.setCiudad(actualizacionUsuarioDTO.ciudadResidencia());
        cliente.setFotoPerfil(actualizacionUsuarioDTO.fotoPerfil());

        //como el objeto cliente ya tiene un id, el save() no crea un nuevo registro sino que actualiza el que ya existe
        clienteRepo.save(cliente);

    }

    @Override
    public void eliminarCliente(String idCliente) throws Exception {

        //buscamos el cliente que se quiere eliminar
        Optional<Cliente> optionalCliente = clienteRepo.findByCodigo(idCliente);

        //sino se encuentra el cliente lanzamos una excepcion
        if(optionalCliente.isEmpty()){
            throw new Exception("El cliente no se ha encontrado");
        }

        //si encontramos el cliente entonces lo obtenemos y le cambiamos el estado a inactivo
        Cliente cliente = optionalCliente.get();
        cliente.setEstadoRegistro(EstadoRegistro.INACTIVO);

        //como el objeto cliente ya tiene un id, el save() no crea un nuevo registro sino que actualiza el que ya existe
        clienteRepo.save(cliente);

    }

    @Override
    public void iniciarSesion(InicioSesionDTO inicioSesionDTO) throws Exception {

        Optional<Cuenta> optionalCuenta = cuentaRepo.findByEmail(inicioSesionDTO.email());
        if (optionalCuenta.isEmpty()) {
            throw new Exception("cliente no existe");
        }
        else {
            if(inicioSesionDTO.password().equals(optionalCuenta.get().getPassword())){

            }
            else{
                throw new Exception("Contraseña incorrecta");
            }
        }

    }

    @Override
    public void enviarLinkRecuparcion(String email) throws Exception {

    }

    @Override
    public void recuperarPassword(RecuperacionPasswordDTO recuperacionPasswordDTO) throws Exception {

    }

    @Override
    public DetalleClienteDTO obtenerCliente(String idCliente) throws Exception {

        //Buscamos el cliente que queremos mostrar
        Optional<Cliente> optionalCliente = clienteRepo.findByCodigo(idCliente);

        if (optionalCliente.isEmpty()){
            throw new Exception("El Cliente con el id " + idCliente + " no se ha encontrado");
        }

        //si se encuentra el cliente encontra lo traemos con el get
        Cliente cliente = optionalCliente.get();

        //Retornamos el cliente en formato DTO
        return new DetalleClienteDTO(cliente.getCodigo(), cliente.getNombre(), cliente.getFotoPerfil(), cliente.getNickname(), cliente.getEmail(), cliente.getCiudad());
    }

    @Override
    public List<ItemClienteDTO> listarClientes() {

        //obtenemos todos los clientes de la base de datos
        List<Cliente> clientes = clienteRepo.findAll();

        //creamos una lista de DTOs de clientes
        List<ItemClienteDTO> items = new ArrayList<>();

        //recorremos la lista de clientes y por cada uno creamos un DTO y lo agregamos a la lista
        for (Cliente cliente : clientes){
            items.add(new ItemClienteDTO(cliente.getCodigo(), cliente.getNombre(), cliente.getApellido(), cliente.getEmail(), cliente.getNickname(), cliente.getCiudad(), cliente.getFotoPerfil()));
        }

        return items;
    }
}
