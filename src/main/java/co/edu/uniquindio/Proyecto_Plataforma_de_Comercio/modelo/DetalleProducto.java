package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class DetalleProducto {

    private String codigoProducto;
    private float precio;
    private int cantidad;
}
