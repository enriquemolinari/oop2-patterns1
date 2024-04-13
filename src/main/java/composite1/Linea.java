package composite1;

import java.awt.*;

class Linea implements Figura {
    private final Coordenada coordenada;
    private int longitud;

    public Linea(Coordenada coordenada, int longitud) {
        this.longitud = longitud;
        this.coordenada = coordenada;
    }

    @Override
    public void dibujar(Graphics2D g2d) {
        g2d.drawLine(coordenada.x(), coordenada.y(), coordenada.x() + longitud, coordenada.y());
    }
}
