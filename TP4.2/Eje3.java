public class Eje3 {
    public static void main(String[] args) {
//Ejercicio 3: Gestión de clientes
//Una pequeña empresa de servicios tiene una lista de clientes a los que debe enviar facturas, pero quiere procesar solo aquellos que tengan facturas pendientes por más de $500.
//
//**Instrucciones**:
//- Crea un arreglo `clientes` que almacene los nombres de los clientes y un arreglo `facturasPendientes` con el monto de sus facturas pendientes.
//- Escribe una función `enviarFacturas` que imprima los nombres de los clientes con facturas mayores a $500.
        String[] Persona = {"Joaco Marcelo", "Manuel Belgrano", "Juan Francisco", "Uriel Rojo", "Martin Hector"};
        int[] deuda = {100, 500, 600, 680, 40};
    }
    public static void repor(int[] Persona, int[] deuda) {
        for (int i = 0; i < Persona.length; i++) {
            if (deuda[i] > 500) {
                System.out.println(Persona[i]);
            }
        }
    }
}
