package sistemainteligente;

public class MainLuz {
    public static void main(String[] args) {
        Luz c1 = new Luz();
        Luz c2 = new Luz("2_4365");
        c1.setIdLuz("1_9856");
        c1.setEncendida(true);
        c1.apagar();
        c1.mostrarEstado();


        c2.setEncendida(false);
        c2.encender();
        c2.mostrarEstado();




    }
}