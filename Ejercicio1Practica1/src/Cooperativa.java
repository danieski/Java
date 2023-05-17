import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

public class Cooperativa {
    private Date fechaActual;
    private final int anoActual=2023;

    public static ArrayList<Productor> productores = new ArrayList<>();
    public static ArrayList<Producto> productos = new ArrayList<>();
    public static ArrayList<AreaProductivo> areasProductivas = new ArrayList<>();

    public static void main(String[] args) {
        /*
        ArrayList<Federacion> ListaFederados = new ArrayList<>();
        //Miembros de la federacion.
        //Creando un array donde almaceno objetos de la clase Peque
        ArrayList<ProductorPeque> MiembrosFederacion = new ArrayList<>();
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
        */

        //Creamos un objeto producto para el testing
        productos.add(new Producto("Manzana",1,true,1,1));
        productos.add(new Producto("Pera",1,true,1,1));
        productos.add(new Producto("Fresa",1,true,1,1));
        productos.add(new Producto("Algodon",2.5,true,1,1));

        //Ceamos un objeto areaProducto para el testing

        areasProductivas.add(new AreaProductivo("Productor Grande",productos.get(0),12));
        areasProductivas.add(new AreaProductivo("Productor Grande",productos.get(1),21));
        areasProductivas.add(new AreaProductivo("Dani",productos.get(2),2));
        areasProductivas.add(new AreaProductivo("Dani",productos.get(0),3));

        //Creamos un objeto productor para el testing
        productores.add(new ProductorPeque("Dani",areasProductivas,1));

        //Creamos un objeto Productor grande
        productores.add(new ProductorGrande("Productor Grande",15,areasProductivas ));
        Producto.AgregarProducto(productos);
        Productor.agregarProductor(productores,productos,areasProductivas);
        Productor.getProductores(productores,areasProductivas);
        //Dentro del objeto Productor grande llamamos al metodo agregar producto
        /*
        Producto.agregarProducto("Trigo");
        productorGrande.agregarProducto("Maíz");
        //Llamamos al metodo add de productores
        productores.add(productorGrande);

        ProductorPeque productorPeque1 = new ProductorPeque("Productor Peque", MiembroCede, 5);
        productorPeque1.agregarProducto("Manzanas", 2);
        productorPeque1.agregarProducto("Papas", 3);
        productores.add(productorPeque1);

        //System.out.println("Lista de Productores:");
        mostrarDatos(productores);
        */
    }
}