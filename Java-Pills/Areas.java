import java.util.*;

public class Areas
{
    public static void main(String[] args){

        // initialise instance variables
        //x= 13.34;
        //raiz=Math.sqrt(x);
        //System.out.println(raiz);
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Circulo o cuadrado? ");
        int choice=entrada.nextInt();
        if (choice == 2){
        System.out.println("Introduce eje y");
        int yr=entrada.nextInt();
        
        
        System.out.println("Introduce eje x");
        int xr=entrada.nextInt();
        
        int area = xr*yr;
        System.out.println("El area es " + (area) );
    }else{
        System.out.println("Introduce radio");
        int radio=entrada.nextInt();
 
        double area = radio*radio*3.14;
        System.out.println("El area es " + (area) );
    }
        
    }
        
    }


