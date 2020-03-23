
package helpers;

public class Deportista extends Persona {
    //atributos deportista
    private String deporte;
    private String equipo;
    //metodos heredados de clase persona
    public Deportista(String deporte, String equipo){
        
        establecerNombre("Cristhian David");
        establecerApellido("Navarro Rodas");
        
        this.deporte = deporte;
        this.equipo = equipo;
        
        
    }
    //metodo mostrar Datos Deportista
    public void MostrarDeportista(){
        System.out.println("Deporte: "+deporte);
        System.out.println("Equipo: "+equipo);
    }
// metodo abstracto
    @Override
    public String obtenerInformacionPersona() {
        return "----------Informacion Para Deportista-------------";
    }
    
    
    
}
