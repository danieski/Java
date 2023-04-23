
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    //Creamos objeto perdona
    public Persona(String nombre,String apellido,int edad){//Esto es un constructor
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad= edad;
    }
    /*
    //Persona LasPersonas=new Persona ("Test","apellido",12);
    Persona Persona1 =new Persona("Pedro", "Gomez", 12);
    System.out.println("Nombre: " + Persona1.getNombre());
    //+ " Apellido: " + Persona.getApellido + " Edad: " + getEdad);
    //LasPersonas[0]=new Persona(
    */
    public String getNombre(){ //Getter
        return nombre;
    }
    public String getApellido(){//Getter
        return apellido;
    }
    public int getEdad(){//Getter
        return edad;
    }
    private String nombre;
    private String apellido;
    private int edad;
}
