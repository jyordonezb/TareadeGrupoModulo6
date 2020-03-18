
package helpers;


public class Estudiante extends Persona {
    
    private String Carrera;
    private String Clase;
    private int  Cuenta;
    
    //Metodos Estudiante

    public Estudiante(String Nombre, String Apellido, int Edad, String Carrera, String Clase, int Cuenta) {
        super(Nombre, Apellido, Edad);
        this.Carrera = Carrera;
        this.Clase = Clase;
        this.Cuenta = Cuenta;
    }

   

    
    
    //Mostras Datos
    
    public void MostrarDatosEstudiante(){
        System.out.println("Nombre: "+getNombre()+"Apellido: "+getApellido()+
                "\nEdad: "+getEdad()+"Carrera: "+Carrera+"Clase: "+Clase+
                "\nCuenta: "+Cuenta);
    }
     
    }
            
            
    
    

