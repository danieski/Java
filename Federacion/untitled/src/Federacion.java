import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Federacion {
    private String nombre;
    ArrayList<Federacion> listaFederados=new ArrayList<>();
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

    public void agregarFederados(ArrayList<Productor> productor){
        boolean fin=true;


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
            miembrosFederacion.add((ProductorPeque) productor.get(idProductor));
            System.out.print("Desea agregar otro mas? 1=si 2=no");
            int decision = scanner.nextInt();
            if (decision == 2){
                fin=false;
            }
        }while (fin);

        listaFederados.add(new Federacion("Federacion Algodon",miembrosFederacion));
    }
    public void mostrarFederados(){
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
