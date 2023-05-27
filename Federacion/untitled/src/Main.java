import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Producto.agregarProducto();

        ArrayList<Hectareas> hectareasDani = new ArrayList<>();
        Producto.getListaProductos().add(new Producto("Platano"));
        hectareasDani.add(new Hectareas( Producto.getListaProductos().get(2),2));
        Productor.getListaProductores().add(new ProductorPeque("Daniel",hectareasDani))2;
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
        Federacion.listaFederados.add(Federacion.crearFederacion());
        Federacion.mostrarFederados();
        Federacion.listaFederados.add(Federacion.crearFederacion());
        Federacion.mostrarFederados();

    }

}