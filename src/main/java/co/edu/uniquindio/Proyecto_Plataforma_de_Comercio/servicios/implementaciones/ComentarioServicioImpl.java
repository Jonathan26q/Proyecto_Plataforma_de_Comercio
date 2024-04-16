package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.servicios.implementaciones;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto.ComentarioItemDTO;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto.EditarComentarioDTO;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto.IngresarComentarioDTO;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Comentario;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Negocio;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.repositorios.ComentarioRepo;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.servicios.interfaces.ClienteServicio;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.servicios.interfaces.ComentarioServicio;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.servicios.interfaces.NegocioServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class ComentarioServicioImpl implements ComentarioServicio {

    private final ComentarioRepo comentarioRepo;
    private final ClienteServicio clienteServicio;

    private Comentario traerCodigoComentario(String codigo) throws Exception{
        Optional <Comentario> optionalComentario = comentarioRepo.findById(codigo);
        if (optionalComentario.isPresent()){
            return optionalComentario.get();
        }else {
            throw new Exception("Comentario no encontrado");
        }

    }

    @Override
    public String crearComentario(IngresarComentarioDTO ingresarComentarioDTO) {

        //Creamos el objeto comentario
        Comentario comentario = new Comentario();

        comentario.setCodigo(ingresarComentarioDTO.idComentario());
        comentario.setMensaje(ingresarComentarioDTO.comentario());
        comentario.setFecha(ingresarComentarioDTO.horaComentario());

        Comentario comentarioGuardado = comentarioRepo.save(comentario);

        return comentarioGuardado.getCodigo();

    }

    @Override
    public void insertarImagen() {

    }

    @Override
    public List<ComentarioItemDTO> listarComentariosNegocio() {

        //optenemos lista de todos los clientes
        List<Comentario> comentarios = comentarioRepo.findAll();

        //creamos la lista de comentario
        List<ComentarioItemDTO> itemComentario = new ArrayList<>();

        //recorremos la lista y por cada uno creamos un DTO y lo agregamos a la lista
        for (Comentario comentario : comentarios){
            itemComentario.add(new ComentarioItemDTO(
                    comentario.getCodigo(),
                    comentario.getMensaje(),
                    comentario.getRespuesta(),
                    comentario.getCodigoNegocio().getHorarios()));
        }
        return itemComentario;
    }

    @Override
    public String responderComentario(IngresarComentarioDTO ingresarComentarioDTO) {

        //Creamos la respuesta
        Comentario respuesta = new Comentario();

        respuesta.setCodigo(ingresarComentarioDTO.idComentario());
        respuesta.setRespuesta(ingresarComentarioDTO.comentario());
        respuesta.setFecha(ingresarComentarioDTO.horaComentario());

        Comentario respuestaGuardada = comentarioRepo.save(respuesta);

        return respuestaGuardada.getCodigo();

    }

    @Override
    public void eliminarComentario(String idComentario) throws Exception {

        //buscamos el comentario a eliminar
        Optional<Comentario> optionalComentario = comentarioRepo.findByCodigo(idComentario);

        if (optionalComentario.isEmpty()){
            throw new Exception("comentario no encontrado");
        }

        Comentario comentario = optionalComentario.get();

        comentarioRepo.delete(comentario);

    }

    @Override
    public void editarComentario(EditarComentarioDTO editarComentarioDTO)throws Exception {

        //buscamos el comentario a editar
        Optional<Comentario> optionalComentario = comentarioRepo.findByCodigo(editarComentarioDTO.idComentario());

        //lanzamos excepcion sino encuentra el comentario
        if (optionalComentario.isEmpty()){
            throw new Exception("Comentario no encontrado");
        }

        //traemos el objeto comentario
        Comentario comentario = optionalComentario.get();
        comentario.setMensaje(editarComentarioDTO.comentario());

    }
    //private final NegocioServicio negocioServicio;


}
