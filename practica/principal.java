
public class principal {
    public static void main(String[] args) {
        String[] productos = {"naranjas", "limones", "manzanas"};

        //Creando array de objetos "productorCoperativa"
        productor productores [] = new productor [3];
        productores[0]=new productor("Fernando",false,4,productos); //Creo que aqui falta la lista de productos

        //Ahora puedp acceder a los metodos d ela puta clase porque he creado un objeto

        System.out.println(productores[0].getNombre() + productores[0].esPequenoProductor() + productores[0].getExtension() );

        //Por lo vistos todoos los arrais requieren un for HH88
        
        for (String producto : productores[0].getProductos()){
            System.out.println(producto);
        }
    }
}
