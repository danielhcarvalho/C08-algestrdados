import javax.swing.*;

public class C08EX07 {
    public static void main(String[] args) {
        // Variáveis para armazenar o nome e a idade do aluno, o número de alunos com até 12 anos, o número de alunos com mais de 30 anos, a soma das idades e a média das idades
        String nome;
        int idade, ate12 = 0, acima30 = 0, soma = 0, aux;

        // Loop para solicitar ao usuário que insira o nome e a idade de 5 alunos
        for (aux = 1; aux <= 5; aux++) {
            // Solicita ao usuário que insira o nome do aluno e armazena o valor digitado na variável nome
            nome = JOptionPane.showInputDialog(null,
                    "Insira o nome do aluno:",
                    "Exercício 7",
                    JOptionPane.QUESTION_MESSAGE);
            
            // Solicita ao usuário que insira a idade do aluno e armazena o valor digitado na variável idade
            idade = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Insira a idade do aluno:",
                    "Exercício 7",
                    JOptionPane.QUESTION_MESSAGE));
            
            // Imprime o nome e a idade do aluno
            System.out.printf("%s, %d\n", nome, idade);
            
            // Adiciona a idade do aluno à soma das idades
            soma += idade;
            
            // Verifica se o aluno tem até 12 anos e incrementa o contador correspondente
            if (idade <= 12) {
                ate12++;
            } else if (idade > 30) { // Verifica se o aluno tem mais de 30 anos e incrementa o contador correspondente
                acima30++;
            }
        }
        
        // Calcula a média das idades
        float media = (float) soma / aux;
        
        // Imprime o número de alunos com até 12 anos, o número de alunos com mais de 30 anos e a média das idades
        System.out.printf("Alunos que têm até 12 anos = %d\nAlunos que têm mais de 30 anos = %d\nMédia das idades informadas = %7.1f", ate12, acima30, media);
    }
}
