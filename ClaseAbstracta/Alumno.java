public class Alumno extends Persona{
    public int codigo;
    public String colegio;
    public Alumno (String nombre,String descripcion,int codigo,String colegio){ //Esto parece ser un constructor
        super(nombre,descripcion);
        this.codigo=codigo;
        this.colegio=colegio;
    }
    public int dameCodigo(){ //Estos son metodos GETTER
        return codigo;
    }
    public String dameColegio(){ //Estos son metodos GETTER
        return colegio;
    }
    public String mostrarDatos(){
        return "Nombre: " + nombre + " Descripcion: " + descripcion + "\nCodigo: " + codigo + " Colegio: " + colegio;
    }
}
