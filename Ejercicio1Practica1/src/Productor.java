import javax.swing.*;
import java.util.ArrayList;


public abstract class Productor {
    private String nombre;
    private double extensionTotal;
    private static ArrayList<AreaProductivo> areasProductivos;



    public Productor(String nombre, double extensionTotal, ArrayList<AreaProductivo> areasProductivos) {
        this.nombre = nombre;
        this.extensionTotal = extensionTotal;
        this.areasProductivos = areasProductivos;
    }

    public Productor() {

    }


    public String getNombre() {
        return nombre;
    }

    public double getExtensionTotal() {
        return extensionTotal;
    }

    public abstract String getDatos();
    public static void getProductores(ArrayList<Productor> productores,ArrayList<AreaProductivo> areasProductivos){
        System.out.println( "Lista de Productores:");
        for (Productor productor : productores) { //creo una variable productor que es el objeto con su productor y con su array de objetos areas
            System.out.println("Productor: " + productor.getNombre()); //imprimo el nombre del primer productor
            if (productor instanceof ProductorPeque) {//identifico que es grande o pequenio
                System.out.println("Tipo Peque");
            }
            if (productor instanceof ProductorGrande){
                System.out.println("Tipo Grande");
            }
            //Mostramos la lista de areaProductivo asociada al productor corresondiente
            System.out.println("Productos:");
            for (AreaProductivo area : areasProductivos) {
                if (area.getNombreProductor() == productor.getNombre()) {
                    System.out.println(area.getProducto() + " - " + area.getArea() + " ha");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public void getAreasProductivas (AreaProductivo areasProductivos){
        areasProductivos.getProducto();
    }

    public static void agregarProductor(ArrayList<Productor> productores,ArrayList<Producto> productos,ArrayList<AreaProductivo> areasProductivos){

            String productorNuevo = JOptionPane.showInputDialog("Ingrese el nombre del productor:");
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
                areasProductivos.add(new AreaProductivo(productorNuevo,productos.get(indice),cantidadNueva));
                    if (cantidadNueva<5){
                        productores.add(new ProductorPeque(productorNuevo,areasProductivos,cantidadNueva));
                        //para el testing

                    }else{
                        productores.add(new ProductorGrande(productorNuevo,cantidadNueva,areasProductivos));
                    }
            } else {
                System.out.println("El producto no se encontró en la lista de productos.");
            }

        }

}

