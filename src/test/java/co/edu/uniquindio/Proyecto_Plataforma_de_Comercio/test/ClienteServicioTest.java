package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.test;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto.RegistroUsuarioDTO;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.servicios.implementaciones.ClienteServicioImpl;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.servicios.interfaces.ClienteServicio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClienteServicioTest {

    @Autowired
    private ClienteServicio clienteServicio;

    @Test
    public void registrarTest()  throws Exception{
        //se crea un objeto de tipo RegistroUsuarioDTO
        RegistroUsuarioDTO registroUsuarioDTO = new RegistroUsuarioDTO(
                "1094910",
                "jonat",
                "more",
                "Jonathan26q",
                "jamorenol@uqvirtual.edu.co",
                "Armenia",
                "123456",
                "123456",
                "URLfotoPerfil"
        );

        //Se registra el cliente
        String codigo = clienteServicio.registrarCliente(registroUsuarioDTO);

        //se verifica que el codigo no sea nulo, es decir, que se haya registrado correctamente el cliente
        Assertions.assertNotNull(codigo);

    }

}
