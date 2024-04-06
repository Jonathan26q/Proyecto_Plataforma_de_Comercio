package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.entidades.Horario;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.entidades.Ubicacion;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.enums.TipoNegocio;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record ItemNegocioDTO(
        @NotBlank String id,
        @NotBlank String imagenes,
        @NotBlank @Length(max = 100) String nombreNegocio,
        @NotBlank @Length (max = 100) String direccion,
        @NotBlank String telefonos,
        @NotBlank TipoNegocio categoria,
        @NotBlank @Length (max = 200) String descripcion,
        @NotBlank Horario horarios,
        @NotBlank Ubicacion ubicacion
) {
}
