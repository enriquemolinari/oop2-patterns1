package composite1;

import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        super("Dibujar Figuras");

        Canvas canvas = new Canvas();
        canvas.agregarFigura(new Linea(new Coordenada(50, 50), 200));
        canvas.agregarFigura(new Circulo(new Coordenada(200, 200), 50));
        canvas.agregarFigura(new Texto(new Coordenada(100, 300), "Hola Mundo"));
        // Dibujame un Dibujo ahora
        // ¿como hago?

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        getContentPane().add(canvas);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }
}
