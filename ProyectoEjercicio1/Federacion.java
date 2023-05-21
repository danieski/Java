import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;

public class Federacion extends ProductorPeque {
    private static ArrayList<Productor> productor;
    private Producto producto;
    private double extensionTotal;
    public Federacion(String nombre, ArrayList<AreaProductivo> areaProductivo,double extensionTotal) {
        super(nombre,areaProductivo,extensionTotal);
        this.productor=productor;
        this.extensionTotal=extensionTotal;
    }
    public static ArrayList<Productor> getProductor() {
        return productor;
    }


    public Producto getProducto() {
        return producto;
    }

    public static void agregarFederacion(ArrayList<Producto> productos, ArrayList<AreaProductivo> areaProductivo , ArrayList<Federacion> federados){
        Producto.getListaProductos(productos);
        String productoFederar = JOptionPane.showInputDialog("Ingrese el NOMBRE del producto a federar:");
        String nombreProductoBuscado="";
        int contador=0;
        int idProducto=0;
        //Recorro el array de productos
        for (Producto producto : productos) {

             if (producto.getNombre().equals(productoFederar)) {

                //Si exsite guardamos el nombre en una variable
                nombreProductoBuscado=nombreProductoBuscado.concat(producto.getNombre());
                //Suponemos que el producto que introduce el usuario simpre existe
                System.out.println("Tu producto existe id: " + idProducto);
                break;
            }
             idProducto++;
        }

        //Recorremos el array areaProductores
        //getProductoNombre hay que cambiar los nombres productores

        for (AreaProductivo nombreProductores : areaProductivo){
            //System.out.println(nombreProductores.getNombreProductor());

            //Si el nombre del producto coincide con alguno de los registros
            if(nombreProductoBuscado.equals(nombreProductores.getProductoNombre()) && !nombreProductores.getNombreProductor().startsWith("_")){
                //Imprimimos el nombre del productor que contiene dicho producto y su arraylist id

                System.out.println("ID - " + contador + " - " + nombreProductores.getNombreProductor() + " - " + nombreProductores.getArea() + " he");

            }
            contador++;

        }

        //Obtenemos los indices de respectivos productores
        int productorSeleccionado1 = Integer.parseInt(JOptionPane.showInputDialog("Selecciona un productor:"));
        int productorSeleccionado2 = Integer.parseInt(JOptionPane.showInputDialog("Selecciona otro productor:"));
        //comprobamos que los productores ofrecen unas hectareas inferiores al limite de productores peques
        if (areaProductivo.get(productorSeleccionado1).getArea() + areaProductivo.get(productorSeleccionado2).getArea() > MAX_HECTAREAS_PEQUE ){
            JOptionPane.showMessageDialog(null, "Se ha superado la cantidad máxima de hectáreas permitidas.", "Error", JOptionPane.ERROR_MESSAGE);


        }else {
            //Creamos
            areaProductivo.add(new AreaProductivo("_f" + areaProductivo.get(productorSeleccionado1).getNombreProductor(), areaProductivo.get(idProducto).getProducto(), 5));
            federados.add(new Federacion("Federacion de " + productoFederar, areaProductivo, 1));

        }
    }

    public static void getProductoresFederados(ArrayList<Federacion> federados) {
        int contador=0;
        System.out.println("Productores Federados:");
        for (Federacion federacion :federados){


                System.out.println(contador + " - " + federacion.getNombre());
                contador++;
        }

    }


}
