
package helpers;


public class Doctor extends Persona {
    
    private String especialidad;
    
    public Doctor (String especialidad){
        
        
        establecerNombre("José Antón");
        establecerApellido("Magarzo");
        
        this.especialidad = especialidad;
    }
    
    public void MostrarDoctor(){
        System.out.println("Especialidad: "+especialidad);
    }

    @Override
   public String obtenerInformacionPersona() {
        return "Informacion Para Doctor";
    }
}
