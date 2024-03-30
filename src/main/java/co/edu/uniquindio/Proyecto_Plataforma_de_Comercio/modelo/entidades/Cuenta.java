package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.entidades;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.enums.EstadoRegistro;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Cuenta {

    private String email;
    private String nickname;
    private String password;
    private EstadoRegistro estadoRegistro;

}
