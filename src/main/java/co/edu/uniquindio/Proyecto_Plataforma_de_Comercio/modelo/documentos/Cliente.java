package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.entidades.Cuenta;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.enums.EstadoRegistro;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Setter
@Getter
@Document("Clientes")
@ToString(callSuper = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@NoArgsConstructor
public class Cliente extends Cuenta implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private String codigo;
    private String cedula;
    private String nombre;
    private String apellido;
    private String email;
    private String ciudad;
    private String nickname;
    private String fotoPerfil;
    private List<String> telefono;

    @Builder
    public Cliente(String email, String nickname, String password, String cedula, String nombre, String apellido, String ciudad,  List<String> telefono, String fotoPerfil) {
        //super(email, nickname, password, null);
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.fotoPerfil = fotoPerfil;
    }
}
