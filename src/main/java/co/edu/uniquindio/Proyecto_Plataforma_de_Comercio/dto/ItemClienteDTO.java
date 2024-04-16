package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record ItemClienteDTO(

        @NotBlank String codigo,
        @NotBlank @Length(max = 100) String nombre,
        @NotBlank @Length(max = 100) String apellido,
        @NotBlank @Length(max = 100) String email,
        @NotBlank @Length(max = 10) String nickname,
        @NotBlank @Length(max = 50) String ciudad,
        @NotBlank String fotoPerfil

) {
}
