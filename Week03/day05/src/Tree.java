
import javax.swing.*;

import java.awt.*;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tree {
  // Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

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
    graphics.fillRect(0, 0, WIDTH, WIDTH);
    graphics.setColor(Color.ORANGE);
    int startSize = 50;
    int x1 = WIDTH / 2;
    int y1 = HEIGHT - startSize;
    int numberOfLines = 3;
    int angle = 0;
    drawWithRecursion(numberOfLines, startSize-4, x1, y1, angle+30, graphics);
  }
  public static void drawWithRecursion(int numberOfLines, int startSize, int startX, int startY, int angle, Graphics graphics) {
    if (startSize < 20) {
    return;
    } else {
      double radian = Math.toRadians(angle);
      int endXPoint1 = (int) (startX - (startSize * Math.sin(radian)));
      int endYPoint1 = (int) (startY - (startSize * Math.cos(radian)));
      graphics.drawLine(startX, startY, endXPoint1, endYPoint1);
      int endXPoint2 = (int) (startX + (startSize * Math.sin(radian)));
      int endYPoint2 = (int) (startY + (startSize * Math.cos(radian)));
      graphics.drawLine(startX, startY, endXPoint2, endYPoint2);
      drawWithRecursion(numberOfLines-1, startSize-5, endXPoint1, endYPoint1, angle + 30, graphics);

      //drawWithRecursion(numberOfLines-1, startSize, startX, startY, angle -30, graphics);
      //drawWithRecursion(numberOfLines-1, startSize, endXPoint, endYPoint, angle - 30, graphics);
      //drawWithRecursion(numberOfLines-1, startSize-4, endXPoint, endYPoint, angle + 30, graphics);
    }
  }
}