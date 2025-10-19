package factura;

public class Facturas {
    private int numFactura;
    private String producto;
    private int cantidad;
    private double precio;
    //atributo de clase
    private  static int facturas;

    public Facturas(double precio, int cantidad, String producto) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.producto = producto;
        numFactura=facturas++;
    }
    public Facturas(){
        facturas++;
        numFactura= facturas;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public static int getFacturas() {
        return facturas;
    }

    public double getPrecio() {
        return precio;
    }
}
