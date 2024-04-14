package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.servicios.implementaciones;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto.*;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Negocio;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.entidades.Horario;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.entidades.Telefonos;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.entidades.Ubicacion;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.enums.EstadoRegistro;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.enums.TipoNegocio;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.repositorios.ClienteRepo;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.repositorios.NegocioRepo;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.servicios.interfaces.NegocioServicio;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class NegocioServicioImpl implements NegocioServicio {

    private final NegocioRepo negocioRepo;

    public NegocioServicioImpl (NegocioRepo negocioRepo){this.negocioRepo = negocioRepo; }

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

        Negocio negocioGuardado = negocioRepo.save(negocio);

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

        //
        Optional<Negocio> optionalNegocio = negocioRepo.findByCodigo(idNegocio);

        //lanzamos excepcion si no se encuentra el negocio
        if (optionalNegocio.isEmpty()){
            throw new Exception("El negocio no existe");
        }

        negocioRepo.toString();

        return null;
    }

    @Override
    public List<ItemNegocioDTO> listarNegocios() {
        return null;
    }

    @Override
    public List<ItemClienteDTO> listarCliente() {
        return null;
    }

    @Override
    public String compartirNegocio() {
        return null;
    }

    @Override
    public void listarNegocioPorEstado() throws Exception {

    }

    @Override
    public void aprobar(CambioEstadoDTO cambioEstadoDTO) throws Exception {

        //creamos el optional
        Optional<Negocio> optionalNegocio = negocioRepo.findByCodigo(cambioEstadoDTO.id());

    }

    @Override
    public void rechazar(CambioEstadoDTO cambioEstadoDTO) throws Exception {

    }
}
