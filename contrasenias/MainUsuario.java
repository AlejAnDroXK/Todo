package contrasenias;

public class MainUsuario {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario("Manolo","pappao","mano@udla");
        u1.setNombre("juanito");
        u1.setCorreo("juanito@udla");
        u1.setContrasenia("juangfgfgfg");
        u1.mostrarDatos();

        u1.setContrasenia("12345656456");
        System.out.println();
        u1.mostrarDatos();
        u2.mostrarDatos();
    }
}
