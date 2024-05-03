import javax.swing.*;

public class C08EX14 {
    public static void main(String[] args)
    {
        // Variáveis para armazenar o número e o símbolo
        int n;
        String simbolo;

        // Solicita ao usuário que digite um número e um caractere e armazena os valores digitados nas variáveis correspondentes
        n = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite um número: ",
                "Exercício 14",
                JOptionPane.QUESTION_MESSAGE));

        simbolo = JOptionPane.showInputDialog(null,
                "Digite um caractere qualquer: ",
                "Exercício 14",
                JOptionPane.QUESTION_MESSAGE);

        // Loop para imprimir um padrão de caracteres no console
        for (int aux = 1; aux <= n; aux++)
        {
            for (int aux2 = 1; aux2 <= n; aux2++)
            {
                // Imprime o símbolo seguido de um espaço
                System.out.print(simbolo + " ");
            }
            // Imprime uma quebra de linha
            System.out.println();
        }
    }
}
