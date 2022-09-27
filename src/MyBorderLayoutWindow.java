import javax.swing.*;
import java.awt.*;

public class MyBorderLayoutWindow {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setBounds(10, 10, 550, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        //PARA PONER LOS CM DE LOS BORDES
        //BorderLayout borderLayout = new BorderLayout();
        //borderLayout.setHgap(10);
        //borderLayout.setVgap(10);
        mainPanel.setLayout(new BorderLayout(10,10)); //TAMBIÉN SE PUEDEN PONER ASÍ
        mainPanel.add(new JButton("Hide North Border"), BorderLayout.NORTH);
        mainPanel.add(new JButton("Hide West Border"), BorderLayout.WEST);
        mainPanel.add(new JButton("Hide Center Border"), BorderLayout.CENTER);
        mainPanel.add(new JButton("Hide East Border"), BorderLayout.EAST);
        mainPanel.add(new JButton("Hide South Border"), BorderLayout.SOUTH);

        //mainPanel.setLayout(new BorderLayout(10,10));
        //JButton northbutton = new JButton("Hide North Border");
        //mainPanel.add(northbutton, BorderLayout.North);

        f.setContentPane(mainPanel);
        f.repaint();
        f.revalidate();
    }
}
