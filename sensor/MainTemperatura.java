package sensor;

public class MainTemperatura {
    public static void main(String[] args) {
        Temperatura c1= new Temperatura();
        Temperatura c2 = new Temperatura("M-8932",44,"ºF");
        c1.setIdSensor("F-7832");
        c1.setUnidad("Fº");
        c1.setValorActual(23);
        c1.mostrarLectura();
        c2.mostrarLectura();
    }
}
