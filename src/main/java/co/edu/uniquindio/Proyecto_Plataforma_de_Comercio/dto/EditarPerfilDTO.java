package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record EditarPerfilDTO(

        @NotBlank @Length(max = 100) String nombre,
        @NotBlank @Length(max = 100) String apellido,
        @NotBlank @Length(max = 100) @Email String email,
        @NotBlank @Length(max = 50) String ciudadResidencia,
        @NotBlank String fotoPerfil

) {
}
