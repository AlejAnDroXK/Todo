package sistemaseguridad;

public class MainSistema {
    public static void main(String[] args) {
        Sistema c1= new Sistema();
        Sistema c2= new Sistema("Camino");
        Sistema c3 = new Sistema("fjhdjhjfh");
        c1.setNombreSistema("pami");
        c1.registrarIntentoFallido();
        c1.mostrarEstado();
        c1.registrarIntentoFallido();
        c1.mostrarEstado();
        c1.registrarIntentoFallido();//////
        c1.registrarIntentoFallido();
        c1.registrarIntentoFallido();
        c1.mostrarEstado();
        c1.reiniciarContador();
        c1.mostrarEstado();
        c2.mostrarEstado();
        c3.mostrarEstado();
    }
}