public class FederacionProductores extends Productor {
    PequeProductor [] pequeProductores;
    Producto productos = new Producto("Manzana", 1, 1);
    public FederacionProductores(String nombre,double extensionTotal,PequeProductor[] pequeProductores,Producto productos){
        super (nombre,extensionTotal);
        this.productos=productos;
        this.pequeProductores=pequeProductores;
    }

}
