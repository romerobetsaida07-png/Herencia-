package App;

public class LibroDigital  extends Libro {
    public String formato;
    public double tamanioMB;
    public LibroDigital(String titulo, String autor, int anio, String formato, double tamanioMB){
        super(titulo, autor, anio);
        this.formato = formato;
        this.tamanioMB = tamanioMB;
    }
    public void mostrarInfo(){
        System.out.println("El libro digital se llama: " + titulo + " Su autor es: " + autor + " Anio de publicacion: " + anio +
         " Formato: " + formato + " Tamanio en MB: " + tamanioMB);
    }
    
}
