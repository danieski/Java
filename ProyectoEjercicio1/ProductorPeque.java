import java.util.ArrayList;

public class ProductorPeque extends Productor{
    public static final double MAX_HECTAREAS_PEQUE= 5;
    public ProductorPeque(String nombre, ArrayList<AreaProductivo> areaProductivo, double extensionTotal) {
        super(nombre,extensionTotal, areaProductivo);
    }

    @Override
    public String getDatos() {
        return null;
    }
}
