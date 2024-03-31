package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.entidades.Horario;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record SitioClienteDTO(

        @NotBlank String id,
        @NotBlank String fotoNegocio,
        @NotBlank @Length(max = 100) String nombreNegocio,
        @NotBlank @Length(max = 100) String descripcionNegocio,
        @NotBlank @Length(max = 100) String direccionNegocio,
        @NotBlank String ubicacion,
        @NotBlank String telefonoNegocio,
        @NotBlank String ciudadNegocio,
        @NotBlank Horario horarios,
        @NotBlank @Length(max = 100) String comentario

) {
}
