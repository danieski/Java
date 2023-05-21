import java.util.ArrayList;

public class Capital {
    private String nombre;
    double distanciaCoperativa;
    double precioKmGranLogistica;
    double precioKmPequeLogistica;
    private static ArrayList<Capital> capitales = new ArrayList<>();

    public Capital(String nombre, double distanciaCoperativa, double precioKmGranLogistica, double precioKmPequeLogistica) {
        this.nombre = nombre;
        this.distanciaCoperativa = distanciaCoperativa;
        this.precioKmGranLogistica = precioKmGranLogistica;
        this.precioKmPequeLogistica = precioKmPequeLogistica;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDistanciaCoperativa() {
        return distanciaCoperativa;
    }

    public void setDistanciaCoperativa(double distanciaCoperativa) {
        this.distanciaCoperativa = distanciaCoperativa;
    }

    public double getPrecioKmGranLogistica() {
        return precioKmGranLogistica;
    }

    public void setPrecioKmGranLogistica(double precioKmGranLogistica) {
        this.precioKmGranLogistica = precioKmGranLogistica;
    }

    public double getPrecioKmPequeLogistica() {
        return precioKmPequeLogistica;
    }

    public void setPrecioKmPequeLogistica(double precioKmPequeLogistica) {
        this.precioKmPequeLogistica = precioKmPequeLogistica;
    }

    public static ArrayList<Capital> getProvincias() {
        return capitales;
    }

}
