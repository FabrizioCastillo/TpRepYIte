import java.util.Scanner;

public class Eje5 {
    public static void main(String[] args) {
    //Ejercicio 5: Cálculo de horas extras
        //Una empresa desea calcular las horas extras trabajadas por sus empleados. Si un empleado trabaja más de 40 horas en la semana, las horas adicionales se consideran horas extras.
        //Instrucciones:
        //•	Pide al usuario ingresar el número de empleados.
        //•	Usa un bucle para ingresar las horas trabajadas por cada empleado.
        //•	Si un empleado trabajó más de 40 horas, calcula y muestra las horas extras.
        //•
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de empleados: ");
        int emple = sc.nextInt();
        for (int i = 0; i < emple; i++) {
            System.out.println("Ingrese la cantidad de horas trabajadas del empleado "+ (i+1) + " en la semana: ");
            int hora = sc.nextInt();
            if (hora > 40){
                System.out.println("Las horas extras trabajadas son : " +(hora - 40)+ "hrs");
            }
        }

    }
}
