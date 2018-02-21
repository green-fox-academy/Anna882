import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        int x = 0;
        int y = 0;
        horizontalDraw(y, graphics);
        verticalDraw(x, graphics);
        x = WIDTH;
        y = HEIGHT;
        horizontalDraw(y, graphics);
        verticalDraw(x, graphics);
    }
    public static void verticalDraw(int x, Graphics graphics){
        for (int y = 0; y <= HEIGHT; y += 20)
            lineDrawing(x, y, graphics);

    }
    public static void horizontalDraw(int y, Graphics graphics) {
        for (int x = 0; x <= WIDTH; x += 20)
            lineDrawing(x, y, graphics);
    }

    public static void lineDrawing(int x, int y, Graphics graphics) {
        graphics.drawLine(x, y, WIDTH /2, HEIGHT /2);
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