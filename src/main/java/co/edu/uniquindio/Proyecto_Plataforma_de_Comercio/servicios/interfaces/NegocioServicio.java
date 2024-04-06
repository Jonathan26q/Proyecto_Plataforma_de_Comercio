package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.servicios.interfaces;

import co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.dto.*;

import java.util.List;

public interface NegocioServicio {

    String crearNegocio(CrearNegocioDTO crearNegocioDTO) throws Exception;
    void actualizarNegocio(EditarNegocioDTO editarNegocioDTO)throws Exception;
    void eliminarNegocio(String idNegocio)throws Exception;
    DetalleNegocioDTO buscarNegocios(String idNegocio)throws Exception;
    List<ItemNegocioDTO> listarNegocios();
    List <ItemClienteDTO> listarCliente();
    String compartirNegocio();
    void listarNegocioPorEstado()throws Exception; //preguntar como listar por estado
    void aprobar(CambioEstadoDTO cambioEstadoDTO)throws Exception;
    void rechazar(CambioEstadoDTO cambioEstadoDTO)throws Exception;
}