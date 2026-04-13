package composite2;

import java.util.ArrayList;
import java.util.List;

public class TareaCompleja implements ItemDeProyecto {
    private String nombre;
    private List<ItemDeProyecto> subtareas = new ArrayList<>(); // No hay herencia común, usamos Object
    private PrintConsola printer;

    public TareaCompleja(String nombre, PrintConsola printer) {
        this.nombre = nombre;
        this.printer = printer;
    }

    public void agregarSubtarea(ItemDeProyecto tarea) {
        subtareas.add(tarea);
    }

    @Override
    public void mostrarTarea(String indent) {
        this.printer.println(indent + "+ " + nombre);
        for (ItemDeProyecto sub : subtareas) {
            sub.mostrarTarea(indent + "  ");
        }
    }
}
