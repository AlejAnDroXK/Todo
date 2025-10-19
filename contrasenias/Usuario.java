package contrasenias;

public class Usuario {
    private String nombre;
    private String contrasenia;
    private String correo;

    public Usuario(String nombre,String contrasenia,String correo){
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.correo = correo;
    }

    public Usuario() {

    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public void setContrasenia(String contrasenia){

        if(contrasenia.length() >= 8)
            this.contrasenia = contrasenia;
    }

    public void mostrarDatos(){

        System.out.println("Nombre: "+nombre+"\nCorreo: "+correo);
        System.out.println("contrasenia: "+contrasenia);
    }

}