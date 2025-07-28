package src.controller;

import java.util.List;
import src.model.ContenidoAudiovisual;
import src.model.RepositorioCSV;
import src.view.IVista;

public class ContenidoController {
    private IVista vista;
    private RepositorioCSV repositorio;

    public ContenidoController(IVista vista, RepositorioCSV repositorio) {
        this.vista = vista;
        this.repositorio = repositorio;
    }

    public void mostrarContenidos() {
        List<ContenidoAudiovisual> contenidos = repositorio.cargarContenidos();
        vista.mostrarContenidos(contenidos);
    }
}
