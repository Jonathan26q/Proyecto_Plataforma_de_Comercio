package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto;

public record MensajeDTO<T>(
        boolean error,
        T respuesta
) {
}
