package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Document
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Producto implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    private String nombre;
    private List<TipoProducto> tipoProducto;
    private int unidades;
    private float precio;
}
