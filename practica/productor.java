
public class productor {
    private String nombre;
    private boolean esGrande;
    private double extensionTotal;
    public String[] productos;
    //como meto un array en un objeto
    //String[] productos = {"naranjas", "limones", "manzanas"}; 

    //Constructor
    public productor(String nombre,double extensionTotal,String[] productos){
        this.nombre=nombre;
        this.extensionTotal=extensionTotal;
        this.productos=productos;

        if (extensionTotal > 5){
            this.esGrande= true;
            }
            else {
            this.esGrande= false;
            }

    }
    //Metodo setter que varia el tipo de productor.
    public void setEsGrande(Boolean esGrande){
        this.esGrande = esGrande;
    }
    
    //getter y setters para los atributos
    public String getEsGrande(){
        if (esGrande == true) {
           return " Es gran productor";

        }
        else{
            return " Es peque productor";
        }
    }
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

    public void setProductos(String[] productos) {
        this.productos= productos;
    }

    public String[] getProductos() {
        return productos;
    }
   
    


    
}