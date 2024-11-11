import java.util.Scanner;

public class Eje2 {
    public static void main(String[] args) {
        //Ejercicio 2: Cálculo de salarios semanales
        //Una empresa desea calcular el salario semanal de sus empleados basándose en las horas trabajadas y una tarifa fija por hora.
        //Instrucciones:
        //•	Pide al usuario ingresar la cantidad de empleados.
        //•	Para cada empleado, pide ingresar las horas trabajadas.
        //•	Usa un bucle para calcular el salario de cada empleado (suponiendo una tarifa fija de $15 por hora).
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de trabajadores: ");
        int trabajadores = sc.nextInt();
        for (int i = 1; i <= trabajadores; i++) {
            System.out.println("Ingrese las horas trabajadas del trabajador "+i+": ");
            int Horas = sc.nextInt();
            double sueldo = Horas * 15;
            System.out.println(sueldo);

        }
    }
}
