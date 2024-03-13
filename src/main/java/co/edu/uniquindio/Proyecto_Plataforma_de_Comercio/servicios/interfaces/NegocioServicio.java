package co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.servicios.interfaces;

public interface NegocioServicio {

    void crearNegocio();

    void actualizarNegocio();

    void eliminarNegocio(String idNegocio);

    void buscarNegocios();

    void listarNegocios();

    void listarUsuario();

    void listarNegocioPorEstado();
}
