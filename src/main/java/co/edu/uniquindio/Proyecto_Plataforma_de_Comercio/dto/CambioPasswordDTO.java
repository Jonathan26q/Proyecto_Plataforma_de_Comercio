package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record CambioPasswordDTO(

        @NotBlank String id,
        @NotBlank @Length(min = 8) String passwordNuevo,
        @NotBlank @Length(min = 8) String repetirPassword,
        @NotBlank String token


) {
}
