package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.entidades.Horario;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.enums.EstadoRegistro;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record VerificaciondeNegocioDTO(

        //En este dto es donde el moderador entra al negocio, lo revisa y clickea el aprobado o rechazado del negocio.
        @NotBlank String id,
        @NotBlank String fotoNegocio,
        @NotBlank @Length(max = 100) String nombreNegocio,
        @NotBlank @Length(max = 200) String descripcionNegocio,
        @NotBlank @Length(max = 100) String direccionNegocio,
        @NotBlank String ubicacion,
        @NotBlank String telefonoNegocio,
        @NotBlank @Length(max = 50) String ciudadNegocio,
        @NotBlank Horario horarios,
        @NotBlank @Length(max = 100) String comentario,
        @NotBlank EstadoRegistro estadoRegistro

        ) {
}
