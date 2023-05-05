public class productor {
    public String nombre;
    public String tipoProductor;
    public double extensionTotal;
    //public array?? listaProductos;

    public String getListaProductos(){
        return "Lista productos";
    }

    public boolean esPequenoProductor(){
        
        if (extensionTotal > 5){
        return false;
        }
        else {
            return true;
        }
    }
    
}