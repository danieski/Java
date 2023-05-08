public class federacionProductores extends productor {

    //constructor
    public federacionProductores(String nombre, boolean esGrande,double extensionTotal,String[] productos,String[] productoresMiembros,String productoCompartido ){
        super (nombre,esGrande,extensionTotal,productos);
        this.productoresMiembros=productoresMiembros;
        this.productoCompartido=productoCompartido;
    
    }
    public String[] productoresMiembros;
    public String productoCompartido;

    public String getListaProductores(){
        return "Lista productores";
    }

    public String getListaProductos(){
        return productoCompartido;
    }

    public double getExtensionTotal(){
        return extensionTotal;
    }
}
