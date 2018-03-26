import javax.swing.*;

import java.awt.*;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagon {
  static int RADIUS =50;
  static int MIN_NUMBER_OF_HEXAGONS = 4;


  public static void mainDraw(Graphics graphics){

    drawHexagon(graphics);
  }

  public static void drawHexagon(Graphics graphics) {

    drawOneHexagon(graphics); }
       /* for (int i = 0; i < MIN_NUMBER_OF_HEXAGONS; i++) {
            int angle = 30;
            for (int j = 0; j < 6; j++) {
                double radian = Math.toRadians(angle);
                hexagonXPoints[j] = (int) (coordinateShiftingX * i + WIDTH / 2 + (RADIUS * Math.sin(radian)));
                hexagonYPoints[j] = (int) (coordinateShiftingY * i + HEIGHT / 2 + (RADIUS * Math.cos(radian)));
                angle += 60;
            }
            graphics.drawPolygon(hexagonXPoints, hexagonYPoints, 6);
            coordinateShiftingX = hexagonXPoints[5] - hexagonXPoints[1];
            coordinateShiftingY = hexagonYPoints[5] - hexagonYPoints[1];
        }*/

  public static void drawOneHexagon(Graphics graphics) {
    int[] hexagonXPoints = new int[6];
    int[] hexagonYPoints = new int[6];
    int[] coordinateShifting = new int[2];
    for (int i = 0; i < MIN_NUMBER_OF_HEXAGONS; i++) {
      int angle = 30;
      for (int j = 0; j < 6; j++) {
        double radian = Math.toRadians(angle);
        hexagonXPoints[j] =
                (int) (coordinateShifting[0] * i + WIDTH / 2 + (RADIUS * Math.sin(radian)));

        hexagonYPoints[j]
                = (int) (coordinateShifting[1] * i + HEIGHT / 2 + (RADIUS * Math.cos(radian)));
        angle += 60;
      }
      graphics.drawPolygon(hexagonXPoints, hexagonYPoints, 6);
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