package factura;

public class MainFacturas {
    public static void main(String[] args) {
        System.out.println("Actualmente hay "+Facturas.getFacturas());
        Facturas f1 = new Facturas();
        System.out.println("El numero de facturas de f1 es: "+f1.getNumFactura());
        System.out.println("Actualmente hay: "+Facturas.getFacturas());
        Facturas f2 = new Facturas(0.15,4,"peras");
        System.out.println("El numero de factura f2 es: "+f2.getNumFactura());
        System.out.println("Actualmente hay: "+Facturas.getFacturas());

    }
}
