package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record ActualizacionUsuarioDTO(
        @NotBlank String id,
        @NotBlank @Length(max = 100) String nombre,
        @NotBlank String fotoPerfil,
        @NotBlank String nickname,
        @NotBlank @Email String email,
        @NotBlank String ciudadResidencia
) {
}
