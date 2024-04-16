package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

<<<<<<< HEAD:src/main/java/co/edu/uniquindio/Proyecto_Plataforma_de_Comercio/dto/LoginDTO.java
public record LoginDTO(
        @NotBlank @Email
        String email,
        @NotBlank @Length(min = 8)
=======
public record InicioSesionDTO(
        @NotBlank
        @Length(max = 100)
        @Email
        String email,
        @NotBlank
        @Length(min = 8)
>>>>>>> 29c144246c319d9c886cc013c59eabb82bc24dcf:src/main/java/co/edu/uniquindio/Proyecto_Plataforma_de_Comercio/dto/InicioSesionDTO.java
        String password
) {
}
