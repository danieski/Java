public class productor {
    public String nombre;
    public boolean esGrande;
    public double extensionTotal;
    //public String[] productos;
    //como meto un array en un objeto
    String[] productos = {"naranjas", "limones", "manzanas"}; 

    //Constructor
    public productor(String nombre, boolean esGrande,double extensionTotal,String[] productos){
        this.nombre=nombre;
        this.esGrande=esGrande;
        this.extensionTotal=extensionTotal;
        this.productos=productos;
    }
    //Objeto productor
    productor productorCoperativa=new productor("Fernando",false,4,productos); //Creo que aqui falta la lista de productos
    
    //getter y setters para los atributos
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public double getExtension(){
        return  extensionTotal;
    }
    public void setExtension(double extensionTotal){
        this.extensionTotal=extensionTotal;
    }
    public String getListaProductos(){
        return "Lista productos";
    }
    public String[] getProductos() {
        return productos;
    }
    public void setProductos(String[] productos) {
        this.productos= productos;
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