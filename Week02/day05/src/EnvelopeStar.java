import javax.swing.*;

import java.awt.*;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
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
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.GREEN);
        int numberOfLines = 30;
        int[] xCoordinatesOfLine = new int[numberOfLines];
        int[] yCoordinatesOfLine = new int[numberOfLines];
        int fixXCoordinate = WIDTH/2;
        int fixYCoordinate = HEIGHT/2;
        for (int i = 0; i < numberOfLines; i++) {
            xCoordinatesOfLine[i] = WIDTH/numberOfLines * i;
            yCoordinatesOfLine[i] = HEIGHT/numberOfLines * i;
        }
        for (int i = 0; i < numberOfLines/2; i++) {
            graphics.drawLine(xCoordinatesOfLine[i], fixYCoordinate,
                    fixXCoordinate, yCoordinatesOfLine[numberOfLines/2-1-i]);
        }
        for (int i = 0; i < numberOfLines/2; i++) {
            graphics.drawLine(xCoordinatesOfLine[numberOfLines/2-1-i], fixYCoordinate,
                    fixXCoordinate, yCoordinatesOfLine[numberOfLines-1-i]);
        }
        for (int i = 0; i < numberOfLines/2; i++) {
            graphics.drawLine(fixXCoordinate, yCoordinatesOfLine[numberOfLines-i-1],
                    xCoordinatesOfLine[numberOfLines/2-1+i], fixYCoordinate);
        }
        for (int i = 0; i < numberOfLines/2; i++) {
            graphics.drawLine(fixXCoordinate, yCoordinatesOfLine[numberOfLines/2-i-1],
                    xCoordinatesOfLine[numberOfLines-1-i], fixYCoordinate);
        }
    }
}