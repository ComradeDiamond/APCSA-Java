// ________________________________________________

import java.awt.*;
import javax.swing.*;

public class Rainbow extends JPanel
{
  Color skyColor = Color.CYAN;

  public Rainbow()
  {
    setBackground(skyColor);
  }

  // Draws the rainbow.
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth();    
    int height = getHeight();

    // Declare and initialize local int variables xCenter, yCenter
    int xCenter = width/2;
    int yCenter = height/2;
 
    // Declare and initialize the radius of the large semicircle:
    int largeRadius = width/2;
    // ________________________________________________

    g.setColor(Color.RED);

    // Draw the large semicircle:
    // g.fillArc( ______________ );

    g.fillArc(xCenter/2, yCenter/2, largeRadius, largeRadius, 0, 180);

    // Declare and initialize the radii of the small and medium
    // semicircles and draw them:

    int smallRadius = width/4;
    int skyRadius = width/6;
    int tinyRadius = width/8;

    g.setColor(Color.GREEN);
    g.fillArc((xCenter /2) + (smallRadius/2), (yCenter/2) + (smallRadius/2), smallRadius, smallRadius, 0, 180);

    g.setColor(Color.MAGENTA);
    g.fillArc(xCenter/2 + (smallRadius/2) + (skyRadius/3), yCenter/2 + (smallRadius/2) + (skyRadius/3), skyRadius, skyRadius, 0, 180);

    g.setColor(Color.CYAN);
    g.fillArc(xCenter/2 + (smallRadius/2) + (skyRadius/3) + (tinyRadius/2), yCenter/2 + (smallRadius/2) + (skyRadius/3) + (tinyRadius/2), tinyRadius/2, tinyRadius/2, 0, 180);
    // ________________________________________________

    // Calculate the radius of the innermost (sky-color) semicircle
    // so that the width of the middle (green) ring is the
    // arithmetic mean of the widths of the red and magenta rings:
    // ________________________________________________

    // Draw the sky-color semicircle:
    // ________________________________________________
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 300, 200);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}
