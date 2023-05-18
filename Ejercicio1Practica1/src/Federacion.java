import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;

public class Federacion extends ProductorPeque {
    private static ArrayList<Productor> productor;
    private Producto producto;
    public Federacion(String nombre, ArrayList<AreaProductivo> areaProductivo,double extensionTotal) {
        super(nombre,areaProductivo,extensionTotal);
        this.productor=productor;
    }


    public static Federacion agregarFederacion(ArrayList<Producto> productos, ArrayList<AreaProductivo> areaProductivo){
        String productoFederar = JOptionPane.showInputDialog("Ingrese el nombre del producto a federar:");
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
        for (AreaProductivo nombreProductores : areaProductivo){

            //Si el nombre del producto coincide con alguno de los registros
            if(nombreProductoBuscado.equals(nombreProductores.getProductoNombre())){
                //Imprimimos el nombre del productor que contiene dicho producto y su arraylist id
                System.out.println("ID - " + contador + " - " + nombreProductores.getNombreProductor() + " - " + nombreProductores.getArea() + " he");

            }
            contador++;

        }

        //Obtenemos los indices de respectivos productores
        int productorSeleccionado1 = Integer.parseInt(JOptionPane.showInputDialog("Selecciona un productor:"));
        int productorSeleccionado2 = Integer.parseInt(JOptionPane.showInputDialog("Selecciona otro productor:"));
        //Creamos
        areaProductivo.add(new AreaProductivo("f_"+areaProductivo.get(productorSeleccionado1).getNombreProductor(),areaProductivo.get(idProducto).getProducto(),5));
        Federacion nuevoFederado = new Federacion("Federacion de "+productoFederar,areaProductivo,1);
        return nuevoFederado;

    }

    public String getProductoresFederados() {
        
        return "Producotores federados";
    }
}
