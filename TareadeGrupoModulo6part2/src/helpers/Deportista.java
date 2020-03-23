
package helpers;


public class Deportista extends Persona{
    
    
    public Deportista(){
    
        setNombre("Darwin");
        setApellido("Flores");
        setEdad(22);
    }    

    @Override
    public String getNacionalidad() {
        return "Nacionalidad Brasileña";
    }
    
    
}
