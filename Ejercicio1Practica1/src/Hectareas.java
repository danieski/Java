import java.util.ArrayList;

public class Hectareas {
    private Producto producto;
    private String nombreProductor;
    private double area;
    //private ArrayList<Hectareas> listaHectareas= new ArrayList<>();
    public Hectareas(String nombreProductor, Producto producto, double area) {
        this.nombreProductor = nombreProductor;
        this.producto = producto;
        this.area = area;
    }
    public Hectareas(){

    }

    public String getNombreProductor() {
        return nombreProductor;
    }



    public Producto getProducto() {
        return producto;
    }
    public String getProductoNombre() {
        return producto.getNombre();
    }

    public double getArea() {
        return area;
    }


}
