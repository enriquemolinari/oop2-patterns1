package template2;

import java.time.DayOfWeek;
import java.time.LocalDate;

class ReSuper implements Nafta {
    public static final String CANTIDAD_LITROS_INCORRECTO = "Ingrese en litros un valor positivo";
    private float descuento;
    private float precioXLitro;

    ReSuper(float descuento, float precioXLitro) {
        this.descuento = descuento;
        this.precioXLitro = precioXLitro;
    }

    private boolean esJueves() {
        LocalDate fechaActual = LocalDate.now();
        DayOfWeek diaDeLaSemana = fechaActual.getDayOfWeek();
        return diaDeLaSemana == DayOfWeek.THURSDAY;
    }

    @Override
    public float calcularMonto(float litros) {
        if (litros <= 0) {
            throw new RuntimeException(CANTIDAD_LITROS_INCORRECTO);
        }
        float total = litros * precioXLitro;
        if (esJueves()) {
            return total -= total * descuento;
        }
        return total;
    }
}
