package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record RegistroUsuarioDTO(
        @NotBlank(message = "Señor usuario, el nombre es obligatorio") String nombre,
        @NotBlank String fotoPerfil,
        @NotBlank String nickname,
        @NotBlank @Email String email,
        @NotBlank String contrasena,
        @NotBlank String ciudadResidencia
) {


}
