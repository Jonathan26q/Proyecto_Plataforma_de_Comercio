package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record ItemFavoritosDTO(

        //En este dto visualizaremos los negocios que hemos marcado como favoritos... no se si se debe colocar el favorito en alguna parte.
        @NotBlank String id,
        @NotBlank String fotoNegocio,
        @NotBlank @Length(max = 100) String nombreNegocio,
        @NotBlank String calificacion,
        @NotBlank @Length(max = 200) String descripcionNegocio,
        @NotBlank @Length(max = 100) String direccionNegocio,
        @NotBlank String telefonoNegocio,
        @NotBlank @Length(max = 50) String ciudadNegocio

) {
}
