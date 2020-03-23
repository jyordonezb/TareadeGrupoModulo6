
package helpers;


public class Doctor extends Persona {
    //atributos clase Doctor
    private String especialidad;
    
    //metodos heredados
    public Doctor (String especialidad){
        
        
        establecerNombre("Luis Adan");
        establecerApellido("Sanchez Rodas");
        
        this.especialidad = especialidad;
    }
    //Mostrar Datos
    public void MostrarDoctor(){
        System.out.println("Especialidad: "+especialidad);
    }
// metodo abstracto
    @Override
   public String obtenerInformacionPersona() {
        return "------------Informacion Para Doctor-------------";
    }
}
