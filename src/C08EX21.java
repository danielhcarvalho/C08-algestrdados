import javax.swing.*;

public class C08EX21 {
    public static void main(String[] args) {
        String situacao;
        double altura, imc;

        // Solicita a altura do usuário
        altura = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Qual a sua altura?",
                "Exercício 21",
                JOptionPane.QUESTION_MESSAGE));

        // Exibe os cabeçalhos das colunas
        System.out.println("PESO..........IMC..........SITUAÇÃO CORPÓREA");

        // Loop para calcular e exibir o IMC para pesos de 60 kg a 100 kg
        for (int peso = 60; peso <= 100; peso++) {
            // Calcula o IMC para o peso atual
            imc = peso / Math.pow(altura, 2);

            // Determina a situação corporal com base no IMC calculado
            if (imc < 20) {
                situacao = "ABAIXO DO PESO";
            } else if (imc >= 20 && imc <= 25) {
                situacao = "PESO IDEAL";
            } else {
                situacao = "ACIMA DO PESO";
            }

            // Exibe os dados formatados
            System.out.printf("%dkg..........%.2f..........%s\n", peso, imc, situacao);
        }
    }
}
