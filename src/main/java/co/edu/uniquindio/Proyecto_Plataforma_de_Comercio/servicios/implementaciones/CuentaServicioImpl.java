package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.servicios.implementaciones;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto.LoginDTO;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.entidades.Cuenta;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.repositorios.CuentaRepo;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.servicios.interfaces.CuentaServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
@Transactional
@RequiredArgsConstructor
public class CuentaServicioImpl implements CuentaServicio {
    private final CuentaRepo cuentaRepo;

    @Override
    public void iniciarSesion(LoginDTO inicioSesionDTO) throws Exception {
        Optional<Cuenta> cuenta = cuentaRepo.findByEmail(inicioSesionDTO.email());

        if(cuenta.isEmpty()){
            throw new Exception("Cliente no existe");
        }
        else{
            if(cuenta.get().getPassword().equals(inicioSesionDTO.password())){
                //Inicia
            }
            else{
                throw new Exception("Contraseña Incorrecta");
            }
        }
    }
}
