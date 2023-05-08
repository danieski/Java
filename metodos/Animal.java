
public class Animal
{   
    private String Nombre;
    private String raza;
    private int edad;
    //constuctor
    public Animal(String Nombre){
        this.Nombre=Nombre;
    }

    //Getter
    public int getEdad()
    {
        return edad;
    }
    //setter
    public void setEdad( int nuevaEdad)
    {
        edad = nuevaEdad;
    }
    public String getNombre()
    {
        return Nombre;
    }
}