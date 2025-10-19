package sistemainteligente;

public class Luz {
    private String idLuz;
    private int nivelBrillo;
    private Boolean encendida;

    public Luz(String idLuz,int nivelBrillo, boolean encendida){
        this.idLuz = idLuz;
        this.encendida = encendida;
        ajustarBrillo(nivelBrillo);
    }
    public Luz(String idLuz) {
        this.idLuz = idLuz;
        this.encendida = false;
        this.nivelBrillo = 0;
    }
    public Luz() {

    }

    public void setIdLuz(String idLuz) {
        this.idLuz = idLuz;
    }//
    public void setEncendida(Boolean encendida) {
        this.encendida = encendida;
    }//
    public void setNivelBrillo(int nivelBrillo) {
        this.nivelBrillo = nivelBrillo;
    }//
    public void encender(){
        if (encendida==false){
            encendida=true;
        }
    }
    public void apagar(){
        if (encendida==true){
            encendida=false;
        }
    }
    public int ajustarBrillo(int nuevoNivel){
        if(encendida==true){
            if (nuevoNivel>0 && nuevoNivel<=100){
                nuevoNivel=56;
            }else{
                System.out.println("Esta fuera del rango");
            }
        }
        return nuevoNivel;
    }
    public void mostrarEstado(){
        if(encendida==true){
            System.out.println("La luz con el id: "+idLuz+" cambio a  encendida");
        }else if(encendida==false){
            System.out.println("La luz con el id: "+idLuz+" cambio a  apagado");
        }

    }
}