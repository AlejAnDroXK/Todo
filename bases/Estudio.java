package bases;

public class Estudio {
    //Variables o atributos
    private String nombreVariable;
    //Constructor
    public Estudio(String nombreVariable) {
        this.nombreVariable = nombreVariable;
    }
    public Estudio() {}
    //get
    //sirve para leer o obtener el valor de esa variable desde fuera de la clase
    //sacar un valor del objeto
    public String getNombreVariable() {
        return nombreVariable;
    }
    //set
    //sirve para asignar o cambiar el valor de una variable (atributo) dentro de la clase
    //poner un valor dentro del objeto
    public void setNombreVariable(String nombreVariable) {
        this.nombreVariable = nombreVariable;
        //this.nombreVariable = "n";
    }

    //metodo
    public double obtenerMontoFactura(){
        //return cantidad * precio;
        return 0;
    }
    public void aumento(double aumento) {//el aumento es el dato en el main deberia estartipo e1.aumento(10)
        //salario= salario+(salario*aumento/100);
    }

    public String info() {
        return String.format(
                "Nombre: %s %s\n" +
                        "Fecha de nacimiento: %02d/%02d/%04d \n" +
                        "nAltura: %.1f cm\nPeso: %.1f kg"
                /*nombre, apellido, dia, mes, anio,altura,peso*/
        );
    }
}
