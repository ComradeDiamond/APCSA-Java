import java.awt.*;
import java.awt.Container;
import javax.swing.*;

public class Targot extends JPanel {
    public static void main(String[] args)
    {
        JFrame window = new JFrame("Target Logo");
        window.setBounds(500, 500, 500, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel target = new Targot();
        target.setBackground(Color.GRAY);

        Container container = window.getContentPane();
        container.add(target);
        window.setVisible(true);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);  // Call JPanel's paintComponent method
                                  // to paint the background
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        g.setColor(Color.WHITE);
        g.fillOval(xCenter-75, yCenter-75, 150, 150);
        
        g.setColor(Color.BLACK);
        g.fillOval(xCenter-67, yCenter-67, 134, 134);

        g.setColor(Color.WHITE);
        g.fillOval(xCenter-55, yCenter-55, 110, 110);

        g.setColor(Color.BLACK);
        g.fillOval(xCenter-45, yCenter-45, 90, 90);

        g.setColor(Color.CYAN);
        g.fillOval(xCenter-30, yCenter-30, 60, 60);

        g.setColor(Color.red);
        g.fillOval(xCenter-20, yCenter-20, 40, 40);

        g.setColor(Color.YELLOW);
        g.fillOval(xCenter-10, yCenter-10, 20, 20);
    }
}
