package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record DetalleClienteDTO(
        @NotBlank String id,
        @NotBlank @Length(max = 100) String nombre,
        String fotoPerfil,
        @NotBlank @Length(max = 10) String nickName,
        @NotBlank @Length(max = 100) @Email String email,
        @NotBlank @Length(max = 50) String ciudadResidencia
) {
}
