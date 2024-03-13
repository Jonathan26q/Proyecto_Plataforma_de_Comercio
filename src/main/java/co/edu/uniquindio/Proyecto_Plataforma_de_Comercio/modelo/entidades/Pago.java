package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class Pago {

    private String codigo, estado, metodoPago;
    private LocalDateTime fecha;
    private float totalPagado;
}
