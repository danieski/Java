import java.util.*;
public class cooperativa {
    public static void main(String[] args) {
        ArrayList<Productor> listaProductores=new ArrayList<Productor>();

        listaProductores.add(new Productor("Daniel",3));
        listaProductores.add(new Productor("Paco",2)); 
        listaProductores.add(new Productor("Hitller",9)); 
        
        System.out.println(listaProductores.size());
        for (Productor e: listaProductores){
            System.out.println(e.getNombre() + e.getExtension());
        }
    }
}
