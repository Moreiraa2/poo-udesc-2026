package exercicio3oo.testes;

import javax.swing.JOptionPane;
import exercicio3oo.classes.Calculadora;

public class TestaCalculadora {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        do {
            String numero1 = JOptionPane.showInputDialog(
                    "Digite o primeiro número:"
            );

            String numero2 = JOptionPane.showInputDialog(
                    "Digite o segundo número:"
            );

            // Verifica se o usuário cancelou
            if (numero1 == null || numero2 == null) {
                System.exit(0);
            }

            // Verifica se os campos estão vazios
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

                // Utilizando setters
                calc.setN1(num1);
                calc.setN2(num2);

                // Realizando a soma
                calc.somar();

                // Utilizando getter
                JOptionPane.showMessageDialog(
                        null,
                        String.format(
                                "O total da soma é: %.2f",
                                calc.getResultado()
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