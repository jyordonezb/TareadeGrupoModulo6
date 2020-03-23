
package helpers;

public abstract class Persona {
    
    //Atributos
    
    private String nombre;
    private String apellido;
     
    
    public Persona(){
        
    }
    
    //Metodos Establecer Obtener
    
    public void establecerNombre(String nombre){
        this.nombre = nombre;
        
    }
    
    public String obtenerNombre(){
        return this.nombre;
    }
    public void establecerApellido(String apellido){
        this.apellido = apellido;
        
    }
    
    public String obtenerApellido(){
        return this.apellido;
    }
    
    
    
    //MostrarDatos
    
    public void MostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
       
    }
    //metodo abstracto
    abstract String obtenerInformacionPersona();
        
        
    
    
    
}
