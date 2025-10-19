package sensor;

public class Temperatura {
    private String idSensor;
    private int valorActual;
    private String unidad;

    public Temperatura(String idSensor, int valorActual, String unidad){
        this.idSensor = idSensor;
        this.valorActual = valorActual;
        this.unidad = unidad;
    }

    public Temperatura() {

    }

    public void setIdSensor(String idSensor) {
        this.idSensor = idSensor;
    }
    public String getIdSensor() {
        return idSensor;
    }
    public void setValorActual(int valorActual) {
        this.valorActual = valorActual;
    }
    public int getValorActual() {
        return valorActual;
    }
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    public String getUnidad() {
        return unidad;
    }
    public void mostrarLectura(){
        System.out.println("El id del sensor es: "+idSensor+", El valor actual es de: "+valorActual+" y su unidad de medida es: "+unidad);
    }
}