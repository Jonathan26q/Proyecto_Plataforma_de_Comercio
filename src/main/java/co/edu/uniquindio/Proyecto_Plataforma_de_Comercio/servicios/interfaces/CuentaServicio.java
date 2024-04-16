package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.servicios.interfaces;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto.LoginDTO;

public interface CuentaServicio {

    void iniciarSesion(LoginDTO inicioSesionDTO)throws Exception;


}
