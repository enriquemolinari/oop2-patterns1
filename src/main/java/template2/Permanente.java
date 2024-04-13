package template2;

public class Permanente extends Empleado {
    private int cantidadHijos;
    private int cantidadAñosTrabajados;

    public Permanente(float sueldoPorHora,
                      String nombre,
                      int cantidadHijos,
                      int cantidadAñosTrabajados) {
        super(sueldoPorHora, nombre);
        this.cantidadHijos = cantidadHijos;
        this.cantidadAñosTrabajados = cantidadAñosTrabajados;
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
