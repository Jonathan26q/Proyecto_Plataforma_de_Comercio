package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto;

import jakarta.validation.constraints.NotBlank;

public record EstadoNegocioDTO(

        @NotBlank String idNegocio,
        @NotBlank EstadoNegocioDTO estadoNegocioDTO

) {
}
