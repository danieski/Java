

public class Uso_Persona
{
  public static void main(String[] args) {
    /*
    Persona persona1 = new Persona ("Daniel", "Es guapo");
    Empleado persona2 = new Empleado ("Pedro", "es listo",1000,"Chapero");
    System.out.println(persona2.dameNombre() + persona2.dameDescripcion() + persona2.dameSueldo() + persona2.dameRol());
    */
    //Empleado LosEmpleados= new Empleado("Fran", "Es trabajador",1200, "Mecanico");0 
    //System.out.println(persona1.dameNombre() + persona1.dameDescripcion() + persona1.dameCodigo() + persona1.dameColegio());
    Persona[] LasPersona=new Persona[5];
    LasPersona[0]= new Persona ("Daniel", "Es guapo");
    LasPersona[1]= new Empleado ("Pedro", "es listo",1000,"Chapero");
    LasPersona[2]= new Alumno ("Gerardo", "Es negro", 45, "Copelita");

    //System.out.println(LasPersona[0].mostrarDatos());
    //System.out.println(LasPersona[1].mostrarDatos());
    for (Persona e:LasPersona){
        System.out.println(e.mostrarDatos());
    }
}



}