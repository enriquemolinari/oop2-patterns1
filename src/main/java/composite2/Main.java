package composite2;

public class Main {
    public static void main(String[] args) {
        PrintConsola pc = (msg) -> System.out.println(msg);
        var proyecto = new Proyecto(pc);
        TareaCompleja release = new TareaCompleja("Preparar Release", pc);
        Tarea docu = new Tarea("Escribir Documentacion", pc);
        Tarea changelog = new Tarea("Actualizar changelog", pc);
        release.agregarSubtarea(docu);
        release.agregarSubtarea(changelog);

        TareaCompleja qa = new TareaCompleja("QA Testing", pc);
        qa.agregarSubtarea(new Tarea("Correr Tests Automatizados", pc));
        qa.agregarSubtarea(new Tarea("Correr Tests Manuales", pc));

        proyecto.agregar(release);
        proyecto.agregar(qa);

        proyecto.mostrar();
    }
}
