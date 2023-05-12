
public class Productor {
    private String nombre;
    private double extensionTotal;
    public Productor(String nombre,double extensionTotal){
        this.nombre=nombre;
        this.extensionTotal=extensionTotal;
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
    


    
}