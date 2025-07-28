package src.view;

import java.util.List;
import src.model.ContenidoAudiovisual;

public class ConsolaVista implements IVista {
    @Override
    public void mostrarContenidos(List<ContenidoAudiovisual> contenidos) {
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}
