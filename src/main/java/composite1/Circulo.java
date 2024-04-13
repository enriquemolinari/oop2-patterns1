package composite1;

import java.awt.*;

class Circulo implements Figura {
    private int radio;
    private Coordenada coordenada;

    public Circulo(Coordenada coordenada, int radio) {
        this.radio = radio;
        this.coordenada = coordenada;
    }

    @Override
    public void dibujar(Graphics2D g2d) {
        g2d.drawOval(coordenada.x() - radio,
                coordenada.y() - radio,
                radio * 2,
                radio * 2);
    }
}
