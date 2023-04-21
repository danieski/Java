import java.util.*;

public class prueba
{
    public static void main(String[] args) {
        Empleados trabajador1=new Empleados("paco", 2400, "Palomares");
        Empleados trabajador2=new Empleados("maria", 1900, "KGB");
        Empleados trabajador3=new Empleados("Fermin");
        //trabajador1.cambiaSeccion("Adolg");
        //trabajador1.cambiarNombre("Klaus");
        System.out.println(trabajador1.devuelveDatos());
        //Empleados.id++;
        System.out.println(trabajador2.devuelveDatos());
        System.out.println(trabajador3.devuelveDatos());
    }
}
    class Empleados{
        
        public Empleados(String nom,int suel,String ag){ //constructor
            
            nombre=nom;
            sueldo=suel;
            agencia=ag;
            //identificador=id;
            
            seccion="Administracion";
            id=IdSiguiente+1;
            IdSiguiente++;
        }
        public Empleados(String nom){
            this(nom,666,"Satanismo");
        }
        private String nombre;
        private String seccion;
        private int id;
        private static int IdSiguiente=0;
        private int sueldo;
        private String agencia;
        public void cambiaSeccion(String seccion){
            this.seccion=seccion;
            
        }
        
        public String devuelveDatos(){
            return "El nombre es: " + nombre + "Su sueldo es de: " + sueldo + " la agencia contratista es: " + agencia + " y la seccion es " + seccion +" ye el id" + id;
            
        }
        
        public void cambiarNombre(String nombre){
            this.nombre=nombre;
        }
    }
