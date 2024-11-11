import java.util.Scanner;

public class Eje3 {
    public static void main(String[] args) {
        //Ejercicio 3: Control de inventario
        //Una tienda necesita revisar el inventario de sus productos y determinar si algún artículo tiene menos de 5 unidades disponibles para realizar un pedido.
        //Instrucciones:
        //•	Pide al usuario ingresar el número de productos.
        //•	Usa un bucle para ingresar la cantidad disponible de cada producto.
        //•	Si algún producto tiene menos de 5 unidades, muestra un mensaje indicando que es necesario realizar un pedido.
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de productos:");
        int numProductos = sc.nextInt();

        for (int i = 1; i <= numProductos; i++) {
            System.out.println("Ingrese la cantidad disponible del producto " + i + ":");
            int cantidad = sc.nextInt();

            if (cantidad < 5) {
                System.out.println("El producto " + i + " tiene menos de 5 unidades. Es necesario realizar un pedido.");
            }
        }

        sc.close();

    }
}
