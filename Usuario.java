package App;

public class Usuario  extends Persona {
    public String correo;
    public String contraseña;
    public Usuario(String nombre, int edad, String sexo, String correo, String contraseña){
        super(nombre, edad, sexo);
        this.correo = correo;
        this.contraseña = contraseña;

    }
    public void seguridad(){
        System.out.println(" correo: "+ correo + " contraseña: " + contraseña );
    }
    
}
