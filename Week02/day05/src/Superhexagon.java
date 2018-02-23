import javax.swing.*;

import java.awt.*;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Superhexagon {
    public static int RADIUS =50;
    public static void mainDraw(Graphics graphics){

        int minNumberOfHexagons = 4;
        drawHexagon(graphics, minNumberOfHexagons);
    }

    public static void drawHexagon(Graphics graphics, int minNumberOfHexagons) {

        int[] hexagonXPoints = new int[6];
        int[] hexagonYPoints = new int[6];
        int coordinateShiftingX = 0;
        int coordinateShiftingY = 0;
        for (int i = 0; i < minNumberOfHexagons; i++) {
            int angle = 30;
            for (int j = 0; j < 6; j++) {
                double radian = Math.toRadians(angle);
                hexagonXPoints[j] = (int) (coordinateShiftingX * i + WIDTH / 2 + (RADIUS * Math.sin(radian)));
                hexagonYPoints[j] = (int) (coordinateShiftingY * i + HEIGHT / 2 + (RADIUS * Math.cos(radian)));
                angle += 60;
            }
            graphics.drawPolygon(hexagonXPoints, hexagonYPoints, 6);
            coordinateShiftingX = hexagonXPoints[1] - hexagonXPoints[5];
            coordinateShiftingY = hexagonYPoints[1] - hexagonYPoints[5];
        }

    }













    // Don't touch the code below
    static int WIDTH = 700;
    static int HEIGHT = 700;

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