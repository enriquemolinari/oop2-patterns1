package composite2;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private List<ItemDeProyecto> tareas = new ArrayList<>();
    private PrintConsola printer;

    public Proyecto(PrintConsola printer) {
        this.printer = printer;
    }

    public void agregar(ItemDeProyecto tarea) {
        tareas.add(tarea);
    }

    public void mostrar() {
        for (ItemDeProyecto tarea : tareas) {
            tarea.mostrarTarea("");
        }
    }
}
