package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record ItemMisSitiosPropietarioDTO(

        //En este dto el cliente dueño de establecimientos puede listar sus negocios, y entrar en la función de editar o eliminar.
        @NotBlank String id,
        @NotBlank String fotoNegocio,
        @NotBlank @Length(max = 100) String nombreNegocio,
        @NotBlank @Length(max = 200) String descripcionNegocio

) {
}
