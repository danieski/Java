import javax.swing.*;
import java.util.ArrayList;

public class Cooperativa {

    public static void main(String[] args) {

        ArrayList<Federacion> ListaFederados = new ArrayList<>();
        //Miembros de la federacion.
        //Creando un array donde almaceno objetos de la clase Peque
        ArrayList<ProductorPeque> MiembrosFederacion = new ArrayList<>();
        //Creamos un array donde almaceno la cantidad que cede cada productor
        ArrayList<ProductorPeque.cedeFederacion> MiembroCede = new ArrayList<>();
        //Agrgar productor
        //Creamos un objeto de la clase productor peque
        ProductorPeque productorPeque = new ProductorPeque("Javi",MiembroCede,2);
        MiembrosFederacion.add(productorPeque);
        ProductorPeque.cedeFederacion productorPequeCede = new ProductorPeque.cedeFederacion(productorPeque,0.2);
        MiembroCede.add(productorPequeCede);
        MiembrosFederacion.add(new ProductorPeque("mark", MiembroCede, 1));
        ProductorPeque.cedeFederacion productorPequeCede1 = new ProductorPeque.cedeFederacion(productorPeque,0.1);
        MiembroCede.add(productorPequeCede1);
        //Creamos un objeto nuevo de la clase Federacion.
        Federacion productorFederado = new Federacion("Algodon",MiembrosFederacion,0.5);
        ListaFederados.add(productorFederado);
        agregarProductorFederado(MiembroCede,MiembrosFederacion);
        mostrarDatosFeds(ListaFederados,MiembrosFederacion,MiembroCede);
        //Creamos un array de productores
        ArrayList<Productor> productores = new ArrayList<>();
        //Creamos un objeto Productor grande

        ProductorGrande productorGrande = new ProductorGrande("Productor Grande", 16);
        agregarProductor(productores,MiembroCede);
        //Dentro del objeto Productor grande llamamos al metodo agregar producto
        productorGrande.agregarProducto("Trigo");
        productorGrande.agregarProducto("Maíz");
        //Llamamos al metodo add de productores
        productores.add(productorGrande);

        ProductorPeque productorPeque1 = new ProductorPeque("Productor Peque", MiembroCede, 5);
        productorPeque1.agregarProducto("Manzanas", 2);
        productorPeque1.agregarProducto("Papas", 3);
        productores.add(productorPeque1);

        //System.out.println("Lista de Productores:");
        mostrarDatos(productores);

    }
    public static void agregarProductorFederado(ArrayList<ProductorPeque.cedeFederacion> MiembroCede,ArrayList<ProductorPeque> MiembrosFederacion){
        String productorNuevo = JOptionPane.showInputDialog("Ingrese el nombre del productor para agregar en la federacion:");
        ProductorPeque productorPeque = new ProductorPeque(productorNuevo,MiembroCede,2);
        MiembrosFederacion.add(productorPeque);
        double extensionCedida = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de hectáreas que se van ha ceder:"));
        ProductorPeque.cedeFederacion productorPequeCede = new ProductorPeque.cedeFederacion(productorPeque,extensionCedida);
        MiembroCede.add(productorPequeCede);
    }
    public static void mostrarDatosFeds(ArrayList<Federacion> ListaFederados, ArrayList<ProductorPeque> MiembrosFederacion, ArrayList<ProductorPeque.cedeFederacion> miembroCede){
        double totalHectareas=0;
        System.out.println( "Lista de Productores Federados:");
        for (Federacion productor : ListaFederados) {
            System.out.println("Nombre: " + productor.getNombreFederacion());
            System.out.println("Productores miembros:");
                for (ProductorPeque productoresMiembros : MiembrosFederacion) {
                    System.out.print( " " + productoresMiembros.getNombre());
                }
                System.out.println(" ");
                for (ProductorPeque.cedeFederacion cantidadCedido : miembroCede) {
                    System.out.print( "\t" + cantidadCedido.getHectareasCedidas());
                    totalHectareas += cantidadCedido.getHectareasCedidas();

                }


            for (Producto producto : productor.getProductos()) {
                System.out.println(producto.getNombre() + " - " + producto.getHectareas() + " ha");

            }

            System.out.println("\nTotal: " + totalHectareas);
        }



    }
    public static void mostrarDatos(ArrayList<Productor> productores){
        System.out.println( "Lista de Productores:");
        for (Productor productor : productores) {
            System.out.println("Productor: " + productor.getNombre());
            System.out.println("Tipo: " + (productor.esGrande() ? "Grande" : "Peque"));
            System.out.println("Productos:");
            for (Producto producto : productor.getProductos()) {
                System.out.println(producto.getNombre() + " - " + producto.getHectareas() + " ha");
            }
            System.out.println();
        }

    }
    public static void agregarProductor(ArrayList<Productor> productores,ArrayList<ProductorPeque.cedeFederacion> MiembroCede){

        String productorNuevo = JOptionPane.showInputDialog("Ingrese el nombre del productor:");
        String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
        double extension = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de hectáreas del producto:"));

        if (extension > 5 ){
            ProductorGrande productorGrande = new ProductorGrande(productorNuevo,extension);
            productorGrande.agregarProducto(nombreProducto);
            productores.add(productorGrande);
        }else{
            ProductorPeque productorPeque = new ProductorPeque(productorNuevo, MiembroCede, extension);
            productorPeque.agregarProducto(nombreProducto, extension);
            productores.add(productorPeque);
        }

    }
}
