import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.
        String[] colors= {"green", "red", "purple", "yellow", "blue", "black", "gray", "pink"};
        for (int i = 0; i < WIDTH; i++) {
            int size = WIDTH - i;
            int colorIndex = (int) (Math.random() * (colors.length - 1))+1;
            String fillColor = colors[colorIndex];
            squareDrawing(size, fillColor, graphics);
        }
    }
    public static void squareDrawing(int size, String fillColor, Graphics graphics) {
        int x = (WIDTH - size) / 2;
        int y = (HEIGHT - size) / 2;
        graphics.setColor(Color.getColor(fillColor));
        graphics.drawRect(x, y, size, size);

    }



    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}