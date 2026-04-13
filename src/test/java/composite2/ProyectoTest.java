package composite2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProyectoTest {

    @Test
    public void test01() {
        var fakePrinter = new FakePrintConsola();
        var proyecto = new Proyecto(fakePrinter);
        TareaCompleja release = new TareaCompleja("Preparar Release", fakePrinter);
        Tarea docu = new Tarea("Escribir Documentacion", fakePrinter);
        Tarea changelog = new Tarea("Actualizar changelog", fakePrinter);
        release.agregarSubtarea(docu);
        release.agregarSubtarea(changelog);

        TareaCompleja qa = new TareaCompleja("QA Testing", fakePrinter);
        qa.agregarSubtarea(new Tarea("Correr Tests Automatizados", fakePrinter));
        qa.agregarSubtarea(new Tarea("Correr Tests Manuales", fakePrinter));

        proyecto.agregar(release);
        proyecto.agregar(qa);

        proyecto.mostrar();

        assertEquals(
                "+ Preparar Release\n" +
                        "  - Escribir Documentacion\n" +
                        "  - Actualizar changelog\n" +
                        "+ QA Testing\n" +
                        "  - Correr Tests Automatizados\n" +
                        "  - Correr Tests Manuales\n", fakePrinter.salida());
    }
}
