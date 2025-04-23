package template2;

public abstract class Empleado {
    private float sueldoPorHora;
    private String nombre;

    public Empleado(float sueldoPorHora, String nombre) {
        this.sueldoPorHora = sueldoPorHora;
        this.nombre = nombre;
    }

    public final float sueldo(int horasTrabajadas) {
        return horasTrabajadas * this.sueldoPorHora
                + salarioFamiliar()
                + antiguedad()
                - descuentos();
    }

    protected abstract float descuentos();

    protected abstract float antiguedad();

    protected abstract float salarioFamiliar();
}
