package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.repositorios;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Comentario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.awt.desktop.OpenFilesEvent;
import java.util.Optional;

@Repository
public interface ComentarioRepo extends MongoRepository<Comentario, String> {

    Optional<Comentario> findByCodigo(String codigo);

}
