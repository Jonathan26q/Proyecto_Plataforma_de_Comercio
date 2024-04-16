package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.entidades.Cuenta;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.enums.EstadoRegistro;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@ToString
@Document("Moderadores")
public class Moderador extends Cuenta {

    private String codigo;

    public Moderador(int idCuenta, String email, String nickname, String password, EstadoRegistro estadoRegistro) {
        super(idCuenta, email, nickname, password, estadoRegistro);
    }
}
