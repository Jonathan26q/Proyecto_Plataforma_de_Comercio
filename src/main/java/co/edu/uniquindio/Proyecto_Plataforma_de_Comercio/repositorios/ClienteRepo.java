package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.repositorios;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepo extends MongoRepository <Cliente, String> {
<<<<<<< HEAD
    Optional<Cliente> findByEmail(String email);
=======

    Optional<Cliente> findByEmail(String email);
    Optional<Cliente> findByNickname(String nickname);
    Optional<Cliente> findByCedula(String cedula);
    Optional<Cliente> findByCodigo(String codigo);
>>>>>>> 29c144246c319d9c886cc013c59eabb82bc24dcf

}
