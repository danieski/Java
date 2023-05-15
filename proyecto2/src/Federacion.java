import java.util.ArrayList;

public class Federacion extends ProductorPeque {
    private final String nombreFederacion;
    private ArrayList<ProductorPeque> productores;
    private static ArrayList<String> tiposProductos = new ArrayList<String>();
    private String tipoProducto;
    private double hectareasTotal;
    private double extensionCedida;
    private ArrayList<ProductorPeque>  miembroFederacion;

    public Federacion(String tipoProducto, ArrayList<ProductorPeque> miembroFederacion, double hectareasTotal) {
        super("", miembroFederacion, 1);
        this.nombreFederacion="Federacion" + tipoProducto;
        this.miembroFederacion = miembroFederacion;
        this.getNombre();
        this.hectareasTotal=hectareasTotal;
        if (tiposProductos.contains(tipoProducto)) {
            throw new IllegalArgumentException("Ya existe una Federacion para este tipo de producto");
        } else {
            tiposProductos.add(tipoProducto);
            this.tipoProducto = tipoProducto;
        }
    }

    // métodos getters y setters
    /*
    public String getMiembros(){
        return miembroFederacion.getNombre();
    }*/
    public String getNombreFederacion(){
        return nombreFederacion;
    }
    public String getTipo() {
        return "Federación de " + getProductos().get(0).getNombre();
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: " + getTipo() + ", Productores: " + productores;
    }
    /*

    public void agregarProductor(ProductorPeque productor) {
        this.productores.add(productor);
    }
        this.productores.add(productor);
        this.hectareas += productor.getHectareas();
    }*/
}