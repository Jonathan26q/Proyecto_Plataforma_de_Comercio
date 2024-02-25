package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.test;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.Cliente;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.repositorios.ClienteRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

//La clase ClienteTest necesita la anotación @SpringBootTest para que se ejecute en el contexto de prueba.
@SpringBootTest
public class ClienteTest {

    //La variable que representa el repositorio necesita de la anotación @Autowired para que sea inicializada automáticamente.
    @Autowired
    private ClienteRepo clienteRepo;

    @Test
    public void registrarClienteTest(){
        //Creamos el cliente con sus propiedades
        Cliente cliente = Cliente.builder()
                .cedula("12326545")
                .nombre("Pepito Perez")
                .email("pepito@mail.com")
                .telefono(List.of("12121", "322332")).build();

        //Guardamos el cliente
        Cliente registro = clienteRepo.save(cliente);

        //Verificamos que se haya guardado validando que no sea null
        Assertions.assertNotNull(registro);
    }
    @Test
    public void actualizarClienteTest(){
        //Obtenemos el cliente con el id XXXXXXX
        Cliente cliente = clienteRepo.findById("65daed38ccec074feed0c134").orElseThrow();
        //Modificar el email del cliente
        cliente.setEmail("TerceramodificacionedelEmaildePepito@email.com");
        //Guardamos el cliente
        clienteRepo.save(cliente);
        //Obtenemos el cliente con el id XXXXXXX nuevamente
        Cliente clienteActualizado = clienteRepo.findById("65daed38ccec074feed0c134").orElseThrow();
        //Verificamos que el email se haya actualizado
        Assertions.assertEquals("TerceramodificacionedelEmaildePepito@email.com",clienteActualizado.getEmail());
    }

    @Test
    public void eliminarClienteTest(){
        //Borramos el cliente con el id XXXXXXX
        clienteRepo.deleteById("65daf59b0f39845dfbfc2eb6");
        //Obtenemos el cliente con el id XXXXXXX
        Cliente cliente = clienteRepo.findById("65daf59b0f39845dfbfc2eb6").orElseThrow(null);
        //Verificamos que el cliente no exista
        Assertions.assertNotNull(cliente);
    }
}

