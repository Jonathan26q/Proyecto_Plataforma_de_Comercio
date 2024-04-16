package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.entidades;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.enums.EstadoRegistro;
<<<<<<< HEAD
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
=======
import lombok.*;
>>>>>>> 29c144246c319d9c886cc013c59eabb82bc24dcf
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cuenta {

    @Id
    @EqualsAndHashCode.Include
<<<<<<< HEAD
    private int idCuenta;
=======
    private int id;
>>>>>>> 29c144246c319d9c886cc013c59eabb82bc24dcf
    private String email;
    private String nickname;
    private String password;
    private EstadoRegistro estadoRegistro;
}
