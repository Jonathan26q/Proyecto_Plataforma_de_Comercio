package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record InicioSesionDTO(
        @NotBlank
        @Length(max = 100)
        @Email
        String email,
        @NotBlank
        @Length(min = 8)
        String password
) {
}
