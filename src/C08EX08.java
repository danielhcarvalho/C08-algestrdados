import java.util.Scanner;

public class C08EX08 {
    public static void main(String[] args) {
        // Variáveis para armazenar o número de faltas, o número de alunos com mais de 16 faltas, a nota, a soma das notas e a média das notas
        int faltas, faltas16 = 0, aux;
        double nota, soma = 0, media;
        
        try (// Criação do objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in)) {
            // Loop para registrar a nota e o número de faltas de 3 alunos
            for (aux = 1; aux <= 3; aux++) {
                // Solicita ao usuário que insira a nota final do aluno e armazena o valor digitado na variável nota
                System.out.print("Informe a nota final do aluno: ");
                nota = sc.nextFloat();
                
                // Adiciona a nota à soma das notas
                soma += nota;
                
                // Solicita ao usuário que insira o número de faltas do aluno e armazena o valor digitado na variável faltas
                System.out.print("Informe quantas faltas o aluno tem: ");
                faltas = sc.nextInt();
                
                // Verifica se o aluno foi aprovado ou reprovado com base na nota e no número de faltas e imprime a situação do aluno
                if (nota >= 65 && faltas <= 16) {
                    System.out.printf("Nota = %5.2f e Falta = %d --> ALUNO APROVADO\n", nota, faltas);
                } else if (nota <= 65 || faltas >= 16) {
                    System.out.printf("Nota = %5.2f e Falta = %d --> ALUNO REPROVADO\n", nota, faltas);
                }
                
                // Verifica se o aluno tem mais de 16 faltas e incrementa o contador correspondente
                if (faltas > 16) {
                    faltas16++;
                }
            }
            
            // Calcula a média das notas
            media = soma / aux;
            
            // Imprime a média das notas dos alunos aprovados e o número de alunos com mais de 16 faltas
            System.out.printf("Média das notas dos aprovados = %5.2f\nQuantidade de alunos com mais de 16 faltas = %d", media, faltas16);
            sc.close();
        }
    }
}
