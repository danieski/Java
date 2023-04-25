public class Empleado extends Persona{
    public int sueldo;
    public String rol;
    public Empleado (String nombre,String descripcion,int sueldo,String rol){ //Esto parece ser un constructor
        super(nombre,descripcion);
        this.sueldo=sueldo;
        this.rol=rol;
    }
    public int dameSueldo(){ //Estos son metodos GETTER
        return sueldo;
    }
    public String dameRol(){ //Estos son metodos GETTER
        return rol;
    }
    public String mostrarDatos(){
        return "Nombre: " + nombre + " Descripcion: " + descripcion + "\nRol: " + rol + " Sueldo: " + sueldo;
    }

}