import java.text.NumberFormat;
import java.util.Scanner;

public class C08EX15
{
    public static void main(String[] args)
    {

        // Variáveis para armazenar os dados dos funcionários e as estatísticas
        String nome, cargo, salarioFormatado, media, nomeMaiorSalario = "";
        double salario, soma = 0, maiorSalario = 0;
        int idade, contador = 0, funcionarioAte18 = 0, aux = 1000;

        // Scanner para ler os dados do arquivo C08EX15.txt
        Scanner funcionarios = new Scanner(C08EX15.class.getResourceAsStream("C08EX15.txt")); //fazer download do arquivo C08EX15.txt no mesmo diretório do github

        // Loop para processar os dados de cada funcionário no arquivo
        while (funcionarios.hasNextLine())
        {
            // Lê os dados do funcionário do arquivo
            nome = funcionarios.nextLine();
            cargo = funcionarios.nextLine();
            salario = funcionarios.nextDouble();
            idade = funcionarios.nextInt();
            funcionarios.nextLine();

            // Formata o salário como moeda
            salarioFormatado = NumberFormat.getCurrencyInstance().format(salario);
            contador++;

            // Verifica se o funcionário é sênior e imprime os detalhes do funcionário
            if (salario > 10000 && idade > 50)
            {
                System.out.printf("Nome: %s --> Idade: %d --> Cargo: %s --> Salário: %s --> FUNCIONÁRIO SÊNIOR\n", nome, idade, cargo, salarioFormatado);

            }
            else
            {
                System.out.printf("Nome: %s --> Idade: %d --> Cargo: %s --> Salário: %s\n", nome, idade, cargo, salarioFormatado);
            }

            // Verifica se o funcionário tem até 18 anos e calcula a média dos salários desses funcionários
            if (idade <= 18)
            {
                funcionarioAte18++;
                soma += salario;
            }

            // Verifica se o salário do funcionário atual é o maior salário registrado até o momento
            if (contador == 1 || salario > maiorSalario)
            {
                maiorSalario = salario;
                nomeMaiorSalario = nome;
            }

            // Verifica se o número máximo de funcionários foi alcançado
            if (contador >= aux)
            {
                break;
            }
        }
        // Calcula e formata a média dos salários dos funcionários com até 18 anos
        media = NumberFormat.getCurrencyInstance().format(soma/funcionarioAte18);
        
        // Imprime as estatísticas finais: quantidade de funcionários registrados, média dos salários dos funcionários com até 18 anos e funcionário com o maior salário
        System.out.printf("Foram registrados %d funcionarios\nMédia dos salários dos funcionário com até 18 anos: %s\nFuncionário com o maior salário: %s, %s", contador, media, nomeMaiorSalario, NumberFormat.getCurrencyInstance().format(maiorSalario));
        funcionarios.close();
    }

}
