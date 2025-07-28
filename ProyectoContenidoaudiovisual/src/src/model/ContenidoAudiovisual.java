package src.model;

public abstract class ContenidoAudiovisual {
    private static int contador = 0;
    private int id;
    private String titulo;
    private int duracionEnMinutos;
    private String genero;

    public ContenidoAudiovisual(String titulo, int duracionEnMinutos, String genero) {
        this.id = ++contador;
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
        this.genero = genero;
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public int getDuracionEnMinutos() { return duracionEnMinutos; }
    public String getGenero() { return genero; }

    public abstract void mostrarDetalles();
}
