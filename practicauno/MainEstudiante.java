package practicauno;

import javax.swing.*;

public class MainEstudiante {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese el primer nombre del estudiante:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del estudiante:");
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento del estudiante:"));
        String materia = JOptionPane.showInputDialog("Ingrese la materia favorita del estudiante:");

        double promedio;
        do {
            promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el promedio del estudiante (0 - 100):"));
            if (promedio < 0 || promedio > 100) {
                JOptionPane.showMessageDialog(null, "Error: el promedio debe estar entre 0 y 100.");
            }
        } while (promedio < 0 || promedio > 100);

        // Crear objeto
        Estudiante est = new Estudiante(nombre, apellido, promedio, anio, materia);

        // Mostrar resultados
        JOptionPane.showMessageDialog(null, est.mostrarInfo(), "Información del Estudiante", JOptionPane.INFORMATION_MESSAGE);
    }

}

