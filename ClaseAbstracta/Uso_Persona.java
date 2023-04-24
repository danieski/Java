import javax.management.Descriptor;

public class Uso_Persona
{
  public static void main(String[] args) {

    Persona persona1 = new Persona ("Daniel", "Es guapo");
    Empleado persona2 = new Empleado ("Pedro", "es listo",1000,"Chapero");
    System.out.println(persona2.dameNombre() + persona2.dameDescripcion() + persona2.dameSueldo() + persona2.dameRol());
    
}



}