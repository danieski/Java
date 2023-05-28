import javax.swing.*;
import java.util.ArrayList;

public class Producto {

    public static double[] getHistorialPrecios;
    private String nombre;
    private double rendimiento;
    private boolean predecedero;
    private static double[] precioDia;
    private double ventaTotal;
    private double cosechaTotal;
    private double precio;
    static ArrayList<Double> historialPrecios = new ArrayList<>();


    public Producto(String nombre, double rendimiento, boolean predecedero, double ventaTotal, double cosechaTotal, double precio, ArrayList historialPrecios ) {
        this.nombre = nombre;
        this.rendimiento = rendimiento;
        this.predecedero = predecedero;
        this.ventaTotal = ventaTotal;
        this.cosechaTotal = cosechaTotal;
        this.precio=precio;
        this.historialPrecios=historialPrecios;
    }

    public boolean isPredecedero() {
        return predecedero;
    }

    public static ArrayList<Double> getHistorialPrecios() {
        return historialPrecios;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Producto producto = (Producto) obj;
        return nombre.equals(producto.nombre);
    }



    public String getNombre() {
        return nombre;
    }

    public static void AgregarProducto(ArrayList<Producto> productos, ArrayList<Double> historialPrecio){
        boolean esPedecedero = false;
        String productoNuevo = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
        int rendimientoProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el rendimiento del producto:"));
        double ventaTotal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la venta total del producto:"));
        double cosechaTotal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cosecha total:"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Precio:"));
        historialPrecio.add(precio);

        int opcion = JOptionPane.showConfirmDialog(null, "¿Es Perecedero?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                esPedecedero = true;
            } else {
                esPedecedero = false;
            }

        productos.add(new Producto(productoNuevo,rendimientoProducto,esPedecedero,ventaTotal,cosechaTotal,precio,historialPrecio));
    }
    public static void getListaProductos(ArrayList<Producto> productos){
        int idProducto=0;
        for (Producto nombreProducto:productos) {

            System.out.println(idProducto + " - " + nombreProducto.getNombre());
            idProducto++;
        }
    }

}
