import javax.swing.*;
import java.awt.*;

public class CalculatorWindow {

    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setBounds(10, 10, 550, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));

        JPanel panel1 = new JPanel();
        mainPanel.add(panel1, BorderLayout.NORTH);
        JLabel label = new JLabel("Calculadora");
        panel1.add(label);
        JTextField texto= new JTextField(16);
        panel1.add(texto);

        JPanel panel2 = new JPanel();
        mainPanel.add(panel2, BorderLayout.CENTER);
        panel2.setLayout(new GridLayout(5, 4, 5, 5));
        JButton rtc = new JButton("Rtc");
        //rtc.addActionListener(
        //    e -> {
        //   }
        //  );
        panel2.add(rtc);
        JButton ce = new JButton("CE");
        panel2.add(ce);
        JButton cl = new JButton("CL");
        panel2.add(cl);
        JButton masmenos = new JButton("+/-");
        panel2.add(masmenos);
        JButton siete = new JButton("7");
        panel2.add(siete);
        JButton ocho = new JButton("8");
        panel2.add(ocho);
        JButton nueve = new JButton("9");
        panel2.add(nueve);
        JButton barra = new JButton("/");
        panel2.add(barra);
        JButton cuatro = new JButton("4");
        panel2.add(cuatro);
        JButton cinco = new JButton("5");
        panel2.add(cinco);
        JButton seis = new JButton("6");
        panel2.add(seis);
        JButton por = new JButton("x");
        panel2.add(por);
        JButton uno = new JButton("1");
        panel2.add(uno);
        JButton dos = new JButton("2");
        panel2.add(dos);
        JButton tres = new JButton("3");
        panel2.add(tres);
        JButton menos = new JButton("-");
        panel2.add(menos);
        JButton cero = new JButton("0");
        panel2.add(cero);
        JButton punto = new JButton(".");
        panel2.add(punto);
        JButton igual = new JButton("=");
        panel2.add(igual);
        JButton mas = new JButton("+");
        panel2.add(mas);

        f.setContentPane(mainPanel);
        f.repaint();
        f.revalidate();
    }
}
