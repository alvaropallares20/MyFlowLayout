import javax.swing.*;
import java.awt.*;

public class GridBagLayoutWindow {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10, 10, 550, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.add(
                new JButton("Button1"),
                new GridBagConstraints(
                        0,
                        0,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0),
                        0,
                        0
        ));
        mainPanel.add(
                new JButton("Button2"),
                new GridBagConstraints(
                        1,
                        0,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0),
                        0,
                        0
                ));
        mainPanel.add(
                new JButton("Button3"),
                new GridBagConstraints(
                        2,
                        0,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0),
                        0,
                        0
                ));
        mainPanel.add(
                new JButton("Long number button 4"),
                new GridBagConstraints(
                        0,
                        1,
                        3,
                        1,
                        1.0,
                        4.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0),
                        0,
                        0
                ));
        mainPanel.add(
                new JButton("5"),
                new GridBagConstraints(
                        1,
                        2,
                        2,
                        1,
                        1,
                        1,
                        GridBagConstraints.SOUTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0),
                        0,
                        0
                ));







        f.setContentPane(mainPanel);
        f.repaint();
        f.revalidate();
    }

}
