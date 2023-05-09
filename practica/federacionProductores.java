public class federacionProductores extends productor {

    //constructor
    //productor productoresFederados [] = new productor [3];

    public federacionProductores(String nombre,double extensionTotal,String[] productos,String[] productoresMiembros,String productoCompartido ){
        super (nombre,extensionTotal,productos);
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
        return super.getExtension();
    }
}
