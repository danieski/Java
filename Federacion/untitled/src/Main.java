public class Main {
    public static void main(String[] args) {
        //Creamos un constructor vacio para no tener que crear un constructor con atributos ya que eso lo hacemos en el metodo agregar productor
        ProductorPeque productor = new ProductorPeque();
        Federacion federacion = new Federacion();
        //Creamos los productores de prueba
        productor.agregarProductoresPeques();
        //Los mostramos
        productor.mostrarProducotresPeque();
        federacion.agregarFederados(productor.getListaProductores());
        federacion.mostrarFederados();

    }
}