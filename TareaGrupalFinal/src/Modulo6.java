
import helpers.Deportista;
import helpers.Doctor;
import helpers.Estudiante;


public class Modulo6 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante estudiante = new Estudiante("Ing.Computacion","Programacion Objetos");
        Deportista deportista = new Deportista("Futbol","Barcelona");
        Doctor doctor = new Doctor ("Cirugía General");
        
        
            System.out.println("Estudiante #1");
            System.out.println("///////////");
           
         
           System.out.println(estudiante.obtenerInformacionPersona());
     
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
