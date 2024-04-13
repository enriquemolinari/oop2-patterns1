package template2;

public class Temporal extends Empleado {
    private int cantidadHijos;

    public Temporal(float sueldoPorHora, String nombre, int cantidadHijos) {
        super(sueldoPorHora, nombre);
        this.cantidadHijos = cantidadHijos;
    }

    @Override
    protected float descuentos() {
        return 0;
    }

    @Override
    protected float antiguedad() {
        return 0;
    }

    @Override
    protected float salarioFamiliar() {
        return 0;
    }
}
