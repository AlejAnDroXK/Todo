package sistemaseguridad;

public class Sistema {
    private String nombreSistema;
    private int intentosFallidos;

    public Sistema(String nombreSistema){
        this.nombreSistema = nombreSistema;
        this.intentosFallidos = 0;
    }

    public Sistema() {

    }

    public void setNombreSistema(String nombreSistema) {
        this.nombreSistema = nombreSistema;
    }
    public String getNombreSistema() {
        return nombreSistema;
    }
    public int getIntentosFallidos() {
        return intentosFallidos;
    }

    public void registrarIntentoFallido () {
        intentosFallidos++;
    }
    public void reiniciarContador(){
        intentosFallidos=0;
    }

    public void mostrarEstado(){
        if (intentosFallidos>=3){
            System.out.println("Fallos, mas de tres intentos "+intentosFallidos+" el sistema esta bloqueado en el programa: "+ nombreSistema);
        }else{
            System.out.println("Tus intentos del sistema : "+nombreSistema+" son "+intentosFallidos);
        }
    }
}
