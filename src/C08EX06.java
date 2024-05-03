import javax.swing.*;

public class C08EX06 {
    public static void main(String[] args) {
        // Variáveis para armazenar o número digitado, a soma dos números divisíveis por 4 e a contagem de números pares, ímpares e divisíveis por 3
        long indice, soma = 0;
        int  diviseis3 = 0;

        // Loop para solicitar ao usuário que insira um número por 10 vezes
        for (int aux = 1; aux <= 10; aux++) {
            // Solicita ao usuário que insira um número e armazena o valor digitado na variável indice
            indice = Long.parseLong(JOptionPane.showInputDialog(null,
                    "Informe o número:",
                    "Exercício 6",
                    JOptionPane.QUESTION_MESSAGE));

            // Verifica se o número é par ou ímpar e incrementa a contagem correspondente
            if (indice % 2 == 0) {
                System.out.printf("O número %d é par\n", indice);
            } else {
                System.out.printf("O número %d é ímpar\n", indice);
            }
            
            // Verifica se o número é divisível por 3 e incrementa a contagem de números divisíveis por 3
            if (indice % 3 == 0) {
                diviseis3++;
            }
            
            // Verifica se o número é divisível por 4 e adiciona o número à soma se for o caso
            if (indice % 4 == 0) {
                soma += indice;
            }
        }
        
        // Imprime a soma dos números divisíveis por 4 e o número de números divisíveis por 3
        System.out.printf("A soma dos números informados divisíveis por 4 é igual a %d\nForam digitados %d números que são divisíveis por 3", soma, diviseis3);
    }
}
