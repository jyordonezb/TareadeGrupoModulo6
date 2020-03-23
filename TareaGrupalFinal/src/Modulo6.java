
import helpers.Deportista;
import helpers.Doctor;
import helpers.Estudiante;


public class Modulo6 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //objetos 
        Estudiante estudiante = new Estudiante("Ing.Computacion","Programacion Objetos");
        Deportista deportista = new Deportista("Futbol","Barcelona");
        Doctor doctor = new Doctor ("Cirugía General");
        
        
            
            System.out.println("///////////");
           
         
           System.out.println(estudiante.obtenerInformacionPersona());
     // imprimir diferentes datos creados
        estudiante.MostrarDatos();
        estudiante.mostrarEstudiante();
        System.out.println(deportista.obtenerInformacionPersona());
        deportista.MostrarDatos();
        deportista.MostrarDeportista();
        System.out.println(doctor.obtenerInformacionPersona());
        doctor.MostrarDatos();
        doctor.MostrarDoctor();
    }
    
}
