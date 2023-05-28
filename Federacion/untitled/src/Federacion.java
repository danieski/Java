import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Federacion {
    private String nombre;
    static ArrayList<Federacion> listaFederados=new ArrayList<>();
    ArrayList<ProductorPeque> miembrosFederacion;

    public Federacion(String nombre, ArrayList<ProductorPeque> miembrosFederacion) {
        this.nombre = nombre;
        this.miembrosFederacion = miembrosFederacion;
    }
    public Federacion() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Federacion> getListaFederados() {
        return listaFederados;
    }

    public void setListaFederados(ArrayList<Federacion> listaFederados) {
        this.listaFederados = listaFederados;
    }

    public static Federacion crearFederacion(){
        Producto.mostrarProductos();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el id del producto: ");
        int idProducto = scanner.nextInt();
        Producto productoSeleccionado=Producto.getListaProductos().get(idProducto);
        return new Federacion("Federacion "+productoSeleccionado.getNombre(),agregarFederados(productoSeleccionado));
    }
    public static ArrayList<ProductorPeque> agregarFederados(Producto productoSeleccionado){
        boolean fin=true;
        int idProductorProductoSeleccionado=0;
        //Mostramos los productores que contienen productoSeleccionado

        for (Productor productores:Productor.getListaProductores()
             ) {
            if (productores instanceof ProductorPeque) {
                System.out.println(idProductorProductoSeleccionado + " " + productores.getNombre());

                //Acceso a lista de hectarea erroneo no me deja hhacer nada aqui
                for (Hectareas hectareasProductorPeque: productores.getHectareas()
                     ) {
                    //System.out.println(hectareasProductorPeque.getProducto());
                    System.out.println(hectareasProductorPeque.getHectarea() + "he");
                    /*
                    if(hectareasProductorPeque.getProducto().equals(productoSeleccionado)){
                        System.out.println(idProductorProductoSeleccionado + " " + productores.getNombre());
                    }*/
                }

            }
            idProductorProductoSeleccionado++;
            /*
            for (Hectareas hectareasProductor:productores.getHectareas()
                 ) {
                if(hectareasProductor.getProducto().equals(productoSeleccionado)&&productores instanceof ProductorPeque){
                    System.out.println(idProductorProductoSeleccionado+ " " + productores.getNombre());
                }
            }*/

        }
        ArrayList<ProductorPeque> miembrosFederacion = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Ingrese el id del productor: ");
            int idProductor = scanner.nextInt();
            miembrosFederacion.add((ProductorPeque) Productor.getListaProductores().get(idProductor));
            System.out.print("Desea agregar otro mas? 1=si 2=no");
            int decision = scanner.nextInt();
            if (decision == 2){
                fin=false;
            }
        }while (fin);

        return miembrosFederacion;
    }
    public static void mostrarFederados(){
        for ( Federacion nombreFederacion:listaFederados 
             ) {
            System.out.println("Nombre: " + nombreFederacion.getNombre());
            ArrayList<ProductorPeque> miembrosFederacion1 = nombreFederacion.miembrosFederacion;
            for (ProductorPeque miembrosFederacion:miembrosFederacion1
                 ) {
                System.out.println(miembrosFederacion.getNombre());
            }
        }
    }
}
