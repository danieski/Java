import java.util.*;

public class Uso_Empleado
{
    public static void main(String[] args) {
        /*
        Empleado empleado1 =new Empleado("Pedro gomez", 18000, 2020, 02, 12);
        Empleado empleado2 =new Empleado("ana gomez", 28000, 1020, 03, 14);
        
        
        
        System.out.println("Nombre :" + empleado1.dameNombre() + "Sueldo :" + 
        empleado1.dameSueldo() + " Alta: " + empleado1.dameFechaContrato());
    
        empleado1.subeSueldo(5);
        
        System.out.println("Nombre :" + empleado1.dameNombre() + "Sueldo :" + 
        empleado1.dameSueldo() + " Alta: " + empleado1.dameFechaContrato());
    */
       Empleado[] misEmpleados=new Empleado[3];
       misEmpleados[0]=new Empleado("Paco Gomez", 9000, 1999, 12, 10);
       misEmpleados[1]=new Empleado("Ana Gomez", 2000, 1993, 11, 12);
       
       for (int x=0; x<2; x++){
           System.out.println("Nombre: " + misEmpleados[x].dameNombre());
           
       }
    }
}

class Empleado{
    public Empleado(String nom, double sue, int agno, int mes, int dia){
        nombre=nom;
        
        sueldo=sue;
        
        GregorianCalendar calendario=new GregorianCalendar(agno, mes-1,dia);
        
        altaContrato=calendario.getTime();
        
        ++IdSiguiente;
        
        Id=IdSiguiente;
          
    }
    public String dameNombre() {
        return nombre + " id: " + Id;
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
    private String nombre;
    private double sueldo;
    private Date altaContrato;
}

class Jefatura extends Empleado{
    public Jefatura(String nom, double sue, int agno, int mes, int dia){
        super (nom, sue,agno,mes,dia);
    }
    
    public void estableceIncentivo(double b){
        incentivo=b;
    }
    private double incentivo;
    public double dameSoueldo(){
        double sueldoJefe=super.dameSueldo(); //llama a dame sueldo de la clase Empleado
        
        return sueldoJefe + incentivo;
        
    }
    
}