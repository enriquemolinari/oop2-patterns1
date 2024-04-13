package template2;

public class Aprendiz extends Empleado {
    public Aprendiz(float sueldoPorHora, String nombre) {
        super(sueldoPorHora, nombre);
    }

    @Override
    public float sueldo(int horasTrabajadas) {
        return super.sueldo(horasTrabajadas);
    }
}
