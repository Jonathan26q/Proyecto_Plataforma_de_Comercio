package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record ItemRechazadosAprobadosDTO(

        //este dto es para listar los negocios que estan aprobados y rechazados
        @NotBlank String id,
        @NotBlank String fotoNegocio,
        @NotBlank @Length(max = 100) String nombreNegocio,
        @NotBlank @Length(max = 200) String descripcionNegocio,
        @NotBlank @Length(max = 100) String direccionNegocio,
        @NotBlank String telefonoNegocio,
        @NotBlank @Length(max = 50) String ciudadNegocio,
        @NotBlank @Length(max = 100) String comentario

) {
}
