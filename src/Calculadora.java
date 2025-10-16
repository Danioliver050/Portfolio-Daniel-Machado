
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton[] botoesNumeros = new JButton[10];
    JButton[] botaoFuncoes = new JButton[9];
    JButton botaoSoma, botaoSubtracao, botaoMultiplicacao, botaoDivisao;
    JButton botaoDecimal, botaoIgual, botaoApagar, botaoLimpar, botaoNegativo;
    JPanel panel;

    Font myFont = new Font("SansSerif",Font.BOLD, 30);

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    public calculadora() {

        frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);


        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);
        textField.setEditable(false);
        frame.add(textField);


        botaoSoma = new JButton("+");
        botaoSubtracao = new JButton("-");
        botaoMultiplicacao = new JButton("*");
        botaoDivisao = new JButton("÷");
        botaoDecimal = new JButton(".");
        botaoIgual = new JButton("=");
        botaoApagar = new JButton("C");
        botaoLimpar = new JButton("AC");
        botaoNegativo = new JButton("(-)");

        botaoFuncoes[0] = botaoSoma;
        botaoFuncoes[1] = botaoSubtracao;
        botaoFuncoes[2] = botaoMultiplicacao;
        botaoFuncoes[3] = botaoDivisao;
        botaoFuncoes[4] = botaoDecimal;
        botaoFuncoes[5] = botaoIgual;
        botaoFuncoes[6] = botaoApagar;
        botaoFuncoes[7] = botaoLimpar;
        botaoFuncoes[8] = botaoNegativo;

        for (int i = 0; i < 9; i++) {
            botaoFuncoes[i].addActionListener(this);
            botaoFuncoes[i].setFont(myFont);
            botaoFuncoes[i].setFocusable(false);
        }

        for (int i = 0; i < 10; i++) {
            botoesNumeros[i] = new JButton(String.valueOf(i));
            botoesNumeros[i].addActionListener(this);
            botoesNumeros[i].setFont(myFont);
            botoesNumeros[i].setFocusable(false);
        }


        botaoNegativo.setBounds(50, 430, 100, 50);
        botaoApagar.setBounds(150, 430, 100, 50);
        botaoLimpar.setBounds(250, 430, 100, 50);

        frame.add(botaoNegativo);
        frame.add(botaoApagar);
        frame.add(botaoLimpar);


        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));


        panel.add(botoesNumeros[7]);
        panel.add(botoesNumeros[8]);
        panel.add(botoesNumeros[9]);
        panel.add(botaoMultiplicacao);
        panel.add(botoesNumeros[4]);
        panel.add(botoesNumeros[5]);
        panel.add(botoesNumeros[6]);
        panel.add(botaoSubtracao);
        panel.add(botoesNumeros[1]);
        panel.add(botoesNumeros[2]);
        panel.add(botoesNumeros[3]);
        panel.add(botaoSoma);
        panel.add(botaoDecimal);
        panel.add(botoesNumeros[0]);
        panel.add(botaoIgual);
        panel.add(botaoDivisao);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new calculadora();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == botoesNumeros[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }

        if (e.getSource() == botaoDecimal) {
            textField.setText(textField.getText().concat("."));
        }

        if (e.getSource() == botaoSoma) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }

        if (e.getSource() == botaoSubtracao) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }

        if (e.getSource() == botaoMultiplicacao) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }

        if (e.getSource() == botaoDivisao) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }

        if (e.getSource() == botaoIgual) {
            num2 = Double.parseDouble(textField.getText());

            switch (operator) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> result = num1 / num2;
            }
            textField.setText(String.valueOf(result));
            num1 = result;
        }

        if (e.getSource() == botaoLimpar) {
            textField.setText("");
        }

        if (e.getSource() == botaoApagar) {
            String string = textField.getText();
            textField.setText("");
            for (int i = 0; i < string.length() - 1; i++) {
                textField.setText(textField.getText() + string.charAt(i));
            }
        }

        if (e.getSource() == botaoNegativo) {
            double temp = Double.parseDouble(textField.getText());
            temp *= -1;
            textField.setText(String.valueOf(temp));
        }
    }
}