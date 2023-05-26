import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
public class Pedidos {
    private static int contadorPedidos = 0;
    private int numeroPedido;
    private Cliente cliente;
    private Date fechaPedido;
    private Date fechaEnvio;
    private double pesoTotal;

    private Producto producto;


    public Pedidos(int numeroPedido,Cliente cliente, Date fechaPedido, double pesoTotal,Producto producto) {
        contadorPedidos++;
        this.producto=producto;
        this.numeroPedido = contadorPedidos;
        this.cliente = cliente;
        this.fechaPedido = fechaPedido;
        this.pesoTotal = pesoTotal;
    }

    public static int getContadorPedidos() {
        return contadorPedidos;
    }

    public static void setContadorPedidos(int contadorPedidos) {
        Pedidos.contadorPedidos = contadorPedidos;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public static Pedidos generarPedido(ArrayList<Cliente> listaClientes,ArrayList<Producto> listaProductos){
        //int idProducto =
        Cliente.muestaClientes();
        //Seleecicionamos y almacinamos su id
        int idCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del cliente: "));
        //Producos
        //Producto.getListaProductos(listaProductos);
        int idProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del producto: "));
        //Ponemos una fecha
        // Crear un objeto Calendar
        int mesPedido = Integer.parseInt(JOptionPane.showInputDialog("Mes del pedido del 0 - 11: "));
        int diaPedido = Integer.parseInt(JOptionPane.showInputDialog("Dia del pedido del 1 - 31: "));
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023); // Establecer el año
        calendar.set(Calendar.MONTH, mesPedido); // Establecer el mes (enero es 0)
        calendar.set(Calendar.DAY_OF_MONTH, diaPedido); // Establecer el día del mes

        // Obtener un objeto Date a partir del Calendar
        Date fechaPedido = calendar.getTime();
        int pesoPedido = Integer.parseInt(JOptionPane.showInputDialog("Peso del pedido: "));
        //Creamos y devolvemo el objeto Pedidos
        Pedidos nuevoPedido = new Pedidos(00,listaClientes.get(idCliente),fechaPedido,pesoPedido,listaProductos.get(idProducto));
        if (listaProductos.get(idProducto).isPredecedero()){
            double TramosGranLogistica=100;
            calcularPrecioPedidoPedecedero(nuevoPedido,TramosGranLogistica);
        }else {
            double TramosGranLogistica=50;
            calcularPrecioPedidoNoPedecedero(nuevoPedido,TramosGranLogistica );
        }
        return nuevoPedido;

    }


    public static void calcularPrecioPedidoNoPedecedero(Pedidos pedidos,double TramosGranLogistica){

        double distanciaCaptialCoperativa=pedidos.cliente.getProvincia().getDistanciaCoperativa();
        double distanciaClienteCapital=pedidos.cliente.getDistancia();
        double distanciaTotal=distanciaCaptialCoperativa+distanciaClienteCapital;
        double distanciaPequeLogistica=distanciaTotal%TramosGranLogistica;
        double distanciaGranLogistica=distanciaTotal-distanciaPequeLogistica;
        double precioKmPequeLogistica = pedidos.cliente.getProvincia().getPrecioKmPequeLogistica();
        double precioKmGranLogistica = pedidos.cliente.getProvincia().getPrecioKmGranLogistica();
        //LA distancia total la saco de los pedidos distancia de la capital a la coperativa y de la distancia del cliente al la capital
        int numeroTrajectos = 1;
        //El numero de trayectos es en principio 1 por lo menos
        double KGcontratados = pedidos.getPesoTotal();
        //A no ser que superemos la cantidad de 1 tonelado
        if (KGcontratados > 1000) {




            numeroTrajectos = (int) Math.round(KGcontratados / 1000);
            //En tal caso sumariamos trayectos a la variable
        }
        //En el caso de haber Gran logistica y pequenia logistica seguimos los siguiente pasos
        if (distanciaTotal > 50) {
            if (KGcontratados<1000){
                double precioTrayectoGranlogistica = 0.5 * pedidos.producto.getPrecio() * KGcontratados;
                double numeroGrandeslogisticas = distanciaGranLogistica / TramosGranLogistica;
                double precioTotalGranLogistica = (numeroGrandeslogisticas * precioTrayectoGranlogistica + precioKmGranLogistica * distanciaGranLogistica) * numeroTrajectos;
                //pecio de la gran logistica por cada tonelada.02
                double precioPequeLogistica = distanciaPequeLogistica * precioKmPequeLogistica * pedidos.getPesoTotal();
                double PrecioTotal = precioTotalGranLogistica + precioPequeLogistica;
                System.out.println("Precio Total: " + PrecioTotal);
            }
            if (KGcontratados%1000!=0 && KGcontratados>1000){
                //Si KG contratado no es multiplo de milo y supera los 1000 KG
                double resto = KGcontratados%1000;
                //double precioTrayectoGranlogistica = 0.5 * pedidos.producto.getPrecio() * 1000;
                double precioTrayectoGranlogistica2 = 0.5 * pedidos.producto.getPrecio() * resto;
                double numeroGrandeslogisticas = distanciaGranLogistica / TramosGranLogistica;
                //double ToneladaGranLogistica = numeroGrandeslogisticas * precioTrayectoGranlogistica;
                double PrecioDistanciaGranLogistica = precioKmGranLogistica * distanciaGranLogistica;
                //double precioGranLogisticaSinResto = (ToneladaGranLogistica + PrecioDistanciaGranLogistica);
                double precioGranLogisticaDelResto = precioTrayectoGranlogistica2 * numeroGrandeslogisticas + PrecioDistanciaGranLogistica;
                double precioTotalGranLogistica = calcularPrecioGranLogistica(pedidos.producto.getPrecio(),1000,distanciaTotal,distanciaGranLogistica,numeroTrajectos-1,precioKmGranLogistica,TramosGranLogistica) + precioGranLogisticaDelResto;
                //double precioTotalGranLogistica = (numeroGrandeslogisticas * precioTrayectoGranlogistica + 0.05 * distanciaGranLogistica) * (numeroTrajectos-1)+(numeroGrandeslogisticas*precioTrayectoGranlogistica2 + 0.05*distanciaGranLogistica);

                //peque log
                double precioPequeLogistica = distanciaPequeLogistica * precioKmPequeLogistica * pedidos.getPesoTotal();
                double PrecioTotal = precioTotalGranLogistica + precioPequeLogistica;
                System.out.println("Precio Total: " + PrecioTotal);


            }else {

                double precioPequeLogistica = distanciaPequeLogistica * precioKmPequeLogistica * pedidos.getPesoTotal();
                double PrecioTotal = calcularPrecioGranLogistica(pedidos.producto.getPrecio(),1000,distanciaTotal,distanciaGranLogistica,numeroTrajectos,precioKmGranLogistica,TramosGranLogistica) + precioPequeLogistica;
                System.out.println("Precio Total: " + PrecioTotal);
            }
        }else {
            //Por si la distancia es menor a 50 Km no hay pequeLogistica
            double precioTrayectoGranlogistica = 0.5 * pedidos.producto.getPrecio() * pedidos.getPesoTotal(); //Tiene que ser como maximo 1 T
            double precioTotalGranLogistica = (precioTrayectoGranlogistica + precioKmGranLogistica * distanciaTotal) * numeroTrajectos;
            System.out.println("Precio Total: "+ precioTotalGranLogistica);
        }

    }
    private static void calcularPrecioPedidoPedecedero(Pedidos nuevoPedido,double TramosGranLogistica) {
        calcularPrecioPedidoNoPedecedero(nuevoPedido,TramosGranLogistica);
    }


    public static double calcularPrecioGranLogistica(double precioProducto,double kgContratados,double distanciaTotal,double distanciaGranLogistica,int numeroTrajectos,double precioKmGranLogistica,double TramosGranLogistica){

        double precioTrayectoGranlogistica = 0.5 * precioProducto * kgContratados; //Tiene que ser como maximo 1 T

        double numeroGrandesLogisticas = distanciaGranLogistica / TramosGranLogistica;

        double precioTotalGranLogistica = (numeroGrandesLogisticas * precioTrayectoGranlogistica + precioKmGranLogistica * distanciaGranLogistica) * numeroTrajectos;
        return precioTotalGranLogistica;
    }
}
