import java.util.ArrayList;

public class Productor {
    private String nombre;
    private double extensionTotal;

    private static ArrayList<ProductoExtension> productos;

    public Productor(String nombre, ArrayList<ProductoExtension> productos) {
        this.nombre = nombre;
        this.extensionTotal = 0;
        this.productos = productos;
        for (ProductoExtension producto : productos) {
            this.extensionTotal += producto.getExtension();
        }
    }
    //Para calcular la extension total


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public double getExtension() {
        return extensionTotal;
    }

    public void setExtension(double extensionTotal) {
        this.extensionTotal = extensionTotal;
    }

    public Iterable<? extends ProductoExtension> getProductos() {
        return this.extensionProducto;
    }

    //Clase productos extension para tener un array con nombre del producto y extension asocidada
    public static class ProductoExtension {

        private String nombreProducto;
        private double extensionProducto;

        public ProductoExtension(String nombreProducto, double extensionProducto) {
            this.nombreProducto = nombreProducto;
            this.extensionProducto = extensionProducto;
        }

        public String getNombreProducto() {
            return nombreProducto;
        }

        public void setNombreProducto(String nombreProducto) {
            this.nombreProducto = nombreProducto;
        }

        public double getExtensionProducto() {
            return extensionProducto;
        }

        public void setExtensionProducto(double extensionProducto) {
            this.extensionProducto = extensionProducto;

        }
        public ArrayList<ProductoExtension> getProductos() {
            return productos;
        }


    }
}