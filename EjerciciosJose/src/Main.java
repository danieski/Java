import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    /*
    Ejercicio 11: La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B)
    , y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá
    un productor por la uva que entrega en un embarque considerando lo siguiente:
            * Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de tamaño 2.
            * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.

        final double precioInicialKg = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de Uvas Tipo A1 en Kg: ");
        double KgUvasA1 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de Uvas Tipo A2 en Kg: ");
        double KgUvasA2 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de Uvas Tipo B1 en Kg: ");
        double KgUvasB1 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de Uvas Tipo B2 en Kg: ");
        double KgUvasB2 = scanner.nextInt();
        double precioTotal = KgUvasA1*(precioInicialKg+0.2) +KgUvasA2*(precioInicialKg+0.3)+KgUvasB1*(precioInicialKg-0.3)*KgUvasB2*(precioInicialKg-0.5);
        System.out.println("El productor recibe: " + precioTotal);*/
        int start=2;
        int end=6;
        int step=2;
        int test=0;

        int i;
        for (i=start; i<=end; i+=step){
            test+=i;
        }

        System.out.println(test);
    }

}
class Kata {
    public static int sequenceSum(int start, int end, int step) {
        if (start > end) {
            return 0;
        }
        int sum = 0;
        for (int i = start; i <= end; i = i + step) {
            sum += i;
        }
        return sum;
    }
}