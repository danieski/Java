import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Federacion {
    private static ArrayList<Federacion> listaFederacion = new ArrayList<>();
    private Producto producto;
    private String nombre;
    ArrayList<Hectareas> miembrosFederacion;

    private double extensionTotal;
    public Federacion(String nombre, ArrayList<Hectareas> miembrosFederacion, double extensionTotal) {
        this.nombre=nombre;
        this.miembrosFederacion=miembrosFederacion;
        this.extensionTotal=extensionTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Hectareas> getMiembrosFederacion() {
        return miembrosFederacion;
    }

    public double getExtensionTotal() {
        return extensionTotal;
    }

    public static ArrayList<Federacion> getListaFederacion() {
        return listaFederacion;
    }


    public Producto getProducto() {
        return producto;
    }


    public static void agregarFederacion(){
        Hectareas hectareas = new Hectareas();
        double extensionTotal = 0;
        int idProductor = 0 ;
        boolean fin = true;
        Scanner scanner = new Scanner(System.in);
        //Mostramos la lista de productos federables
        Producto.mostrarProductos();

        System.out.print("Ingrese el id del producto: ");
        int idProducto = scanner.nextInt();
        //Mostramos las entradas con los productores que producen dicho producto
        ProductorPeque productorPeque = new ProductorPeque();
        for (ProductorPeque productorPeque1:productorPeque.getListaProductoresPeques() ) {
            if (productorPeque1.getHectareas().contains(Producto.getListaProductos().get(idProducto))) {
                System.out.println(idProductor + " " + productorPeque1.getNombre());
            }
            idProductor++;
        }
        //Elegimos los miembros de la federacion

        do {
            System.out.print("Ingrese el id del productor: ");
            int idHectarea = scanner.nextInt();
            hectareasFederadas.add(Cooperativa.areasProductivas.get(idHectarea));
            System.out.print("Desea agregar otro mas? 1=si 2=no");
            int decision = scanner.nextInt();
            if (decision == 2){
                fin=false;
            }
        }while (fin);
        //Calculamos la extension total
        for (Hectareas extensionTotalHectareas:hectareasFederadas
             ) {
            extensionTotal+=extensionTotalHectareas.getArea();
        }
        listaFederacion.add(new Federacion("Federacion de " + Cooperativa.productos.get(idProducto).getNombre(),hectareasFederadas,extensionTotal));

    }

    public static void getProductoresFederados(ArrayList<Federacion> federados) {
        int contador=0;
        System.out.println("Productores Federados:");
        for (Federacion federacion :federados){

            System.out.println(contador + " - " + federacion.getNombre());
            ArrayList<Hectareas> miembrosFederados= federacion.getMiembrosFederacion();
            for ( Hectareas hectareas:miembrosFederados
                 ) {
                System.out.println(hectareas.getNombreProductor() + " - " + hectareas.getArea() + "he");
            }
            contador++;
        }

    }


}
