
/**
 * Write a description of class uso_Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class uso_Persona
{
    public static void main(String[] args) {
            //Persona LasPersonas=new Persona ("Test","apellido",12);
    Persona Persona1 =new Persona("Pedro", "Gomez", 12);
    Estudiante Persona2 =new Estudiante("Dani", "Esquivel", 13, "Fernando de los Rios", 01);
    System.out.println("Nombre: " + Persona1.getNombre() + " Apellido: " + Persona1.getApellido() + " Edad: " + Persona1.getEdad());
    
    //Porque no me ha hecho falta refundicion? Pliformismo
    System.out.println("Nombre: " + Persona2.getNombre() + " Apellido: " + Persona2.getApellido() + " Edad: " + Persona2.getEdad() + Persona2.mostrarDatos());
    //+ " Apellido: " + Persona.getApellido + " Edad: " + getEdad);
    //LasPersonas[0]=new Persona(
    }
}
