import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
        double horasTotales = 0;
        int contador = 1;

        while (contador <= 4 && horasTotales <= 24) {
            double horas = 0;
            if (contador == 1) {
                horas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas dedicadas a estudiar: "));
            } else if (contador == 2) {
                horas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas dedicadas a hacer ejercicios: "));
            } else if (contador == 3) {
                horas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas dedicadas a leer: "));
            } else if (contador == 4) {
                horas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas de tiempo libre: "));
            }
            horasTotales += horas;
            if (horasTotales > 24) {
                JOptionPane.showMessageDialog(null, "La cantidad de horas ha superado las 24 horas. Revise las entradas.");
                horasTotales -= horas;
            } else {
                contador++;
            }
        }

        JOptionPane.showMessageDialog(null, "El tiempo total dedicado a todas las actividades es de " + horasTotales + " horas.");
    }
}

