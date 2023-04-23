import java.util.*;
/**
 * Write a description of class Uso_Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Uso_Persona
{
  public static void main(String[] args) {
        Persona[] lasPersonas=new Persona[2]; //creamos el array
        lasPersonas[0]=new Empleado2("Luis Conde", 5000, 2009, 02, 25);
        lasPersonas[1]=new Alumno("Josefa pechugona","Geologia");
        
 }
 
     abstract class Persona{
         
        public Persona (String nom){//Metodo setter
             
             nombre=nom;
             
        }
        public String damenombre(){//Metodo Getter
            return nombre;
        }
        public String nombre;
        public abstract String dameDescripcion();
        
     }
 
     class Empleado2 extends Persona{
        public Empleado2(String nom, double sue, int agno, int mes, int dia){
            super(nom);
            
            sueldo=sue;
            
            GregorianCalendar calendario=new GregorianCalendar(agno, mes-1,dia);
            
            altaContrato=calendario.getTime();
            
            ++IdSiguiente;
            
            Id=IdSiguiente;
              
        }
        public String dameDescripcion(){
            return "Esta persona se llama" + nombre + "y tiene id " + Id;
        }
        public double dameSueldo(){
            return sueldo;
        }
        
        public Date dameFechaContrato(){
            
            return altaContrato;
        }
        public void subeSueldo(double porcentaje){
            
            double aumento=sueldo*porcentaje/100;
            
            sueldo+=aumento;
        }
        private int Id;
        private static int IdSiguiente=1;
        private double sueldo;
        private Date altaContrato;
    }
    class Alumno extends Persona{
            public Alumno(String nom, String car){
            super(nom);
            
            carrera=car;
        }
        public String dameDescripcion(){
            return "Este alumno esta estudiando la carrera de " + carrera;
        }
        private String carrera;
    }

}
    
