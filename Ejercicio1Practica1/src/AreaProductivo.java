import java.util.ArrayList;

public class AreaProductivo {
    private Producto producto;
    private String nombreProductor;
    private double area;

    public AreaProductivo(String nombreProductor,Producto producto, double area) {
        this.nombreProductor = nombreProductor;
        this.producto = producto;
        this.area = area;
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
