import java.util.ArrayList;

public class ProductorPeque{
    private ArrayList<ProductorPeque> listaProductoresPeques = new ArrayList<>();
    private String nombre;
    ArrayList<Hectareas> hectareas;
    public static final double MAX_HECTAREAS_PEQUE= 5;
    public ProductorPeque(String nombre, ArrayList<Hectareas> hectareas){
        this.nombre=nombre;
        this.hectareas=hectareas;
    }
    public ProductorPeque(){

    }
    public void setListaProductoresPeques(ArrayList<ProductorPeque> listaProductoresPeques) {
        this.listaProductoresPeques = listaProductoresPeques;
    }

    public String getNombre() {
        return nombre;
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

    public ArrayList<ProductorPeque> getListaProductoresPeques() {
        return listaProductoresPeques;
    }
    public void mostrarListaProductoresPeques(){
        ArrayList<Hectareas> hectareas;
        for (ProductorPeque mostrarProductores:listaProductoresPeques
             ) {
            System.out.println("Nombre Productor Peque: " + mostrarProductores.getNombre());
            for (Hectareas listaHectareasProductos:mostrarProductores.getHectareas()
                 ) {
                System.out.println("Producto: " + listaHectareasProductos.getProductoNombre() + " " + listaHectareasProductos.getArea() + "he");
            }
        }
    }


}
