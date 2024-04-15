package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record IngresarComentarioDTO(

        @NotBlank String idComentario,
        @NotBlank String comentario,
        @NotBlank LocalDateTime horaComentario,
        @NotBlank String insertImagenComentario

        ) {
}
