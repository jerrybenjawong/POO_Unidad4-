package src.app;

import src.controller.ContenidoController;
import src.view.ConsolaVista;
import src.model.RepositorioCSV;

public class App {
    public static void main(String[] args) {
        ConsolaVista vista = new ConsolaVista();
        RepositorioCSV repositorio = new RepositorioCSV("src/contenidos.csv");
        ContenidoController controller = new ContenidoController(vista, repositorio);
        controller.mostrarContenidos();
    }
}
