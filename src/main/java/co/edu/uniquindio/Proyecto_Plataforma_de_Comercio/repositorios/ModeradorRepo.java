package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.repositorios;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Moderador;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeradorRepo extends MongoRepository<Moderador, String> {
}
