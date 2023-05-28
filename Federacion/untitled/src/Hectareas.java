import java.util.ArrayList;

public class Hectareas {



    //private static ArrayList<Hectareas> listaHectareas=new ArrayList<>();

    private static Producto producto;
    private double hectarea;

    private static ArrayList<Hectareas> listaHectareas=new ArrayList<>();
    private ProductorPeque productorPeque;


    private static ArrayList<Hectareas> listaHectareas=new ArrayList<>();
    private ProductorPeque productorPeque;


    private Producto producto;
    private double hectareas;


    public Hectareas(Producto producto, double hectarea) {

        this.producto = producto;
        this.hectarea = hectarea;
    }


    public ProductorPeque getProductorPeque() {
        return productorPeque;
    }

    public void setProductorPeque(ProductorPeque productorPeque) {
        this.productorPeque = productorPeque;
    }

    public ProductorPeque getProductorPeque() {
        return productorPeque;
    }

    public void setProductorPeque(ProductorPeque productorPeque) {
        this.productorPeque = productorPeque;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getHectarea() {
        return hectarea;
    }



}
