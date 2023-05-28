import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Producto.agregarProducto();


        Producto.getListaProductos().add(new Producto("Platano"));

        ArrayList<Hectareas> hectareasDani =new ArrayList<>();
        hectareasDani.add(new Hectareas( Producto.getListaProductos().get(2),2));
        Productor.getListaProductores().add(new ProductorPeque("Daniel",hectareasDani));

        ArrayList<Hectareas> hectareasJose = new ArrayList<>();
        hectareasJose.add(new Hectareas(Producto.getListaProductos().get(2),1));
        Productor.getListaProductores().add(new ProductorPeque("Jose",hectareasJose));

        ArrayList<Hectareas> hectareasProductorGrande = new ArrayList<>();
        hectareasProductorGrande.add(new Hectareas(Producto.getListaProductos().get(2),11));
        Productor.getListaProductores().add(new ProductorGrande("Productor Grande",hectareasJose));

        //Productor.getListaProductores().add(Productor.agregarProductor());
        //Productor.getListaProductores().add(Productor.agregarProductor());


        //Productor.mostrarProductores();
        //Se presupone que al crear la federacion ya no se pueden agregar mas productores
        Productor.mostrarProductores();
        Federacion.listaFederados.add(Federacion.crearFederacion());
        Federacion.mostrarFederados();
        Federacion.listaFederados.add(Federacion.crearFederacion());
        Federacion.mostrarFederados();

    }

}