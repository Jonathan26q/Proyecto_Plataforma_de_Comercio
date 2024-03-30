package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.entidades.CodigoDescuento;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.entidades.FotosComentario;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Document("Comentarios")
public class Comentario implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    private Negocio codigoNegocio;
    private Cliente codigoCliente;
    private String mensaje;
    private String respuesta;
    private int calificacion;
    private LocalDateTime fecha;
    private CodigoDescuento bono;
    private FotosComentario fotosComentario;

    @Builder
    public Comentario(String mensaje, String respuesta){
        this.mensaje = mensaje;
        this.respuesta = respuesta;
    }

}
