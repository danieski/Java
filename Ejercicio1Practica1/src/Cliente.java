import javax.swing.*;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private int distancia;
    private Capital capital;
    private static ArrayList<Pedidos> listaPedidos;

    private static ArrayList<Cliente> listaClientes = new ArrayList<>();

    public Cliente(String nombre, int distanciaCapital, ArrayList<Pedidos> pedidos, Capital capital) {
        this.nombre = nombre;
        this.distancia = distanciaCapital;
        this.listaPedidos = pedidos;
        this.capital = capital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public Capital getProvincia() {
        return capital;
    }

    public void setProvincia(Capital capital) {
        this.capital = capital;
    }

    public static ArrayList<Pedidos> getPedidos() {
        return listaPedidos;
    }

    public static ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setPedidos(ArrayList<Pedidos> pedidos) {
        this.listaPedidos = pedidos;
    }

    public static Cliente agregarCliente(ArrayList<Pedidos> pedidos,ArrayList<Capital> capitals){
        //int idProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID: "));
        //double nuevoPrecio = Double.parseDouble(JOptionPane.showInputDialog("Nuevo precio: "));

        int idProvincia=0;
        String clienteNuevo = JOptionPane.showInputDialog("Nombre del cliente:");
        String provinciaCiente = JOptionPane.showInputDialog("Provincia a la que pertenece:");
        for (Capital nombreProvincias: capitals) {
            if (provinciaCiente.equals(nombreProvincias.getNombre())){
                //Recorro el array proviicnias
                System.out.println("La provincia seleccionada existe");
                break;
            }
            //Encuentro su ID
            idProvincia++;
        }
        int distanciaProvincia = Integer.parseInt(JOptionPane.showInputDialog("Distancia de la capital de la provincia: "));
        //Devuelvo un objeto cliente que posteriormente agregamos a la lista de clientes
        return new Cliente(clienteNuevo,distanciaProvincia,pedidos, capitals.get(idProvincia));
    }
    public static void muestaClientes(){
        int idCliente=0;
        for (Cliente datosClientes : listaClientes) {
            System.out.println(idCliente  + "ID - " + datosClientes.getNombre() + " - " + datosClientes.getDistancia() + "km de la provincia " + datosClientes.getProvincia().getNombre() );
            idCliente++;
        }

    }
}
