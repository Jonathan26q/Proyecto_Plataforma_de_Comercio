package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.entidades.Pago;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Document("Transacciones")
public class Transaccion implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    //el atributo cliente es de tipo String, ya que realmente no se guarda todo el Cliente
    //en la transacción sino su id (que es de tipo String).
    private String cliente;

    private LocalDateTime fecha;
    protected Pago pago;

    //lista de productos de
    //tipo String, ya que en dicha lista guardamos los id de cada producto y no el Producto completo.
    private List<DetalleProducto> productos;
}
