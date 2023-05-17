import java.util.ArrayList;

public class ProductorGrande extends Productor{
    public ProductorGrande(String nombre,double extensionTotal, ArrayList<AreaProductivo> areaProductivo) {
        super(nombre,extensionTotal,areaProductivo);
    }

    @Override
    public String getDatos() {
        return null;
    }


}
