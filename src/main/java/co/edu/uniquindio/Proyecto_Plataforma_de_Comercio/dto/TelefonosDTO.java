package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record TelefonosDTO(

    @NotBlank int codigoTelefono,
    @NotBlank @Length(min = 10) int telefono

) {
}
