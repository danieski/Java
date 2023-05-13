import java.util.*;
import javax.swing.JOptionPane;
public class cooperativa {

    static public ArrayList<Productor> listaProductores = new ArrayList<Productor>();
    static public ArrayList<Producto> listaProductos = new ArrayList<Producto>();
    public static void main(String[] args) {

        //Inicializacion de los arrays

        //Array Productores

        listaProductores.add(new Productor("Daniel", 3));
        listaProductores.add(new PequeProductor("Paco", 2));
        listaProductores.add(new GranProductor("Hitller", 9));
        //listaProductores.add(new FederacionProductores("Federacion Algodon", 3,[0],)

        //Array Productos
        listaProductos.add(new Producto("Algodon", 1, 1));

        //Agregando Productores
       /*

        AgregarProductor();
        System.out.println(listaProductores.size());
        for (Productor e : listaProductores) {
            System.out.println(e.getNombre() + e.getExtension() + e.getClass());
        }

        //Agregando Productos
        AgregarProducto();
        System.out.println(listaProductos.size());
        for (Producto e : listaProductos) {
            System.out.println(e.getNombreProducto() + e.getRendimientoHectarea() + e.getClass());
        }*/
    }
    public static void AgregarProducto() {
        String nombreP = JOptionPane.showInputDialog("Ingrese nombre producto:");
        double rendimientoHectarea = Double.parseDouble(JOptionPane.showInputDialog("Ingresa rendiento producto"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa precio producto"));
    }
    public static void AgregarProductor() {
        String nombre = JOptionPane.showInputDialog("Ingrese nombre productor:");
        double extensionTotal = Double.parseDouble(JOptionPane.showInputDialog("Ingresa cantidad Hectareas"));
        if (extensionTotal > 5){
            listaProductores.add(new GranProductor(nombre, extensionTotal));
        }else{
            listaProductores.add(new PequeProductor(nombre, extensionTotal));
        }

    }
}