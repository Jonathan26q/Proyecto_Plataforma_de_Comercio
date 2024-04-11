package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.entidades;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.enums.EstadoRegistro;
import lombok.*;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cuenta {

    @Id
    @EqualsAndHashCode.Include
    private int id;
    private String email;
    private String nickname;
    private String password;
    private EstadoRegistro estadoRegistro;
}
