import java.util.*;

public class prueba
{
    public static void main(String[] args) {
        Empleados trabajador1=new Empleados("paco");
        Empleados trabajador2=new Empleados("maria");
        //trabajador1.cambiaSeccion("Adolg");
        //trabajador1.cambiarNombre("Klaus");
        System.out.println(trabajador1.devuelveDatos());
        //Empleados.id++;
        System.out.println(trabajador2.devuelveDatos());
        
    }
}
    class Empleados{
        
        public Empleados(String nom){ //constructor
            
            nombre=nom;
            //identificador=id;
            
            seccion="Administracion";
            id=IdSiguiente+1;
            IdSiguiente++;
        }
        private String nombre;
        private String seccion;
        private int id;
        private static int IdSiguiente=0;
        
        public void cambiaSeccion(String seccion){
            this.seccion=seccion;
            
        }
        
        public String devuelveDatos(){
            return "El nombre es: " + nombre + " y la seccion es " + seccion +" ye el id" + id;
            
        }
        
        public void cambiarNombre(String nombre){
            this.nombre=nombre;
        }
    }
