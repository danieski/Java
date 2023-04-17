import java.util.*;
import javax.swing.JOptionPane;
public class array
{
    public static void main(String[] args) {
        
        String [] paises=new String[4];
        
        for (int i=0;i<4;i++){
            
            paises[i]=JOptionPane.showInputDialog("Introduce pais");
            
        }
        
        for (String elemento:paises){
            System.out.println("Pais: " + elemento);
        }
    }
}
