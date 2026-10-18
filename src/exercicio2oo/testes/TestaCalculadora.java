package exercicio2oo.testes;


import javax.swing.JOptionPane;
import exercicio2oo.classes.Calculadora;

public class TestaCalculadora {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        do {
            String numero1 = JOptionPane.showInputDialog("Digite o primeiro numero :");
            String numero2 = JOptionPane.showInputDialog("Digite o segundo numero: ");


            if (numero1 == null || numero2 == null) {
                System.exit(0);
            }
            else if (numero1.equals("") || numero2.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Erro: digite novamente!");
                continue;
            }

            double num1 = Double.parseDouble(numero1);
            double num2 = Double.parseDouble(numero2);

            double total = calc.somar(num1, num2);

            JOptionPane.showMessageDialog(
                    null,
                    "O total da soma é: " + total
            );

        } while (true);
    }
}