package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.entidades;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.enums.EstadoRegistro;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cuenta {

    @Id
    @EqualsAndHashCode.Include
    private int idCuenta;
    private String email;
    private String nickname;
    private String password;
    private EstadoRegistro estadoRegistro;

}
