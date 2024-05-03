import javax.swing.*;

public class C08EX20 {
    public static void main(String[] args) {
        double numero = 1, n;

        // Solicita ao usuário o número de potências de 2 a serem calculadas
        n = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Informe a quantos números deseja imprimir? ",
                "Exercício 20",
                JOptionPane.QUESTION_MESSAGE));

        // Loop para calcular as potências de 2 e armazenar o resultado em "numero"
        for (int aux = 1; aux <= n; aux++) {
            numero *= 2; // Multiplica "numero" por 2 a cada iteração
        }

        // Imprime o resultado da última potência de 2 calculada
        System.out.printf("%.0f\n", numero);
    }
}
