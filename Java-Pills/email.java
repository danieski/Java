import java.util.*;
import javax.swing.JOptionPane;

public class email
{
    public static void main(String[] args){
        boolean arroba=false;
        
       
    do {
            String mail=JOptionPane.showInputDialog("Introduce email");
            
        
        for (int i=0;i<mail.length();i++){
            
            if(mail.charAt(i)=='@'){
                arroba = true;
                
            }
        }
        
        if (arroba==false){
            System.out.println("Es incorrecto");
        }
    //}while(arroba=false);
        else{
        System.out.println("Es correcto");
    }
}while(arroba==false);
    }
}

