import javax.swing.*;

import java.awt.*;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Graphic {
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
      this.setBackground(Color.yellow);
    }
  }

  public static void mainDraw(Graphics graphics) {
    int startSize = WIDTH;
    int startPointY = 0;
    int startPointX = 0;
    graphics.drawRect(0, 0, startSize, startSize);
    drawWithRecursion(startSize, startPointX, startPointY, graphics);
  }

  public static void drawWithRecursion(int startSize, int startPointX, int startPointY, Graphics graphics){
    if (startSize < 1) {
      return;
    }
    drawOneDimension(startSize, startPointX, startPointY, graphics);
    drawOneDimension(startSize, startPointX, startPointY+startSize*2, graphics);
    drawOneDimension(startSize, startPointX + startSize, startPointY+startSize, graphics);
    drawOneDimension(startSize, startPointX-startSize, startPointY+startSize, graphics);
    drawWithRecursion(startSize/3, startPointX+startSize/3,startPointY, graphics);
  }
  public static void drawOneDimension(int startSize, int startPointX, int startPointY, Graphics graphics){
    int x1 = startSize/3 + startPointX;
    int x2 = startSize/3*2 + startPointX;
    int x3 = startSize+startPointX;
    int y3 = startSize+startPointY;
    int x0 = startPointX;
    int y0 = startPointY;
    int y1 = startSize/3 + startPointY;
    int y2 = startSize/3*2 + startPointY;
    graphics.drawLine(x1, y0, x1, y3);
    graphics.drawLine(x2, y0, x2, y3);
    graphics.drawLine(x0, y1, x3, y1);
    graphics.drawLine(x0, y2, x3, y2);

  }
}
