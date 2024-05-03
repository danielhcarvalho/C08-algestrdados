import javax.swing.*;

public class C08EX30 {
    public static void main(String[] args) {
        double serie, x, n;

        // Solicita o valor de x e verifica se é diferente de zero
        x = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Qual o valor de x?",
                "Exercício 30",
                JOptionPane.QUESTION_MESSAGE));
        while (x == 0) {
            JOptionPane.showMessageDialog(null,
                    "x não deve ser equivalente a zero!",
                    "Exercício 30",
                    JOptionPane.ERROR_MESSAGE);

            x = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Qual o valor de x?",
                    "Exercício 30",
                    JOptionPane.QUESTION_MESSAGE));
        }

        // Solicita o valor de n e verifica se é diferente de zero
        n = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Qual o valor de n?",
                "Exercício 30",
                JOptionPane.QUESTION_MESSAGE));
        while (n == 0) {
            JOptionPane.showMessageDialog(null,
                    "n não deve ser equivalente a zero!",
                    "Exercício 30",
                    JOptionPane.ERROR_MESSAGE);

            n = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Qual o valor de n?",
                    "Exercício 30",
                    JOptionPane.QUESTION_MESSAGE));
        }

        // Calcula a série usando o valor de x e n fornecidos
        serie = x;

        for (int aux = 1; aux <= n; aux++) {
            serie += Math.pow(x, aux) / aux;
        }

        // Imprime o resultado da série
        System.out.printf("S = %.2f", serie);
    }
}
