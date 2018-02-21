import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int size = WIDTH / 8;
        drawWhiteStartRows(size, graphics);
        drawBlackStartRows(size, graphics);
    }
    public static void drawWhiteStartRows(int size, Graphics graphics) {
        graphics.setColor(Color.BLACK);
        int y = 0;
        for (int row = 0; row < 4; row++) {
            int x = size;
            drawARow(size, x, y, graphics);
            y += size * 2;
        }
    }

    public static void drawBlackStartRows(int size, Graphics graphics) {
        graphics.setColor(Color.BLACK);
        int y = size;

        for (int row = 0; row < 4; row++) {
            int x = 0;
            drawARow(size, x, y, graphics);
            y += size * 2;
        }
    }
    public static void drawARow(int size, int x, int y, Graphics graphics) {

        for (int col = 0; col < 4; col++) {
            graphics.fillRect(x, y, size, size);
            x += size * 2;
        }
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