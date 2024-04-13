package composite1;

import java.awt.*;
import java.util.List;

//Composite implementa Figura y se compone de Figura para delegar
public class Dibujo implements Figura {
    private List<Figura> figuras;

    public Dibujo(List<Figura> figuras) {
        this.figuras = figuras;
    }

    @Override
    public void dibujar(Graphics2D g2d) {
        this.figuras.stream().forEach(figura -> figura.dibujar(g2d));
    }
}
