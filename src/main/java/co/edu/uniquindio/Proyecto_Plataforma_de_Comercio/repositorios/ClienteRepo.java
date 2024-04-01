package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.repositorios;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepo extends MongoRepository <Cliente, String> {

    Optional<Cliente> findByEmail(String email);
    Optional<Cliente> findByNickname(String nickname);
    Optional<Cliente> findByCedula(String cedula);
    Optional<Cliente> findByCodigo(String codigo);

}
