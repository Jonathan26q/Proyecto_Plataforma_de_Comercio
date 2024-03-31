package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record RegistroUsuarioDTO(
        @NotBlank(message = "Señor usuario, el nombre es obligatorio") @Length(max = 100) String nombre,
        @NotBlank(message = "Señor usuario, el apellido es obligatorio") @Length(max = 100) String apellido,
        @NotBlank @Length(max = 100) String nickname,
        @NotBlank @Email String email,
        @NotBlank String ciudadResidencia,
        @NotBlank @Length(min = 8) String password,
        @NotBlank @Length(min = 8) String repitaPassword,
        @NotBlank String fotoPerfil
) {


}