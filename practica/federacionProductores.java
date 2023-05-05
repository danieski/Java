public class federacionProductores extends productor {
    //public array productoresMiembros;
    
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
