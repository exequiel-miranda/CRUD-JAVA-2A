package controlador;

public class Persona {
    
    String nombre;
    String colorPiel;
    int edad;
    double salario;
    String tipoSangre;
    
    //Constructor
    public Persona(String nombreQuePido, int edadQuePido){
        this.nombre = nombreQuePido;
        this.edad = edadQuePido;
    }
    
      public Persona(String color){
        this.colorPiel = color;
    }
    
    
    
}
