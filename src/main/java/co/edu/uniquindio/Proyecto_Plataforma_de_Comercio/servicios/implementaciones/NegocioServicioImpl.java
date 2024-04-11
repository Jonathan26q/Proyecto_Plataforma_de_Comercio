package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.servicios.implementaciones;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto.*;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Negocio;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.repositorios.ClienteRepo;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.repositorios.NegocioRepo;
import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.servicios.interfaces.NegocioServicio;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class NegocioServicioImpl implements NegocioServicio {

    private final NegocioRepo negocioRepo;

    public NegocioServicioImpl (NegocioRepo negocioRepo){this.negocioRepo = negocioRepo; }

    private Negocio traerCodigoNegocio(String codigo)throws Exception{
        Optional<Negocio> optionalNegocio = negocioRepo.findByCodigo(codigo);
        if (optionalNegocio.isPresent()){
            return optionalNegocio.get();
        }
        else {
            throw new Exception("El codigo del negocio " + codigo + " no se encuentra");
        }
    }


    @Override
    public String crearNegocio(CrearNegocioDTO crearNegocioDTO) throws Exception {

        //instanciamos el negocio
        Negocio negocio = new Negocio();

        negocio.setNombre(crearNegocioDTO.nombreNegocio());

        Negocio negocioGuardado = negocioRepo.save(negocio);

        return negocioGuardado.getCodigo();

    }

    @Override
    public void actualizarNegocio(EditarNegocioDTO editarNegocioDTO) throws Exception {

    }

    @Override
    public void eliminarNegocio(String idNegocio) throws Exception {

    }

    @Override
    public DetalleNegocioDTO buscarNegocios(String idNegocio) throws Exception {
        return null;
    }

    @Override
    public List<ItemNegocioDTO> listarNegocios() {
        return null;
    }

    @Override
    public List<ItemClienteDTO> listarCliente() {
        return null;
    }

    @Override
    public String compartirNegocio() {
        return null;
    }

    @Override
    public void listarNegocioPorEstado() throws Exception {

    }

    @Override
    public void aprobar(CambioEstadoDTO cambioEstadoDTO) throws Exception {

    }

    @Override
    public void rechazar(CambioEstadoDTO cambioEstadoDTO) throws Exception {

    }
}
