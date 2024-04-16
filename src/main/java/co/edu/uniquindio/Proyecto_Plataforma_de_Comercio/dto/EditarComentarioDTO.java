package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.entidades.Horario;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record EditarComentarioDTO(

        @NotBlank String idComentario,
        @NotBlank String comentario,
        @NotBlank LocalDateTime hora

        ) {
}
