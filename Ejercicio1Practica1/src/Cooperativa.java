import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class Cooperativa {
    //public static LocalDate fechaLocal = LocalDate.of(2023, 1, 1);
    //private static ArrayList<Federacion> federados= new ArrayList<>();;
    public static ArrayList<Productor> productores = new ArrayList<>();
    public static ArrayList<Producto> productos = new ArrayList<>();
    public static ArrayList<AreaProductivo> areasProductivas = new ArrayList<>();



    public static void main(String[] args) {


        //System.out.println(180%50);
        //Tema fechas
        Date fecha = new Date(123, 0, 1);
        Date fecha1 = new Date(123, 0, 7);
        Calendar calendario = Calendar.getInstance();
        Calendar calendarioPrecios = Calendar.getInstance();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        calendario.setTime(fecha);
        calendarioPrecios.setTime(fecha1);

        // Intorducinedo datos arraylist Capitales
        Capital.getProvincias().add(new Capital("Sevilla",150,0.05,0.01));
        //Introduce datos Clietne
        Cliente.getListaClientes().add(new Cliente("Pablo",30,Cliente.getPedidos(),Capital.getProvincias().get(0)));
        //Arrays de dobles para el historial de precios
        ;
        //Creamos un objeto producto para el testing
        productos.add(new Producto("Manzana",1,true,1,20,1,Producto.getHistorialPrecios()));
        productos.add(new Producto("Pera",1,true,1,28,0.7,Producto.getHistorialPrecios()));
        productos.add(new Producto("Fresa",1,true,1,2,0.5,Producto.getHistorialPrecios()));
        productos.add(new Producto("Algodon",2.5,false,1,3,0.5,Producto.getHistorialPrecios()));
        productos.add(new Producto("Aceitunas",2.5,true,1,6,1.4,Producto.getHistorialPrecios()));
        productos.add(new Producto("Aceite",2.5,false,1,0,0.5,Producto.getHistorialPrecios()));

        //Ceamos un objeto areaProducto para el testing

        areasProductivas.add(new AreaProductivo("Productor Grande",productos.get(0),12));
        areasProductivas.add(new AreaProductivo("Productor Grande",productos.get(1),21));
        areasProductivas.add(new AreaProductivo("Dani",productos.get(2),2));
        areasProductivas.add(new AreaProductivo("Dani",productos.get(0),3));
        areasProductivas.add(new AreaProductivo("Productor Peque",productos.get(3),3));
        areasProductivas.add(new AreaProductivo("Productor Peque",productos.get(0),1));
        areasProductivas.add(new AreaProductivo("Alvaro",productos.get(4),6));
        areasProductivas.add(new AreaProductivo("Alvaro",productos.get(1),7));
        areasProductivas.add(new AreaProductivo("_fProductor Peque",productos.get(0),7));
        areasProductivas.add(new AreaProductivo("_fDani",productos.get(0),7));
        //Creamos un objeto productor para el testing
        productores.add(new ProductorPeque("Dani",areasProductivas));
        productores.add(new ProductorGrande("Alvaro",areasProductivas));
        productores.add(new ProductorPeque("Productor Peque",areasProductivas));

        //Creamos un objeto Productor grande
        productores.add(new ProductorGrande("Productor Grande",areasProductivas ));

        Federacion.crearFederacion(productos,productores);
        //Federacion.getProductoresFederados(Federacion.listaFederados);
        Federacion.listaFederados.get(0).getNombre();
        for ( Federacion federados :Federacion.listaFederados
             ) {
            System.out.println(federados.getNombre());
        }
        //Federacion.getProductoresFederados
        //Creamos array federados para el testing
        //Federacion.getListaFederacion().add(new Federacion("Federacion Aceite",areasProductivas,Federacion.getProductoresFederados()));
        //cambiarPrecios(productos,Producto.getHistorialPrecios());
        mostrarMenu(calendario,calendarioPrecios);


    }

    private static void cambiarPrecios(ArrayList<Producto> productos, ArrayList<Double> historialPrecios) {
        boolean otravez=true;
        System.out.println("Revision precio productos");
        Producto.getListaProductos(productos);

        do {

            int idProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID: "));
            double nuevoPrecio = Double.parseDouble(JOptionPane.showInputDialog("Nuevo precio: "));
            double precioAntiguo = productos.get(idProducto).getPrecio();
            productos.get(idProducto).setPrecio(nuevoPrecio);
            historialPrecios.add(precioAntiguo);
            int opcion = JOptionPane.showConfirmDialog(null, "¿Cambiar de precio otro?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
            } else {
                otravez = false;
            }
        }while (otravez);
    }


    public static void mostrarMenu(Calendar calendario, Calendar calendarioPrecios) {

        int i = 0;
        do {
            Date fechaActual = calendario.getTime();

            //Con el objetivo de subir los precios cada 7 dias.


            Date fechaPrecios = calendarioPrecios.getTime();

            int comparacion = fechaActual.compareTo(fechaPrecios);
                if (comparacion < 0) {
                    System.out.println("La fecha actual es anterior a la fecha precios");
                } else if (comparacion > 0) {
                    System.out.println("La fecha actual es posterior a la fecha precios");

                    calendarioPrecios.setTime(calendario.getTime());

                    calendarioPrecios.add(Calendar.WEEK_OF_YEAR, 1);
                    Date nuevaFecha = calendarioPrecios.getTime();
                    fechaPrecios = nuevaFecha;

                    //Cambiamos los precios.
                    cambiarPrecios(productos,Producto.getHistorialPrecios());

                } else {
                    System.out.println("La fecha actual es igual a la fecha precios");
                }
            System.out.println("Fecha subida precios: " + fechaPrecios);
            System.out.println("App date: " + fechaActual);
            System.out.println("---Menu---");
            System.out.println("0- Salir");
            System.out.println("1- Agregar Productor");
            System.out.println("2- Agregar Producto");
            System.out.println("3- Agregar Federacion");
            System.out.println("4- Mostrar Productores");
            System.out.println("5- Mostrar Productores Federados");
            System.out.println("6- Mostrar Productos");
            System.out.println("7- Cambiar Fecha");
            System.out.println("8- Agregar Cliente");
            System.out.println("9- Crear Pedido");
            System.out.println("10- Agregar Productores a Federacion");
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion:"));
            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado la opción 1");
                    Productor.agregarProductor(productores, productos, areasProductivas);
                    break;
                case 2:
                    System.out.println("Ha seleccionado la opción 2");
                    Producto.AgregarProducto(productos,Producto.getHistorialPrecios());
                    break;
                case 3:
                    System.out.println("Ha seleccionado la opción 3");
                    //Federacion.getListaFederacion().add(Federacion.agregarFederacion(productos, areasProductivas));
                    break;
                case 4:
                    System.out.println("Ha seleccionado la opción 4");
                    Productor.getProductores(productores,areasProductivas);
                    break;
                case 5:
                    System.out.println("Ha seleccionado la opción 5");
                    //Federacion.getProductoresFederados(Federacion.getListaFederacion());
                    break;
                case 6:
                    System.out.println("Ha seleccionado la opción 6");
                    Producto.getListaProductos(productos);
                    break;
                case 7:
                    System.out.println("Ha seleccionado la opción 7");
                    System.out.println("1- Incrementa un dia");
                    System.out.println("2- Incrementa una semana");
                    System.out.println("3- Incrimenta un mes");
                    int opcionFecha = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion:"));
                    switch (opcionFecha) {
                        case 1:
                            System.out.println("Incrementar un dia");
                            calendario.add(Calendar.DAY_OF_YEAR, 1);
                            break;
                        case 2:
                            System.out.println("Incrementar una semana");
                            calendario.add(Calendar.WEEK_OF_YEAR, 1);
                            break;
                        case 3:
                            System.out.println("Incrementar un mes");
                            calendario.add(Calendar.MONTH, 1);
                            break;
                    }

                        break;
                        case 8:
                            System.out.println("Ha seleccionado la opción 8");
                            Cliente.getListaClientes().add(Cliente.agregarCliente(Cliente.getPedidos(), Capital.getProvincias()));
                            Cliente.muestaClientes();
                            break;
                case 9:
                    System.out.println("Ha seleccionado la opción 9");
                    Pedidos.generarPedido(Cliente.getListaClientes(),productos);
                    break;
                case 10:
                    System.out.println("Ha seleccionado la opción 10");
                    //Federacion.agregarProductorFederacion(Federacion.getListaFederacion(),productores);
                    break;
                        case 0:
                            System.out.println("Saliendo del programa...");
                            i = 1;
                            break;
                        default:
                            System.out.println("Opción no válida");
                            break;
                    }
            }
            while (i != 1) ;

    }
}