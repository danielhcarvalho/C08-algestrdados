import java.util.Scanner;

public class C08EX03 {
    public static void main(String[] args) {
        // Variáveis para armazenar o número de faltas, a nota, o número de reprovados e o número de aprovados
        int faltas, reprovados = 0, aprovados = 0;
        float nota;
        
        // Criação do objeto Scanner para ler a entrada do usuário
        Scanner teclado = new Scanner(System.in);
        
        // Loop para verificar a situação dos alunos
        for (int repetition = 1; repetition <= 2; repetition++) {
            // Solicita ao usuário que insira a nota final do aluno
            System.out.print("Informe a nota final do aluno: ");
            nota = teclado.nextFloat(); // Lê a nota fornecida pelo usuário
            
            // Se a nota for negativa, imprime o número de aprovados e reprovados e encerra o programa
            if (nota <= -1) {
                System.out.println("Aprovados --> " + aprovados + "\nReprovados --> " + reprovados);
                break;
            }
            
            // Solicita ao usuário que insira o número de faltas do aluno
            System.out.print("Informe quantas faltas o aluno tem: ");
            faltas = teclado.nextInt(); // Lê o número de faltas fornecido pelo usuário
            
            // Verifica se o aluno foi aprovado ou reprovado com base na nota e no número de faltas
            if (nota >= 65 && faltas <= 16) {
                System.out.println("Nota = " + nota + " e Falta = " + faltas + " --> ALUNO APROVADO");
                aprovados++;
            } else if (nota <= 65 || faltas >= 16) {
                System.out.println("Nota = " + nota + " e Falta = " + faltas + " --> ALUNO REPROVADO");
                reprovados++;
            }
        }
        
        // Imprime o número de aprovados e reprovados
        System.out.println("Aprovados --> " + aprovados + "\nReprovados --> " + reprovados);
        
        // Fecha o objeto Scanner para liberar recursos
        teclado.close();
    }
}
