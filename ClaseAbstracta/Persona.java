public class Persona {
    public String nombre;
    public String descripcion;
    public String rol;
    public int sueldo;

    public Persona (String nombre,String descripcion){
        this.nombre=nombre;
        this.descripcion=descripcion;
    }


    public String dameNombre(){
        return nombre;
    }
    public String dameDescripcion(){
        return descripcion;
    }


    public String mostrarDatos(){
        return " Nombre: " + nombre + " Descripcion: " + descripcion;
    }
} 
