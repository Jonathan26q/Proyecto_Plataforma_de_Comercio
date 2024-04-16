package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.entidades.Horario;
import jakarta.validation.constraints.NotBlank;

public record ComentarioItemDTO(

        @NotBlank String idComentario,
        @NotBlank String mensaje,
        @NotBlank String respuesta,
        @NotBlank Horario horarios

) {
}
