package exercicio5oo.testes;

import exercicio5oo.classes.Calculadora;

import javax.swing.*;

public class TestaCalculadora {

    public static void main(String[] args) {

        Calculadora calcPadrao = new Calculadora();
        Calculadora calcParam = new Calculadora(10.0, 5.0, 15.0);
        System.out.println("Calculadora padrão toString: " + calcPadrao);
        System.out.println("Calculadora parametrizada toString: " + calcParam);

        Calculadora calc = new Calculadora();

        do {
            String numero1 = JOptionPane.showInputDialog(
                    "Digite o primeiro número:"
            );

            String numero2 = JOptionPane.showInputDialog(
                    "Digite o segundo número:"
            );

            if (numero1 == null || numero2 == null) {
                System.exit(0);
            }

            if (numero1.trim().isEmpty() || numero2.trim().isEmpty()) {
                JOptionPane.showMessageDialog(
                        null,
                        "Erro: digite os dois números novamente!"
                );
                continue;
            }

            try {
                double num1 = Double.parseDouble(numero1);
                double num2 = Double.parseDouble(numero2);

                calc.setN1(num1);
                calc.setN2(num2);
                calc.somar();

                JOptionPane.showMessageDialog(
                        null,
                        String.format(
                                "O total da soma é: %.2f\n%s",
                                calc.getResultado(),
                                calc.toString()
                        )
                );

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Erro: digite apenas números válidos!"
                );
            }

        } while (true);
    }
}