package calculadora;
import javax.swing.*;

public class TestaCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.n1 = 40;
        calc.n2 = 2;
        System.out.println(calc.n1);
        System.out.println(calc.n2);
        System.out.println("Soma: " + calc.somar());
        System.out.println("Subtração: " + calc.subtrair());
        System.out.println("Produto: " + calc.multiplicar());
        System.out.println("Quociente: " + calc.dividir());
        System.out.println("Soma: " + calc.somar(50, 100));
        System.out.println("Subtração: " + calc.subtrair(50, 100));
        System.out.println("Produto: " + calc.multiplicar(50, 100));
        System.out.println("Quociente: " + calc.dividir(50, 100));


do{
        // CORREÇÃO 1: Alterado de showConfirmDialog para showInputDialog, trim recebe valor do usario e tira epaco em
        // branco
        String numero1 = JOptionPane.showInputDialog("Digite o primeiro numero :");
        String numero2 = JOptionPane.showInputDialog("Digite o segundo numero: ");
           //verificações de condições de erro

        if (numero1 == null || numero2 == null ) {
           System.exit(0);
        }
   else if (numero1.equals ("") || numero2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Erro digite novamente!");
        }
        else {
            double num1 = Double.parseDouble(numero1);
            double num2 = Double.parseDouble(numero2);

        }

        double num1 = Double.parseDouble(numero1);
        double num2 = Double.parseDouble(numero2);
        double total = calc.somar(num1, num2);

        // CORREÇÃO 2: Concatenado com uma String para evitar erro de tipo
        JOptionPane.showMessageDialog(
                null,
                "O total da soma é: " + total
        );
    } while (true);
}
}