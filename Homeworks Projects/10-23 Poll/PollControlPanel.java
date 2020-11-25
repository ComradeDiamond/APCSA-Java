import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PollControlPanel extends JPanel
                          implements ActionListener
{
  private JButton button1, button2, button3;
  private PollDisplayPanel chartPanel;

  public PollControlPanel(PollDisplayPanel chart)
  {
    chartPanel = chart;

    button1 = new JButton("Catburgers");
    button1.setPreferredSize(new Dimension(120, 30));
    button1.setToolTipText("Order a Catburger");
    button1.addActionListener(this);

    button2 = new JButton("Catnip Sandwiches");
    button2.setPreferredSize(new Dimension(120, 30));
    button2.setToolTipText("Defuse!");
    button2.addActionListener(this);

    button3 = new JButton("Anonymous Kitten");
    button3.setPreferredSize(new Dimension(120, 30));
    button3.setToolTipText("Order Anonymous Kitten from Shop Lift Up");
    button3.addActionListener(this);

    add(button1);
    add(button2);
    add(button3);
  }

  /**
   *  Processes button events
   */
  public void actionPerformed(ActionEvent e)
  {
    JButton button = (JButton)e.getSource();

    if (button == button1)
      chartPanel.vote1();
    else if (button == button2)
      chartPanel.vote2();
    else if (button == button3)
      chartPanel.vote3();
    chartPanel.repaint();
  }

}
