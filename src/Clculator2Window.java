import javax.swing.*;
import java.awt.*;

public class Clculator2Window {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10, 10, 500, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));


        JPanel northPanel = new JPanel();
        mainPanel.add(northPanel, BorderLayout.NORTH);
        JLabel label = new JLabel("Calculadora");
        northPanel.add(label);
        JTextField texto= new JTextField(16);
        northPanel.add(texto);

        JPanel allButtonsPanel = new JPanel(new BorderLayout());
        mainPanel.add(allButtonsPanel, BorderLayout.CENTER);

        JPanel numbersButtonsPanel = new JPanel();
        numbersButtonsPanel.setBackground(Color.LIGHT_GRAY);
        numbersButtonsPanel.setLayout(new GridLayout(4, 4, 10, 10));
        allButtonsPanel.add(numbersButtonsPanel, BorderLayout.CENTER);
        JButton siete = new JButton("7");
        numbersButtonsPanel.add(siete);
        JButton ocho = new JButton("8");
        numbersButtonsPanel.add(ocho);
        JButton nueve = new JButton("9");
        numbersButtonsPanel.add(nueve);
        JButton del = new JButton("DEL");
        del.setBackground(Color.cyan);
        numbersButtonsPanel.add(del);
        JButton cuatro = new JButton("4");
        numbersButtonsPanel.add(cuatro);
        JButton cinco = new JButton("5");
        numbersButtonsPanel.add(cinco);
        JButton seis = new JButton("6");
        numbersButtonsPanel.add(seis);
        JButton mas = new JButton("+");
        numbersButtonsPanel.add(mas);
        JButton uno = new JButton("1");
        numbersButtonsPanel.add(uno);
        JButton dos = new JButton("2");
        numbersButtonsPanel.add(dos);
        JButton tres = new JButton("3");
        numbersButtonsPanel.add(tres);
        JButton menos = new JButton("-");
        numbersButtonsPanel.add(menos);
        JButton punto = new JButton(".");
        numbersButtonsPanel.add(punto);
        JButton cero = new JButton("0");
        numbersButtonsPanel.add(cero);
        JButton barra = new JButton("/");
        numbersButtonsPanel.add(barra);
        JButton por = new JButton("x");
        numbersButtonsPanel.add(por);

        JPanel equalButtonPanel = new JPanel();
        equalButtonPanel.setPreferredSize(new Dimension(0, 50));
        allButtonsPanel.add(equalButtonPanel, BorderLayout.SOUTH);
        equalButtonPanel.setLayout(new GridLayout(1, 2, 10, 10));
        JButton reset = new JButton("RESET");
        reset.setBackground(Color.CYAN);
        equalButtonPanel.add(reset);
        JButton igual = new JButton("=");
        igual.setBackground(Color.pink);
        equalButtonPanel.add(igual);

        f.setContentPane(mainPanel);
        f.repaint();
        f.revalidate();
    }

}
