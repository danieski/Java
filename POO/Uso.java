
/**
 * Write a description of class UsoCoche here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Uso
{
    public static void main(String[] args) {
        
        Coche micoche=new Coche();
        
        furgoneta mifurgoneta= new furgoneta(6,50);
        
        
        micoche.establece_color();
        
        
        System.out.println(micoche.dime_general() + micoche.dime_color());
        
        System.out.println(mifurgoneta.dime_general() + mifurgoneta.dameInfoFurgo());
        
    }
}
