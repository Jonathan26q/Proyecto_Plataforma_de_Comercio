package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.servicios.interfaces;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto.*;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Cliente;

import java.util.List;

public interface ClienteServicio {

    String registrarCliente(RegistroUsuarioDTO registroUsuarioDTO) throws Exception;
    void actualizarPerfil(ActualizacionUsuarioDTO actualizacionUsuarioDTO)throws Exception;
    void eliminarCliente(String idCliente)throws Exception;
    void iniciarSesion(InicioSesionDTO inicioSesionDTO)throws Exception;
    void enviarLinkRecuparcion(String email)throws Exception;
    void recuperarPassword(RecuperacionPasswordDTO recuperacionPasswordDTO)throws Exception;
    DetalleClienteDTO obtenerCliente(String idCliente)throws Exception;
    List<ItemClienteDTO> listarClientes();

}
