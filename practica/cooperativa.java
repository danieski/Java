import java.util.*;
import javax.swing.JOptionPane;
public class cooperativa {

    static public ArrayList<Productor> listaProductores = new ArrayList<Productor>();
    static public ArrayList<Producto> listaProductos = new ArrayList<Producto>();
    public static void main(String[] args) {
        //Para el tipo federados

        //Preguntamos el usuario que se va a federar
        //String productorFederado = JOptionPane.showInputDialog("Usuario que se va a federar:");


        //Inicializacion de los arrays

        //Array Productos

        ArrayList<Productor.ProductoExtension> productos = new ArrayList<>();
        //productos.add(new Productor.ProductoExtension("Trigo", 10));
        //productos.add(new Productor.ProductoExtension("Maíz", 25));
        AgregarProductor();

        /*
        listaProductos.add(new Producto("Algodon", 1, 1));
        for (Productor e : listaProductores){
            System.out.println(e.getNombre() + e.getExtension());
        }
        */

        //Array Productores

        listaProductores.add(new Productor("Daniel",productos));
        for (Productor e : listaProductores) {
            System.out.println(e.getNombre() + e.getExtension());
        }

        /*
        listaProductores.add(new PequeProductor("Paco", 2));
        listaProductores.add(new GranProductor("Hitller", 9));
        Producto prod = new Producto("Manzanas", 1,1);
        listaProductores.add(new FederacionProductores("Federacion Algodon", 3,listaProductores,prod));
        */

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
    public static void mostrarDatos(ArrayList<Productor> listaProductores) {
        for (Productor productor : listaProductores) {
            System.out.println("Nombre: " + productor.getNombre() + ", Extensión Total: " + productor.getExtension());
            System.out.println("Productos:");
            for (Productor.ProductoExtension producto : productor.getProductos()) {
                System.out.println("- " + producto.getNombre() + ": " + producto.getExtension());
            }
        }
    public static void AgregarProducto() {
        String nombreP = JOptionPane.showInputDialog("Ingrese nombre producto:");
        double rendimientoHectarea = Double.parseDouble(JOptionPane.showInputDialog("Ingresa rendiento producto"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa precio producto"));
    }
    public static void AgregarProductor() {
        ArrayList<Productor.ProductoExtension> productos = new ArrayList<>();
        String nombre = JOptionPane.showInputDialog("Ingrese nombre productor:");
        //double extensionTotal = Double.parseDouble(JOptionPane.showInputDialog("Ingresa cantidad Hectareas"));
        String nombreProducto = JOptionPane.showInputDialog("Ingresa el producto del productor");
        double extensionProducto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa cantidad Hectareas:", "Ingreso de número", JOptionPane.PLAIN_MESSAGE));
        productos.add(new Productor.ProductoExtension(nombreProducto, extensionProducto));
        listaProductores.add(new Productor(nombre,productos));


    }
}