import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GraphicRefactor {
  // Don't touch the code below
  static int WIDTH = 602;
  static int HEIGHT = 602;

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

  public static void drawWithRecursion(int startSize, int startX, int startY, Graphics graphics) {
    if (startSize < 1) {
      return;
    } else {
      int space = startSize / 3;
      int x1 = startX;
      int x2 = x1 + space;
      int x3 = x2 + space;
      int x4 = x1 + startSize;
      int y1 = startY;
      int y2 = startY + space;
      int y3 = y2 + space;
      int y4 = y1 + startSize;
      graphics.drawLine(x1, y2, x4, y2); //horizontal 1
      graphics.drawLine(x1, y3, x4, y3); //horizontal 2
      graphics.drawLine(x2, y1, x2, y4); //vertical 1
      graphics.drawLine(x3, y1, x3, y4); //vertical 2
      drawWithRecursion(startSize / 3, x2, y1, graphics);
      drawWithRecursion(startSize / 3, x1, y2, graphics);
      drawWithRecursion(startSize / 3, x2, y3, graphics);
      drawWithRecursion(startSize / 3, x3, y2, graphics);
    }
  }
}
