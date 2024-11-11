import java.util.Scanner;

public class Eje1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma;

        do {
            suma = 0;

            System.out.println("Ingrese la cantidad de horas que ocupa estudiando: ");
            int horas = sc.nextInt();
            suma += horas;

            System.out.println("Ingrese la cantidad de horas que ocupa haciendo ejercicio: ");
            horas = sc.nextInt();
            suma += horas;

            System.out.println("Ingrese la cantidad de horas que ocupa leyendo: ");
            horas = sc.nextInt();
            suma += horas;

            System.out.println("Ingrese la cantidad de horas que ocupa en tiempo libre: ");
            horas = sc.nextInt();
            suma += horas;

            if (suma > 12) {
                System.out.println("El total de horas excede las 12 horas en un dia.");
            }
        } while (suma > 12);

        System.out.println("El tiempo total dedicado a actividades es: " + suma + " horas.");

        sc.close();
    }
}
