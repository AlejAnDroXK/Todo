package bases;

import s4.s4_1Ejer_Factura.Factura;

import javax.swing.*;

public class MainEstudio {
    public static void main(String[] args) {

        Estudio e1 = new Estudio();   //crea un objeto
        e1.setNombreVariable("Ana"); // Usas el SETTER → guardas el valor "Ana"
        System.out.println("El nombre es: " + e1.getNombreVariable()); // Usas el GETTER → obtienes el valor "Ana"


        String numeroPieza = JOptionPane.showInputDialog("Ingrese el número de pieza:");
        String descripcionPieza = JOptionPane.showInputDialog("Ingrese la descripción de la pieza:");

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de artículos:"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio por artículo:"));
        Factura factura = new Factura(numeroPieza, descripcionPieza, cantidad, precio);
        String mensaje = String.format(
                "Factura:\nNúmero de pieza: %s" +
                        "\nDescripción: %s" +
                        "\nCantidad: %d" +
                        "\nPrecio por artículo: %.2f" +
                        "\nMonto total: %.2f",
                factura.getNumpieza(),
                factura.getDescpieza(),
                factura.getCantidad(),
                factura.getPrecio(),
                factura.obtenerMontoFactura()
        );

        JOptionPane.showMessageDialog(null, mensaje, "Detalles de la Factura", JOptionPane.INFORMATION_MESSAGE);

    }
}
