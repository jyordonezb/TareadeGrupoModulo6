
package helpers;


public class Estudiante extends Persona {
    
    private String carrera;
    private String clase;
  
    
    
    public Estudiante(String carrera, String clase){
        
        
        establecerNombre("Jose Yovany");
        establecerApellido("Ordonez Bautista");
        
        this.carrera = carrera;
        this.clase = clase;
        
        
       
        
   
    }
    public void mostrarEstudiante(){
        
        System.out.println("Carrera: "+carrera);
        System.out.println("Clase: "+clase);
        
    }

    @Override
    public String obtenerInformacionPersona() {
        return "Informacion para Estdiante";
    }
    
            
  
    
}
