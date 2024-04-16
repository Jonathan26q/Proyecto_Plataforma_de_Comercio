package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.repositorios;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Cliente;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.entidades.Cuenta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CuentaRepo extends MongoRepository<Cuenta, Integer> {
<<<<<<< HEAD
    Optional<Cuenta> findById(Integer integer);

=======
    Optional<Cuenta> findById(int id);
>>>>>>> 29c144246c319d9c886cc013c59eabb82bc24dcf
    Optional<Cuenta> findByEmail(String email);
}
