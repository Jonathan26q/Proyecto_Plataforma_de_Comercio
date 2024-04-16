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
@ToString
@Document("Clientes")
public class Cliente extends Cuenta {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;
    private String cedula;
    private String nombre;
    private String email;
    private String ciudad;
    private String nickname;
    private String fotoPerfil;
    private List<String> telefono;


    public Cliente(int idCuenta, String email, String nickname, String password, EstadoRegistro estadoRegistro) {
        super(idCuenta, email, nickname, password, estadoRegistro);
    }
}
