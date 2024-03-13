package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Setter
@Getter
@ToString
//solo se debe considerar la llave primaria de la clase entonces por ese se coloca el onlyExpl,aca y en el Id
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Document("Clientes")
public class Cliente implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    private String cedula, nombre, email, ciudad, nickname, fotoPerfil;
    private List<String> telefono;

    @Builder
    public Cliente(String cedula, String nombre, String email, List<String> telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }
}
