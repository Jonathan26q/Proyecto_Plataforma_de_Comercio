package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.enums.EstadoRegistro;
import jakarta.validation.constraints.NotBlank;

public record CambioEstadoDTO(

        @NotBlank String id,
        @NotBlank EstadoRegistro estadoRegistro

) {
}
