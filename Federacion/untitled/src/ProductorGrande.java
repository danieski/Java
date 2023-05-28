import java.util.ArrayList;

public class ProductorGrande extends Productor{
    private String nombre;
    private ArrayList<Hectareas> hectareas;

    public ProductorGrande(String nombre, ArrayList<Hectareas> hectareas) {
        super(nombre, hectareas);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Hectareas> getHectareas() {
        return hectareas;
    }

    public void setHectareas(ArrayList<Hectareas> hectareas) {
        this.hectareas = hectareas;
    }
}
