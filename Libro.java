package App;

public class Libro {
    public String titulo;
    public String autor;
    public int anio;
    public Libro(String titulo, String autor, int anio){
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;

    }
    public void mostrarInfo(){
        System.out.println("El libro se llama: " + titulo + " Su autor es: " + autor + " Anio de publicacion: " + anio);
    }
    
}
