import java.util.ArrayList;

public class ProductorPeque {
    private String nombre;

    //Creamos una lista de productores peques esta tiene que estar inicializada puesto que va a ir obteniendo objetos productores ya "construidos"
    private ArrayList<ProductorPeque> listaProductores=new ArrayList<>();

    //La lista de hectareas no esta inicializada porque se construye cuando creamos un Productor Peque
    //Mientras que el Array de Proiductores podemos dejarlo inicializado

    private ArrayList<Hectareas> hectareas;

    //Productor Peque recibe un nombre y un array de hectareas
    public ProductorPeque(String nombre,ArrayList<Hectareas> hectareas) {
        this.nombre = nombre;
        this.hectareas= hectareas;
        //this.hectareas=new Arraylist<Hectaria> Lo usuariamos si queremos que el array list puesta esta en Null ya qye se crea en el constructor

    }
    public ProductorPeque(){

    }

    public String getNombre() {
        return nombre;
    }


    public ArrayList<Hectareas> getHectareas() {
        return hectareas;
    }

    public ArrayList<ProductorPeque> getListaProductores() {
        return listaProductores;
    }

    public void agregarProductoresPeques(){
        //Creamos los Arrays
        ArrayList<Hectareas> hectareasDani = new ArrayList<>();
        ArrayList<Hectareas> hectareasJose = new ArrayList<>();
        //Creamos los productos
        Producto Manzana = new Producto("Manzana");
        Producto Pera = new Producto("Pera");
        //Rellenamos los arrays
        hectareasDani.add(new Hectareas(Manzana,3));
        hectareasJose.add(new Hectareas(Pera,1));
        hectareasJose.add(new Hectareas(Manzana,2));
        //Intorducimos los arrays
        listaProductores.add(new ProductorPeque("Dani",hectareasDani));
        listaProductores.add(new ProductorPeque("Jose",hectareasJose));
    }
    public void mostrarProducotresPeque(){
        int id = 0 ;
        //Recorremos la lista de productores
        for (ProductorPeque nombreProductores: listaProductores) {
            System.out.println(nombreProductores.getNombre());
            //Aqui vemos que inicializamos el array
            //Es como si dijesemos listaProductores.get(0).getHectareas y sucesivamente
            ArrayList<Hectareas> hectareas1 = nombreProductores.getHectareas();
            for (Hectareas hectareasProductor: hectareas1
                 ) {
                //Imprimimos el valor correspondiente
                System.out.println(id + " - " + hectareasProductor.getProducto().getNombre() + " - " + hectareasProductor.getHectareas());
                id++;
            }
        }
    }

}
