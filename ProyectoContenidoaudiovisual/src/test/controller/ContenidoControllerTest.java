package test.controller;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.List;
import org.junit.jupiter.api.Test;
import src.controller.ContenidoController;
import src.model.ContenidoAudiovisual;
import src.model.RepositorioCSV;
import src.view.IVista;

class ContenidoControllerTest {

    static class VistaMock implements IVista {
        List<ContenidoAudiovisual> contenidosRecibidos;
        @Override
        public void mostrarContenidos(List<ContenidoAudiovisual> contenidos) {
            contenidosRecibidos = contenidos;
        }
    }

    @Test
    void testMostrarContenidos() {
        VistaMock vistaMock = new VistaMock();
        RepositorioCSV repo = new RepositorioCSV("src/contenidos.csv");

        ContenidoController controller = new ContenidoController(vistaMock, repo);
        controller.mostrarContenidos();

        assertNotNull(vistaMock.contenidosRecibidos);
        assertFalse(vistaMock.contenidosRecibidos.isEmpty());
        assertEquals(3, vistaMock.contenidosRecibidos.size());
    }
}
