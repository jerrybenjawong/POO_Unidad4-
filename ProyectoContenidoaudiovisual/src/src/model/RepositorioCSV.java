package src.model;

import java.io.*;
import java.util.*;

public class RepositorioCSV {
    private String rutaArchivo;

    public RepositorioCSV(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public List<ContenidoAudiovisual> cargarContenidos() {
        List<ContenidoAudiovisual> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                String tipo = partes[0].toLowerCase();
                String titulo = partes[1];
                int duracion = Integer.parseInt(partes[2]);
                String genero = partes[3];

                switch (tipo) {
                    case "pelicula":
                        lista.add(new Pelicula(titulo, duracion, genero, partes[4]));
                        break;
                    case "serie":
                        lista.add(new SerieDeTV(titulo, duracion, genero, Integer.parseInt(partes[4])));
                        break;
                    case "documental":
                        lista.add(new Documental(titulo, duracion, genero, partes[4]));
                        break;
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo CSV: " + e.getMessage());
        }
        return lista;
    }
}
