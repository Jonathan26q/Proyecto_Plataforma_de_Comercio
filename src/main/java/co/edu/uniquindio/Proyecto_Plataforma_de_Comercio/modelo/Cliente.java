package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo;

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
@NoArgsConstructor
@Document("Clientes")
public class Cliente implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    private String cedula, nombre, email;
    private List<String> telefono;


}
