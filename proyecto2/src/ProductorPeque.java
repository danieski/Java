import java.util.ArrayList;

public class ProductorPeque<productorPeque> extends Productor {

    public ProductorPeque(String nombre, ArrayList<cedeFederacion> miembroCede, double extensionTotal) {
        super(nombre,extensionTotal);
    }

    @Override
    public boolean esGrande() {
        double extensionTotal = 0;
        for (Producto producto : getProductos()) {
            extensionTotal += producto.getHectareas();
        }
        return extensionTotal > 5;
    }


    public void agregarProducto(String nombre, double extension) {
        if (getProductos().size() >= 5) {
            System.out.println("No se puede agregar más productos, se ha alcanzado el límite.");
        } else {
            double extensionTotal = 0;
            for (Producto producto : getProductos()) {
                extensionTotal += producto.getHectareas();
            }
            if (extensionTotal + extension > 5) {
                System.out.println("No se puede agregar este producto, se ha alcanzado la extensión máxima permitida.");
            } else {
                super.agregarProducto(nombre);
            }
        }
    }
    public static class cedeFederacion {
        private ProductorPeque productorPeque;
        private double hectareasCedidas;

        public cedeFederacion(ProductorPeque productorPeque, double hectareasCedidas){
            this.productorPeque=productorPeque;
            this.hectareasCedidas=hectareasCedidas;
        }
        public double getHectareasCedidas(){
            return hectareasCedidas;
        }
    }
}
