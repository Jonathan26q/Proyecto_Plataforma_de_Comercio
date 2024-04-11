package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.entidades;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Usuario {

    @Id
    private String id;
    private String nombre;
    private String email;

}
