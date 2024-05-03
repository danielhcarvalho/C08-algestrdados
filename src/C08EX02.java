import java.util.Scanner;

public class C08EX02 {
    public static void main(String[] args) {
        // Variáveis para armazenar a nota e o número de faltas do aluno
        int faltas;
        float nota;
        
        // Criação do objeto Scanner para ler a entrada do usuário
        Scanner teclado = new Scanner(System.in);
        
        // Loop para verificar a situação de até 50 alunos
        for (int repetition = 1; repetition <= 50; repetition++) {
            // Solicita ao usuário que insira a nota final do aluno
            System.out.print("Informe a nota final do aluno: ");
            nota = teclado.nextFloat(); // Lê a nota fornecida pelo usuário
            
            // Se a nota for negativa, encerra o programa
            if (nota <= -1) {
                break;
            }
            
            // Solicita ao usuário que insira o número de faltas do aluno
            System.out.print("Informe quantas faltas o aluno tem: ");
            faltas = teclado.nextInt(); // Lê o número de faltas fornecido pelo usuário
            
            // Verifica se o aluno foi aprovado ou reprovado com base na nota e no número de faltas
            if (nota >= 65 && faltas <= 16) {
                System.out.println("Nota = " + nota + " e Falta = " + faltas + " --> ALUNO APROVADO");
            } else if (nota <= 65 || faltas >= 16) {
                System.out.println("Nota = " + nota + " e Falta = " + faltas + " --> ALUNO REPROVADO");
            }
        }
        
        // Fecha o objeto Scanner para liberar recursos
        teclado.close();
    }
}
