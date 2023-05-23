import java.util.ArrayList;

public class Producto {
    private ArrayList<Producto> listaProductos = new ArrayList<>();
    private String nombre;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void agregarProducto(){
        listaProductos.add(new Producto("Tomates"));
        listaProductos.add(new Producto("Patatas"));
    }
    public void mostrarProductos(){
        for (Producto nombresProductos: listaProductos
             ) {
            System.out.println(nombresProductos.getNombre());
        }
    }

}
