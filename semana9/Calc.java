import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc implements ActionListener {

    private JFrame janela;
    private JPanel painel;

    // componentes da janela
    private JLabel lblTitulo;
    private JLabel lblNum1;
    private JLabel lblNum2;

    private JTextField txtNum1;
    private JTextField txtNum2;

    private JButton btnSomar;

    private JLabel lblResultado;

    public Calc() {
        janela = new JFrame("Semana 9 - Calculadora");

        painel = new JPanel();
        painel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        painel.setLayout(new GridLayout(0, 1));

        // desenhar tela
        lblTitulo = new JLabel("Calculadora");
        lblTitulo.setFont(new Font("Verdana", Font.BOLD, 30));
        painel.add(lblTitulo);

        lblNum1 = new JLabel("Digite o primeiro termo:");
        painel.add(lblNum1);
        txtNum1 = new JTextField("0");
        painel.add(txtNum1);

        lblNum2 = new JLabel("Digite o segundo termo:");
        painel.add(lblNum2);
        txtNum2 = new JTextField("0");
        painel.add(txtNum2);

        btnSomar = new JButton("Somar");
        btnSomar.addActionListener(this);
        painel.add(btnSomar);

        lblResultado = new JLabel("Resultado = ");
        painel.add(lblResultado);

        janela.add(painel, BorderLayout.CENTER);
        janela.setSize(300, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        try {

            Integer num1 = Integer.parseInt(txtNum1.getText());
            Integer num2 = Integer.parseInt(txtNum2.getText());

            lblResultado.setText("Resultado = " + (num1 + num2));
            lblResultado.setForeground(Color.BLACK);
        } catch (NumberFormatException e) {
            lblResultado.setText("***Erro** Entre apeans com números!");
            lblResultado.setForeground(Color.RED);
        } catch (Exception e) {
            System.err.println("Erro não identificado" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Calc();
    }
}