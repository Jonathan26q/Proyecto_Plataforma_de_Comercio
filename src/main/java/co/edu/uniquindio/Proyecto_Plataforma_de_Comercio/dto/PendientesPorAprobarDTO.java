package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record PendientesPorAprobarDTO(

        //Este dto es para mostrar los negocios que estan pendientes por aprobar, de aca pasan a la verificacion de negocio
        @NotBlank String id,
        @NotBlank String fotoNegocio,
        @NotBlank @Length(max = 100) String nombreNegocio,
        @NotBlank @Length(max = 200) String descripcionNegocio,
        @NotBlank @Length(max = 100) String direccionNegocio,
        @NotBlank String telefonoNegocio,
        @NotBlank @Length(max = 50) String ciudadNegocio

) {
}
