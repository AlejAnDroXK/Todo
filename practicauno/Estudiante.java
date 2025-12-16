package practicauno;

import java.time.LocalDate;

public class Estudiante {
    private String primerNombre;
    private String apellido;
    private int anioNacimiento;
    private double promedio;
    private String materiaFavorita;

    public Estudiante(String nombre, String apelllido, double promedio, int anioNacimiento, String materiaFavorita) {
        this.primerNombre = nombre;
        this.apellido = apelllido;
        if (promedio >= 0 && promedio <= 100) {
            this.promedio = promedio;
        }else{
            this.promedio = 0;
        }
        this.anioNacimiento = anioNacimiento;
        this.materiaFavorita = materiaFavorita;
    }
    //set
    public void setNombre(String nombre) {
        this.primerNombre = nombre;
    }
    public void setApelllido(String apelllido) {
        this.apellido = apelllido;
    }
    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }
    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 100) {
            this.promedio = promedio;
        }else{
            this.promedio = 0;
        }
    }
    public void setMateriaFavorita(String materiaFavorita) {
        this.materiaFavorita = materiaFavorita;
    }
    //get
    public String getNombre() {
        return primerNombre;
    }
    public String getApelllido() {
        return apellido;
    }
    public int getAnioNacimiento() {
        return anioNacimiento;
    }
    public double getPromedio() {
        return promedio;
    }
    public String getMateriaFavorita() {
        return materiaFavorita;
    }
    //metodo
    public int calcularEdad(){
        int anioActual = LocalDate.now().getYear();
        return anioActual - anioNacimiento;

    }
    public String clasificarRendimiento(){
        if(promedio<60){
            return "Reprobado";
        } else if (promedio >=60 && promedio<74) {
            return "Regular";
        } else if (promedio>=74 && promedio<89) {
            return "Bueno";
        } else {
            return "Excelente";
        }
    }
    public String mostrarInfo(){
        return String.format(
                "Nombre: %s %s\n" +
                        "Año de nacimiento: %d\n" +
                        "Edad: %d años\n" +
                        "Promedio: %.1f\n" +
                        "Rendimiento: %s\n" +
                        "Materia favorita: %s",
                primerNombre, apellido, anioNacimiento, calcularEdad(), promedio, clasificarRendimiento(), materiaFavorita
        );
    }
}
