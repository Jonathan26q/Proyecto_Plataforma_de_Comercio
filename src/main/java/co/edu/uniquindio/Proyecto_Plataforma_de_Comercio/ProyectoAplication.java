package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoAplication {

    public static void main(String[] args) {

        //Acá estamos configurando nuestro proyecto
        //para que haga uso de Spring Boot. Cuando queramos desplegar el proyecto, simplemente
        //ejecutamos el main de esta clase.
        SpringApplication.run(ProyectoAplication.class, args);
    }
}
