
/**
 * Write a description of class Turismo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turismo extends Vehiculo
{
  public int numeroPuertas;
  public Turismo (String matricula,String marca,String modelo,int numeroPuertas){
      super(matricula,marca,modelo);
      this.numeroPuertas=numeroPuertas;
      
  }
  public String mostrarDatos(){
        return "Matricula: " + matricula 
        + "\nMarca: " + marca + 
        "\nModelo: " + modelo + "\nNumero de puertas: " + numeroPuertas;
  }
  }
