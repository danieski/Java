
public class Vehiculo
{
    protected String matricula;
    protected String marca;
    protected String modelo;
    public Vehiculo (String matricula,String marca,String modelo){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
    }
    public String mostrarDatos(){
        return "Matricula: " + matricula 
        + "\nMarca: " + marca + 
        "\nModelo: " + modelo; 
    }
}
