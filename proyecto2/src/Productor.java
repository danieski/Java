import java.util.ArrayList;
import java.util.*;
public abstract class Productor {
    private String nombre;
    private ArrayList<Producto> productos;

    private double extensionTotal;
    public Productor(String nombre,double extensionTotal) {
        this.nombre = nombre;
        this.extensionTotal=extensionTotal;
        this.productos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarProducto(String nombre) {
        productos.add(new Producto(nombre));
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public abstract boolean esGrande();
}
