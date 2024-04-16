package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.test;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto.RegistroUsuarioDTO;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Cliente;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.repositorios.ClienteRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

//La clase ClienteTest necesita la anotación @SpringBootTest para que se ejecute en el contexto de prueba.
@SpringBootTest
public class ClienteTest {

    //La variable que representa el repositorio necesita de la anotación @Autowired para que sea inicializada automáticamente.
    @Autowired
    private ClienteRepo clienteRepo;

    @Test
    public void registrarClienteTest(){
        //Creamos el cliente con sus propiedades
<<<<<<< HEAD
        Cliente cliente = Cliente.builder()
                .cedula("123265457")
=======
        /*Cliente cliente = Cliente.builder()
                .cedula("12326545")
>>>>>>> f5909d90a4fe76f56c56c0b12e5a44cf347e8a5b
                .nombre("Pepito Perez")
                .email("pepito1@mail.com")
                .telefono(List.of("121212", "3223322")).build();

        //Guardamos el cliente
        Cliente registro = clienteRepo.save(cliente);

        //Verificamos que se haya guardado validando que no sea null
        Assertions.assertNotNull(registro);*/
    }
    @Test
    public void actualizarClienteTest(){

        Optional<Cliente> clienteOptional = clienteRepo.findById("XXXX");
        if(clienteOptional.isEmpty()){
            throw new RuntimeException("El id dado no existe");
        }
        Cliente cliente = clienteOptional.get();
        cliente.setCiudad("Circasia");

        clienteRepo.save(cliente);
/*
        //Obtenemos el cliente con el id XXXXXXX
        Cliente cliente = clienteRepo.findById("65dfc09453537e6a2e3b4711").orElseThrow();
        //Modificar el email del cliente
        cliente.setEmail("novenamodificacionedelEmaildePepito@email.com");
        //Guardamos el cliente
        clienteRepo.save(cliente);
        //Obtenemos el cliente con el id XXXXXXX nuevamente
        Cliente clienteActualizado = clienteRepo.findById("65dfc09453537e6a2e3b4711").orElseThrow();
        //Verificamos que el email se haya actualizado
        Assertions.assertEquals("novenamodificacionedelEmaildePepito@email.com",clienteActualizado.getEmail());
        */

    }

    @Test
    public void listarClienteTest(){

        //Obtenemos la lista de todos los cliente(Por ahora 1)
        List<Cliente> clientes = clienteRepo.findAll();

        //imprimimos los clientes, se hace uso de una sola función
        clientes.forEach(System.out::println);

        //Verificamos que solo exista un cliente
        Assertions.assertEquals(1, clientes.size());

    }

    @Test
    public void eliminarClienteTest(){
        //Borramos el cliente con el id XXXXXXX
        clienteRepo.deleteById("65dfc0b0a837600ac94f9d75");
        //Obtenemos el cliente con el id XXXXXXX
        Cliente cliente = clienteRepo.findById("65daf59b0f39845dfbfc2eb6").orElseThrow(null);
        //Verificamos que el cliente no exista
        Assertions.assertNotNull(cliente);
    }



   /* @Test
    public void dtoTest(){
        RegistroUsuarioDTO registro = new RegistroUsuarioDTO(
                nombre: "",
                fotoPerfil: "",
                nickname: "",
                email: "",
                contrasena: "",
                ciudadResidencia: ""

        );

        System.out.println(registro.nickname());
    }*/
    /*
    @Test
    public void listarTest(){
        List<Cliente>;
    }*/
}

