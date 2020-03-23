
package helpers;


public class Estudiante extends Persona {
    //atributos estudiante
    private String carrera;
    private String clase;
  
    
    // metodos estudiante,heredados de calse Persona
    public Estudiante(String carrera, String clase){
        
        
        establecerNombre("Jose Yovany");
        establecerApellido("Ordonez Bautista");
        
        this.carrera = carrera;
        this.clase = clase;
        
        
       
        
   //metodo mostrar Datos
    }
    public void mostrarEstudiante(){
        
        System.out.println("Carrera: "+carrera);
        System.out.println("Clase: "+clase);
        
    }
// metodo abstracto
    @Override
    public String obtenerInformacionPersona() {
        return "--------Informacion para Estudiante----------";
    }
    
            
  
    
}
