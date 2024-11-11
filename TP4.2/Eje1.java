import java.util.Scanner;

public class Eje1 {
    public static void main(String[] args) {
        //Ejercicio 1: Cálculo de ingresos mensuales
        //Una pequeña tienda registra sus ventas diarias en un arreglo. Se necesita escribir una función que use un bucle para calcular los ingresos totales mensuales.
        //**Instrucciones**:
        //- Crea un arreglo `ventas` que almacene las ventas diarias de una tienda durante 30 días.
        //- Escribe una función `calcularIngresosMensuales` que recorra el arreglo y sume las ventas.
        //- Imprime el total de ingresos mensuales.
        Scanner sc = new Scanner(System.in);
        int ventasa;
        int suma;

        int[] ventas = new int[30];
        cargarVentas(ventas, sc);
        Suma(ventas);


    }
    public static void cargarVentas(int[] ventas, Scanner sc) {
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Ingrese el monto del dia " + (i + 1) + ":");
            ventas[i] = sc.nextInt();
        }
    }
    public static void Suma(int[] ventas) {
        float sum=0;
        for (int i = 0; i < ventas.length; i++) {
            sum += ventas[i];
        }
        System.out.println("La suma de los ingreso es: " + sum);
    }
}
