package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto;

import jakarta.validation.constraints.NotBlank;

public record TokenDTO (
        @NotBlank
        String token
){
}
