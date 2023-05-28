import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Federacion extends ProductorPeque {
    private static ArrayList<Federacion> listaFederacion = new ArrayList<>();
    private Producto producto;
    private double extensionTotal;
    public Federacion(String nombre, ArrayList<Hectareas> hectareas, double extensionTotal) {
        super(nombre, hectareas);
        super.hectareas=hectareas;
        this.extensionTotal=extensionTotal;
    }


    public static ArrayList<Federacion> getListaFederacion() {
        return listaFederacion;
    }


    public Producto getProducto() {
        return producto;
    }


    public static void agregarFederacion(ArrayList<Producto> productos){
        Hectareas hectareas = new Hectareas();
        double extensionTotal = 0;
        int idHectareas = 0 ;
        boolean fin = true;
        Scanner scanner = new Scanner(System.in);
        //Mostramos la lista de productos federables
        Producto.getListaProductos(productos);

        System.out.print("Ingrese el id del producto: ");
        int idProducto = scanner.nextInt();
        //Mostramos las entradas con los productores que producen dicho producto
        for (Hectareas productoHectareas:Cooperativa.areasProductivas ) {
            if (productoHectareas.getProducto().equals(Cooperativa.productos.get(idProducto))) {
                System.out.println(idHectareas + " " + productoHectareas.getNombreProductor() + " - " + productoHectareas.getArea() + "he");
            }
            idHectareas++;
        }
        //Elegimos los miembros de la federacion
        ArrayList<Hectareas> hectareasFederadas=new ArrayList<>();
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

    public void getProductoresFederados(ArrayList<Federacion> federados) {
        int contador=0;
        System.out.println("Productores Federados:");
        for (Federacion federacion :federados){

            System.out.println(contador + " - " + federacion.getNombre());
            ArrayList<Hectareas> miembrosFederados= super.getAreasProductivos();
            for ( Hectareas hectareas:miembrosFederados
                 ) {
                System.out.println(hectareas.getNombreProductor() + " - " + hectareas.getArea() + "he");
            }
            contador++;
        }

    }


}
