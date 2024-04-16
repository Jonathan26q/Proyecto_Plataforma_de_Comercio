package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.servicios.implementaciones;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto.*;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Cliente;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Negocio;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.entidades.Horario;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.entidades.Telefonos;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.entidades.Ubicacion;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.enums.EstadoRegistro;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.enums.TipoNegocio;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.repositorios.ClienteRepo;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.repositorios.NegocioRepo;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.servicios.interfaces.ClienteServicio;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.servicios.interfaces.NegocioServicio;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
@ToString
public class NegocioServicioImpl implements NegocioServicio {

    private final NegocioRepo negocioRepo;
    private final ClienteRepo clienteRepo;

    //public NegocioServicioImpl (NegocioRepo negocioRepo){this.negocioRepo = negocioRepo; }

    //Buscar Negocio
    private Negocio traerCodigoNegocio(String codigo)throws Exception{
        Optional<Negocio> optionalNegocio = negocioRepo.findByCodigo(codigo);
        if (optionalNegocio.isPresent()){
            return optionalNegocio.get();
        }
        else {
            throw new Exception("El codigo del negocio " + codigo + " no se encuentra");
        }
    }


    @Override
    public String crearNegocio(CrearNegocioDTO crearNegocioDTO) throws Exception {

        //instanciamos el negocio
        Negocio negocio = new Negocio();

        negocio.setNombre(crearNegocioDTO.nombreNegocio());
        negocio.setDireccion(crearNegocioDTO.direccion());
        negocio.setImagenes(crearNegocioDTO.imagenes());
       // negocio.setTelefonos(crearNegocioDTO.telefonos());
        negocio.setDescripcion(crearNegocioDTO.descripcion());
        //negocio.setTipoNegocio(crearNegocioDTO.categoria());
        //negocio.setUbicacion(Ubicacion.class);
        //negocio.setHorarios(Horario.horario);
        negocio.setEstadoRegistro(EstadoRegistro.ACTIVO);


        //Guardamos en la base de dato
        Negocio negocioGuardado = negocioRepo.save(negocio);

        //retornamos el codigo
        return negocioGuardado.getCodigo();

    }

    @Override
    public void actualizarNegocio(EditarNegocioDTO editarNegocioDTO) throws Exception {

        //Buscamos el negocio a actualizar
        Optional<Negocio>optionalNegocio = negocioRepo.findByCodigo(editarNegocioDTO.id());

        //Excepcion sino encontramos el negocio
        if (optionalNegocio.isEmpty()){
            throw new Exception("No se encontro el negocio");
        }

        //actualizamos los datos del negocio
        Negocio negocio = optionalNegocio.get();
        negocio.setNombre(editarNegocioDTO.nombreNegocio());
//        negocio.setTipoNegocio(editarNegocioDTO.categoria());
        negocio.setDescripcion(editarNegocioDTO.descripcion());
        negocio.setDireccion(editarNegocioDTO.direccion());
        negocio.setEstadoRegistro(EstadoRegistro.ACTIVO);

        //Guardamos las modificaciones
        negocioRepo.save(negocio);

    }

    @Override
    public void eliminarNegocio(String idNegocio) throws Exception {

        //Buscamos el negocio a eliminar
        Optional<Negocio> optionalNegocio = negocioRepo.findByCodigo(idNegocio);

        if (optionalNegocio.isEmpty()){
            throw new Exception("Negocio no encontrado");
        }

        //Si lo encontramos entonces le cambiamos el estado al negocio a inactivo
        Negocio negocio = optionalNegocio.get();
        negocio.setEstadoRegistro(EstadoRegistro.INACTIVO);

        //como ya tenemos el objeto ya solo hace falta guardar
        negocioRepo.save(negocio);

    }

    @Override
    public DetalleNegocioDTO buscarNegocios(String idNegocio) throws Exception {
/*
        //
        Optional<Negocio> optionalNegocio = negocioRepo.findByCodigo(idNegocio);

        //lanzamos excepcion si no se encuentra el negocio
        if (optionalNegocio.isEmpty()){
            throw new Exception("El negocio no existe");
        }

        //si negocio exite entonces optenemos el optional
        Negocio negocio = optionalNegocio.get();



        DetalleNegocioDTO detalleNegocioDTO = new DetalleNegocioDTO(
                negocio.getCodigo(),
                negocio.getImagenes(),
                negocio.getNombre(),
                negocio.getDireccion(),
                negocio.getTelefonos(),
                negocio.getTipoNegocio().toString(),
                negocio.getDescripcion(),
                negocio.getHorarios(),
                negocio.getUbicacion()
        );

        return detalleNegocioDTO; */
        return null;
    }

    @Override
    public List<ItemNegocioDTO> listarNegocios() {
/*
        //Buscamos el negocio
        List<Negocio> negocios = negocioRepo.findAll();
        // no es necesario porque se utiliza stream List<ItemNegocioDTO> items = new ArrayList<>()

        Page <Negocio> pagina = negocioRepo.findAll(PageRequest.of(0, 10));
        List<Negocio> negocioss = pagina.getContent();

        return negocios.stream().map(
                n -> new ItemNegocioDTO(
                        n.getCodigo(),
                        n.getImagenes(),
                        n.getNombre(),
                        n.getDireccion(),
                        n.getTelefonos(),
                        n.getTipoNegocio().toString(),
                        n.getDescripcion(),
                        n.getHorarios(),
                        n.getUbicacion()
                )
        ).collect(Collectors.toList());*/
        return null;
    }

    @Override
    public List<ItemClienteDTO> listarCliente() {

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

    @Override
    public String compartirNegocio() {
        return null;
    }

    //Listar negocios por estado
    @Override
    public List<EstadoNegocioDTO> listarNegocioPorEstado() throws Exception {

        //obtenemos todos los negocios de la base de datos
        List<Negocio> negocios = negocioRepo.findAll();

        //creamos una lista de DTOs de negocios
        List<EstadoNegocioDTO> items = new ArrayList<>();

        //recorremos la lista de negocios y por cada uno creamos un DTO y lo agregamos a la lista
        for (Negocio negocio : negocios){
            items.add(new EstadoNegocioDTO(negocio.getCodigo(), negocio.getEstadoRegistro()));
        }

        return items;

    }

    @Override
    public void aprobar(CambioEstadoDTO cambioEstadoDTO) throws Exception {

        //Buscamos el negocio
        Optional<Negocio> optionalNegocio = negocioRepo.findById(cambioEstadoDTO.id());

        Negocio negocio = optionalNegocio.get();
        negocio.setEstadoRegistro(EstadoRegistro.ACTIVO);

        negocioRepo.save(negocio);

    }

    @Override
    public void rechazar(CambioEstadoDTO cambioEstadoDTO) throws Exception {

        //buscamos los negocios

        Optional<Negocio> optionalNegocio = negocioRepo.findById(cambioEstadoDTO.id());

        Negocio negocio = optionalNegocio.get();
        negocio.setEstadoRegistro(EstadoRegistro.INACTIVO);

        negocioRepo.save(negocio);

    }
}
