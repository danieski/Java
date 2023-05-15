public class Producto {
    private String nombre;
    private double hectareas;

    public Producto(String nombre) {
        this.nombre = nombre;
        //this.hectareas = hectareas;
    }

    public String getNombre() {
        return nombre;
    }

    public double getHectareas() {
        return hectareas;
    }
}
