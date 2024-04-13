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
    public float sueldo(int horasTrabajadas) {
        return super.sueldo(horasTrabajadas)
                + salarioFamiliar()
                + antiguedad()
                - descuentos();
    }

    protected float salarioFamiliar() {
        //lógica de calculo de sueldo por hijo
        return 0;
    }

    private float antiguedad() {
        //lógica de calculo segun antiguedad
        return 0;
    }

    private float descuentos() {
        //lógica de calculo de obra social y jubilacion
        return 0f;
    }
}
