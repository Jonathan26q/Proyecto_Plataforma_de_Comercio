package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.servicios.interfaces;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto.LoginDTO;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto.TokenDTO;

public interface AutenticacionServicio {
    public TokenDTO iniciarSesionCliente(LoginDTO loginDTO) throws Exception;
    public TokenDTO iniciarSesionModerador(LoginDTO loginDTO) throws Exception;

}
