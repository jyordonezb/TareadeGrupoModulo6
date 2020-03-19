
import helpers.Deportista;
import helpers.Estudiante;


public class Modulo6 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante estudiante = new Estudiante("Ing.Computacion","Programacion Objetos");
        Deportista deportista = new Deportista("Futbol","Barcelona");
        
        
            System.out.println("Estudiante #1");
            System.out.println("///////////");
           
     
        
        estudiante.MostrarDatos();
        estudiante.mostrarEstudiante();
        deportista.MostrarDatos();
        deportista.MostrarDeportista();
    }
    
}
