import java.util.ArrayList;

public class Producto {
    
    private String nombreP;
    private double rendimientoHectarea;
    private double precio;

    public Producto(String nombreP,double rendimientoHectarea,double precio){
        this.nombreP=nombreP;
        this.rendimientoHectarea=rendimientoHectarea;
        this.precio=precio;
    }
    // Creo un array List de productores

    //Setters
    
    //Getters
    public String getNombreProducto(){
        return "\nNombre del producto:" + nombreP;
    }

    public double getRendimientoHectarea(){
        return rendimientoHectarea;
    }

    public double getPrecio(){
        return precio;
    }


}
