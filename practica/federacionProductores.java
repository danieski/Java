import java.util.*;
public class FederacionProductores extends Productor {
    private ArrayList<PequeProductor> PequeProductores;
    private Producto producto;
    public FederacionProductores(String nombre,double extensionTotal,ArrayList<PequeProductor> PequeProductores,Producto producto){
        super (nombre,extensionTotal);
        this.Producto=producto;
        this.pequeProductores = pequeProductores;
    }

}
