
/**
 * Write a description of class Estudiante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estudiante extends Persona
{
    private String colegio;
    private int codigo;
    public Estudiante(String nombre,String apellido,int edad,String colegio,int codigo ){
      super(nombre,apellido,edad);
      this.colegio = colegio;
      this.codigo = codigo;
    }
    public String mostrarDatos(){
        return " Colegio: " + colegio + " Codigo: " + codigo;
    }
}
