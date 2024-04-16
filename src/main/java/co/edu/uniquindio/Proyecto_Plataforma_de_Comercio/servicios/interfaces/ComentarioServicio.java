package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.servicios.interfaces;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto.ComentarioItemDTO;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto.IngresarComentarioDTO;

import java.util.List;

public interface ComentarioServicio {

    String crearComentario(IngresarComentarioDTO ingresarComentarioDTO);

    void insertarImagen();

    List<ComentarioItemDTO> listarComentariosNegocio();

    void responderComentario();
    void eliminarComentario();
    void editarComentario();
}
