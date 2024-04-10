package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.repositorios;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Negocio;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.awt.desktop.OpenFilesEvent;
import java.util.Optional;

@Repository
//(asumiendo que la llave primaria del documento Negocio es de tipo String):
public interface NegocioRepo extends MongoRepository<Negocio, String> {

    Optional<Negocio> findByCodigo (String codigo);

}
