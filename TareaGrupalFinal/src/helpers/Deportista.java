
package helpers;

public class Deportista extends Persona {
    
    private String deporte;
    private String equipo;
    
    public Deportista(String deporte, String equipo){
        
        establecerNombre("Leonel");
        establecerApellido("Messi");
        
        this.deporte = deporte;
        this.equipo = equipo;
        
        
    }
    
    public void MostrarDeportista(){
        System.out.println("Deporte: "+deporte);
        System.out.println("Equipo: "+equipo);
    }

    @Override
    public String obtenerInformacionPersona() {
        return "Informacion Para Deportista";
    }
    
    
    
}
