import java.util.*;

public class random
{
    public static void main(String[] args) {
        
        
        int random=(int)(Math.random()*100);
        int numero=0;
        int intentos=0;
        System.out.println(random);
        Scanner entrada=new Scanner(System.in);
        while(numero!=random){    
           System.out.println("Introduce un numero");
           
           numero=entrada.nextInt();
           
           if (numero>random){
               System.out.println("el num secreto es mas peque");
               intentos++;
           }else{
               System.out.println("El num secresto es mas grande");
               intentos++;
           }
           System.out.println("Numero de intentos" + intentos);
        
        }
        
        
    }
}
