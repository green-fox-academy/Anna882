import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        int[][] points1 = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        int[][] points2 = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};

        connectWithGreenLine(points1, graphics);
        connectWithGreenLine(points2, graphics);
    }


    public static void connectWithGreenLine(int[][] points, Graphics graphics) {
        graphics.setColor(Color.GREEN);
        int x1, x2, y1, y2;
        for (int i = 0; i < points.length - 1; i++){
            x1 = points[i][0];
            y1 = points[i][1];
            x2 = points[i+1][0];
            y2 = points[i+1][1];
            graphics.drawLine(x1, y1, x2, y2);
        }
        graphics.drawLine(points[points.length-1][0], (points[points.length-1][1]), points[0][0], points[0][1]);

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


// create a 300x300 canvas.