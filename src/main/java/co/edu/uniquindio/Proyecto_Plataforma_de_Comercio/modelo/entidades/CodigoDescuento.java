package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.entidades;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Comentario;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Negocio;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CodigoDescuento {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    private Comentario idComentario;
    private Negocio idNegocio;

}
