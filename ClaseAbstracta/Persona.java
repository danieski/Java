public class Persona {
    public String nombre;
    public String descripcion;
    public Persona (String nombre,String descripcion){
        this.nombre=nombre;
        this.descripcion=descripcion;
    }
    
    public String dameNombre(){
        return "Nombre: " + nombre;
    }
    public String dameDescripcion(){
        return "\nDescripcion: " + descripcion;
    }


} 
