
public class principal {
    public static void main(String[] args) {
        //Aqui hay que hacer algo porque no todos los productores tienen los mismo producotds
        String[] productos = {"naranjas", "limones", "manzanas"};
        String[] productoresMiembros = {"Susana", "Santiago"};
        //Creando array de objetos "productorCoperativa"
        productor productores [] = new productor [3];
        federacionProductores productores1 = new federacionProductores("Algoodon federado", 3, productos, productoresMiembros, null);
        //federacionProductores productoresFederados [] = new federacionProductores [3];
        productores[0]=new productor("Fernando",4,productos); //Creo que aqui falta la lista de productos
        productores[1]=new productor("Susana",7,productos);
        productores[2]=new productor("Santiago",3,productos);
        //Aqui poli o klk??
        //productores[3]= new federacionProductores("Federacion Algodon", 3, productos, productoresMiembros, "test");
        //productores[3]=new federacionProductores("Federacion Algodon", 3, productos, )
        //Ahora puedp acceder a los metodos d ela puta clase porque he creado un objeto

        System.out.println("Nombre: " + productores[2].getNombre() + "\n Extension: " + productores[2].getExtension() + productores[2].getEsGrande());

        //Es productor pequennio o grande??



        //Por lo vistos todoos los arrais requieren un for HH88
        
        for (String producto : productores[2].getProductos()){
            System.out.println(" " + producto);
        }
       //System.out.println(productores1.getNombre(),productores1.getExtensionTotal());
        //Intentando avergurar que hacemos con el booleano de esGrande
        //Depende de la extension de terreno si es < sale True pero como relleno entonces el atributo "esGrande"?

    }
}
