import javax.swing.*;
import java.util.ArrayList;

public class Producto {

    private String nombre;
    private double rendimiento;
    private boolean predecedero;
    //private double[] precioDia;
    private double ventaTotal;
    private double cosechaTotal;

    public Producto(String nombre, double rendimiento, boolean predecedero, double ventaTotal, double cosechaTotal) {
        this.nombre = nombre;
        this.rendimiento = rendimiento;
        this.predecedero = predecedero;
        this.ventaTotal = ventaTotal;
        this.cosechaTotal = cosechaTotal;
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
    public static void AgregarProducto(ArrayList<Producto> productos){
        boolean esPedecedero = false;
        String productoNuevo = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
        int rendimientoProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el rendimiento del producto:"));
        double ventaTotal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la venta total del producto:"));
        double cosechaTotal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cosecha total:"));
        int opcion = JOptionPane.showConfirmDialog(null, "¿Es Perecedero?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                esPedecedero = true;
            } else {
                esPedecedero = false;
            }

        productos.add(new Producto(productoNuevo,rendimientoProducto,esPedecedero,ventaTotal,cosechaTotal));
    }

}
