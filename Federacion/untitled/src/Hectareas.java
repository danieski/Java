import java.util.ArrayList;

public class Hectareas {

    //private static ArrayList<Hectareas> listaHectareas=new ArrayList<>();

    private static Producto producto;
    private double hectarea;

    public Hectareas(Producto producto, double hectarea) {

        this.producto = producto;
        this.hectarea = hectarea;
    }


    public static Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getHectarea() {
        return hectarea;
    }



}
