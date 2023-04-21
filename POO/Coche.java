
/**
 * Write a description of class Coche here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coche
{
    // instance variables - replace the example below with your own
    private int ruedas;
    private int peso;
    String color;
    /**
     * Constructor for objects of class Coche
     */
    public Coche()
    {
        // initialise instance variables
        ruedas = 4;
        
        peso=500;
        
        //color="verde";
    }
    public String dime_peso(){ //GETTER
         return "El peso del coche es " + peso;   
    }
    public void establece_color(){ //SETTER
        
        color="azul";
    }
    public String dime_color(){
        return "El color del coche es " + color;
    }
    public String dime_general(){
        return "El coche tiene " + ruedas +" ruedas y pesa " + peso + " kilos. " ;
    }
}
