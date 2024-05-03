import java.util.Scanner;

public class C08EX04 {
    public static void main(String[] args) {
        // Variáveis para armazenar a idade, o número de alunos com mais de 18 anos e o número de alunos com menos de 18 anos
        int age, more18 = 0, less18 = 0;
        String name; // Variável para armazenar o nome do aluno

        // Criação do objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Loop para solicitar o nome e a idade de até 50 alunos
        for (int aux = 1; aux <= 50; aux++) {
            // Solicita ao usuário que insira o nome do aluno
            System.out.print("Informe o nome do aluno: ");
            name = sc.next(); // Lê o nome fornecido pelo usuário
            
            // Solicita ao usuário que insira a idade do aluno
            System.out.print("Informe a idade do aluno: ");
            age = sc.nextInt(); // Lê a idade fornecida pelo usuário
            
            // Verifica se o aluno tem mais de 18 anos e imprime seus dados
            if (age >= 18) {
                System.out.println("Nome: " + name + "\nIdade: " + age);
                more18++;
            } else { // Se o aluno tem 18 anos ou menos, imprime seus dados
                System.out.println("Nome: " + name + "\nIdade: " + age);
                less18++;
            }
        }
        
        // Imprime o número de alunos com mais de 18 anos e o número de alunos com 18 anos ou menos
        System.out.println("Maiores de 18: " + more18 + "\nMenores de 18: " + less18);
        
        // Fecha o objeto Scanner para liberar recursos
        sc.close();
    }
}
