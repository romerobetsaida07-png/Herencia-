package App;

public class Persona {
    public String nombre;
    public int edad;
    public String sexo;
    public Persona(String nombre, int edad, String sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;

    }
    public void saludar(){
        System.out.println("Hola, soy: " + nombre + " Mi edad es: " + edad + " sexo: " + sexo);
    }
    
}
