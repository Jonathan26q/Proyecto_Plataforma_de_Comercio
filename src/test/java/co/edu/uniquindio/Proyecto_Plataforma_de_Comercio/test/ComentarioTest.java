package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.test;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Comentario;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.repositorios.ComentarioRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ComentarioTest {

    @Autowired
    private ComentarioRepo comentarioRepo;

    @Test
    public void crearComentario(){
        Comentario comentario = Comentario.builder()
                .mensaje("Hola").build();

        Comentario registro = comentarioRepo.save(comentario);

        Assertions.assertNotNull(registro);
    }

    @Test
    public void responderComentario(){
        Comentario comentario = Comentario.builder()
                .respuesta("Como estas").build();
    }


}