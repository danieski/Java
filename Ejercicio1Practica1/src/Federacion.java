import javax.swing.*;
import java.util.ArrayList;

public class Federacion extends ProductorPeque {
    private static String nombre;
    private static ArrayList<ProductorPeque> miembrosFederacion;
    public static ArrayList<Federacion> listaFederados=new ArrayList<>();
    public Federacion(String nombre, ArrayList<AreaProductivo> areaProductivo,ArrayList<ProductorPeque> miembrosFederacion) {
        super(nombre, areaProductivo);
        this.miembrosFederacion=new ArrayList<ProductorPeque>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<ProductorPeque> getMiembrosFederacion() {
        return miembrosFederacion;
    }

    public void setMiembrosFederacion(ArrayList<ProductorPeque> miembrosFederacion) {
        this.miembrosFederacion = miembrosFederacion;
    }

    public ArrayList<Federacion> getListaFederados() {
        return listaFederados;
    }

    public void setListaFederados(ArrayList<Federacion> listaFederados) {
        this.listaFederados = listaFederados;
    }

    public static void agregarMiembroFederacion(ProductorPeque miembroFederacion) {

        //ProductorPeque miembroFederacion = new ProductorPeque("Tete",Cooperativa.areasProductivas);
        miembrosFederacion.add(miembroFederacion);
    }
    public static void mostrarMiembrosFederacion(){
        for (ProductorPeque nombre:miembrosFederacion) {
            System.out.println(nombre.getNombre());
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
    public static void crearFederacion(ArrayList<Producto> productos, ArrayList<Productor> listaProductores){
        int idProducto=0;
        int idProductorPeque=0;
        boolean fin=false;
        //Mostramos los productos
        for (Producto NombreProductos:productos             ) {
            System.out.println(idProducto + NombreProductos.getNombre());
            idProducto++;
        }
        //Elegimos el producto
        idProducto = Integer.parseInt(JOptionPane.showInputDialog("Selecciona un ID de producto:"));
        //Mostramos los productores
        String nombreFederacion = Cooperativa.productos.get(idProducto).getNombre();
        for (Productor productores: listaProductores) {

            System.out.println(idProductorPeque + productores.getNombre());
            idProductorPeque++;
        }

        //Creamos el objeto
        Federacion nuevoFederado = new Federacion("Federacion " + nombreFederacion, Cooperativa.areasProductivas, miembrosFederacion);
        listaFederados.add(nuevoFederado);
        //Elegimos los productores
        do {
            idProductorPeque = Integer.parseInt(JOptionPane.showInputDialog("Selecciona un ID de productor:"));


            //Agregamos los miembros
            nuevoFederado.agregarMiembroFederacion(new ProductorPeque(listaProductores.get(idProductorPeque).getNombre(), Cooperativa.areasProductivas));

            int opcion = JOptionPane.showConfirmDialog(null, "¿Agregar otro productor?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                fin = true;
            } else {
                fin = false;
            }
        }while(fin);
        mostrarMiembrosFederacion();

    }


}
