import javax.swing.*;
import java.util.ArrayList;


public abstract class Productor {
    private String nombre;
    private double extensionTotal;
    private static ArrayList<Hectareas> areasProductivos;
    private static final int MAX_PRODUCTOS = 5;
    private static final double MAX_EXTENSION_TOTAL = 5;



    public Productor(String nombre, ArrayList<Hectareas> areasProductivos) {
        this.nombre = nombre;
        this.areasProductivos = areasProductivos;
    }

    public static ArrayList<Hectareas> getAreasProductivos() {
        return areasProductivos;
    }

    public String getNombre() {
        return nombre;
    }

    public double getExtensionTotal() {
        return extensionTotal;
    }

    public abstract String getDatos();
    public static void getProductores(ArrayList<Productor> productores,ArrayList<Hectareas> areasProductivos){
        ProductorPeque productorPeque = new ProductorPeque();
        productorPeque.mostrarListaProductoresPeques();
    }


    public static void agregarProductor(ArrayList<Productor> productores,ArrayList<Producto> productos,ArrayList<Hectareas> areasProductivos) {
      /*  boolean agregarOtro = true;
        int contador = 0;
        String productorNuevo = JOptionPane.showInputDialog("Ingrese el nombre del productor:");
        do{
            String productoNuevo = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
            // Realizar la búsqueda
            int indice = -1;
            for (int i = 0; i < productos.size(); i++) {
                Producto producto = productos.get(i);
                if (producto.getNombre().equals(productoNuevo)) {
                    indice = i;
                    break;
                }
            }
            // Comprobar el resultado de la búsqueda
            if (indice != -1) {
                System.out.println("El producto encontrado esta encontrado en la lista de productos: " + indice);
                double cantidadNueva = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad del producto:"));
                areasProductivos.add(new Hectareas(productorNuevo, productos.get(indice), cantidadNueva));

                if (cantidadNueva<MAX_EXTENSION_TOTAL){
                    productores.add(new ProductorPeque(productorNuevo,areasProductivos));
                    //para el testing

                }else{
                    productores.add(new ProductorGrande(productorNuevo,areasProductivos));
                }
            } else {
                System.out.println("El producto no se encontró en la lista de productos.");
            }
            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea agregar otro producto?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION && contador<4) {
                agregarOtro = true;
            } else {
                agregarOtro = false;
            }
            contador++;
        }while(agregarOtro);

    }*/
    }
}

