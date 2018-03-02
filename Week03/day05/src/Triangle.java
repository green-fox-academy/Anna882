
import javax.swing.*;

import java.awt.*;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {
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
    int startSize = WIDTH;
    int angle = 30;
    drawBigTriangle(angle, startSize, 0, 0, graphics);
  }
  public static void drawBigTriangle(int angle, int startSize, int startX, int startY, Graphics graphics ) {
    graphics.setColor(Color.WHITE);
    int[] pointsX = new int[3];
    int[] pointsY = new int[3];
    pointsX[0] = startX;
    pointsY[0] = startY;
    double radian = Math.toRadians(angle);
    pointsX[2] = startX +startSize / 2;
    pointsY[2] = startY + (int) (startSize * Math.cos(radian));
    pointsX[1] = startX + startSize;
    pointsY[1] = startY;
    graphics.fillPolygon(pointsX, pointsY, 3);
    graphics.setColor(Color.BLACK);
    drawTriangle(startSize/2, pointsX, pointsY, pointsY[2]/2, graphics);
  }
  public static void drawTriangle(int startSize, int[] startX, int[] startY, int height, Graphics graphics ) {
    if (startSize < 10){
      return;
    } else {
      int x1[] = {startX[0], startX[1]-startSize, startX[2]-startSize/2};
      int y1[] = {startY[0], startY[1], startY[1]+ height};
      graphics.drawPolygon(x1, y1, 3);
      int x2[] = {startX[0]+startSize, startX[1], startX[2]+startSize/2};
      int y2[] = {startY[0], startY[1], startY[1]+ height};
      graphics.drawPolygon(x2,y2,3);
      int x3[] = {startX[2]-startSize/2, x2[2], startX[2]};
      int y3[] = {y1[2], y2[2], y2[2]+height};
      graphics.drawPolygon(x3, y3, 3);
      drawTriangle(startSize/2, x2, y2, height/2, graphics);
      drawTriangle(startSize/2,x1,y1, height/2, graphics);
      drawTriangle(startSize/2, x3, y3, height/2,  graphics);

    }
  }
}