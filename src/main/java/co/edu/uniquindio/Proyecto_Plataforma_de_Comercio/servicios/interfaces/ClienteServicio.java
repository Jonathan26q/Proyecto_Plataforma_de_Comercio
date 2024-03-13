package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.servicios.interfaces;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto.ActualizacionUsuarioDTO;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto.InicioSesionDTO;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto.RecuperacionPasswordDTO;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto.RegistroUsuarioDTO;

public interface ClienteServicio {

    void registrarse(RegistroUsuarioDTO registroUsuarioDTO) throws Exception;

    void editarPerfil(ActualizacionUsuarioDTO actualizacionUsuarioDTO)throws Exception;

    void eliminarCuenta(String idCliente)throws Exception;

    void iniciarSesion(InicioSesionDTO inicioSesionDTO)throws Exception;

    void enviarLinkRecuparcion(String email)throws Exception;
    void recuperarPassword(RecuperacionPasswordDTO recuperacionPasswordDTO)throws Exception;

    void obtenerCliente(String idCliente)throws Exception;

}
