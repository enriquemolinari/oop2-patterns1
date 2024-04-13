package template2;

public abstract class Empleado {
    private float sueldoPorHora;
    private String nombre;

    public Empleado(float sueldoPorHora, String nombre) {
        this.sueldoPorHora = sueldoPorHora;
        this.nombre = nombre;
    }

    public float sueldo(int horasTrabajadas) {
        return this.sueldoPorHora * horasTrabajadas;
    }
}
