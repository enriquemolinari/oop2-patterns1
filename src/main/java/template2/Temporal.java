package template2;

public class Temporal extends Empleado {
    private int cantidadHijos;

    public Temporal(float sueldoPorHora, String nombre, int cantidadHijos) {
        super(sueldoPorHora, nombre);
        this.cantidadHijos = cantidadHijos;
    }

    @Override
    public float sueldo(int horasTrabajadas) {
        return super.sueldo(horasTrabajadas)
                + salarioFamiliar();
    }

    protected float salarioFamiliar() {
        //lógica de calculo de sueldo por hijo
        return 0;
    }
}
