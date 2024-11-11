import java.util.Scanner;

public class Eje4 {
    public static void main(String[] args) {
        //Ejercicio 4: Registro de ventas diarias
        //Una tienda desea registrar las ventas realizadas cada día durante una semana. El programa debe calcular el total de ventas al final de la semana.
        //Instrucciones:
        //•	Usa un bucle para registrar las ventas diarias durante 7 días.
        //•	Al final del bucle, muestra el total de ventas de la semana.
        Scanner sc = new Scanner(System.in);
        float suma = 0;
        int dia = 1;

        do {
            System.out.println("Ingrese la venta del dia " + dia + " de la semana: ");
            float venta = sc.nextFloat();
            suma += venta;
            dia+=1;
        } while (dia <= 7);

        System.out.println("El total de ventas en la semana es: " + suma);
        sc.close();
    }
}
