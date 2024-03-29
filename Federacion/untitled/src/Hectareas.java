import java.util.ArrayList;

public class Hectareas {

    private static ArrayList<Hectareas> listaHectareas=new ArrayList<>();

    private static Producto producto;
    private double hectareas;

    public Hectareas(Producto producto, double hectareas) {

        this.producto = producto;
        this.hectareas = hectareas;
    }

    public ArrayList<Hectareas> getListaHectareas() {
        return listaHectareas;
    }

    public void setListaHectareas(ArrayList<Hectareas> listaHectareas) {
        this.listaHectareas = listaHectareas;
    }

    public static Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getHectareas() {
        return hectareas;
    }

    public void setHectareas(double hectareas) {
        this.hectareas = hectareas;
    }

    public void agregarHectareas(){

        listaHectareas.add(new Hectareas(producto.getListaProductos().get(0),5));

    }
}
