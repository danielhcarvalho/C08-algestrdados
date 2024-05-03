import javax.swing.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class C08EX31 {
    public static void main(String[] args) {
        String nome, codigo, nomeMenorSalario = "", cargo, cargoMenorSalario = "";
        int engenheirosComSalarioMinimo = 0, administradores = 0, outros = 0, qntEngenheirosPesquisados, quantidade = 0;
        double salario, mediaAdm = 0, menorSalario = Double.MAX_VALUE;

        // Scanner para ler os dados do arquivo C08EX31.txt
        Scanner engenheiros = new Scanner(C08EX31.class.getResourceAsStream("C08EX31.txt"));

        // Solicita o número de engenheiros pesquisados
        qntEngenheirosPesquisados = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Qual a quantidade de engenheiros pesquisados?",
                "Exercício 31",
                JOptionPane.QUESTION_MESSAGE));

        // Loop para processar os dados de cada engenheiro no arquivo
        while (engenheiros.hasNextLine()) {
            quantidade++;

            nome = engenheiros.nextLine();
            codigo = engenheiros.nextLine();
            salario = engenheiros.nextDouble();
            engenheiros.nextLine();

            // Determina o cargo do engenheiro com base no código
            switch (codigo) {
                case "C":
                    cargo = "ENGENHEIRO CALCULISTA";
                    break;
                case "P":
                    cargo = "ENGENHEIRO PROJETISTA";
                    break;
                case "O":
                    cargo = "ENGENHEIRO DE OBRA";
                    break;
                case "A":
                    cargo = "ENGENHEIRO ADMINISTRADOR";
                    break;
                default:
                    cargo = "OUTROS";
                    break;
            }

            // Imprime informações sobre o engenheiro
            if ((codigo.equals("C") && salario < 2500) || (codigo.equals("P") && salario < 4650) || (codigo.equals("O") && salario < 3200) || (codigo.equals("A") && salario < 5100)) {
                System.out.printf("ENGENHEIRO: %s\nCARGO: %s\nSALÁRIO: %s --> ABAIXO DO SALÁRIO MÍNIMO\n", nome, cargo, NumberFormat.getCurrencyInstance().format(salario));
                System.out.println();
            } else {
                System.out.printf("ENGENHEIRO: %s\nCARGO: %s\nSALÁRIO: %s\n", nome, cargo, NumberFormat.getCurrencyInstance().format(salario));
                System.out.println();
            }

            // Contabiliza engenheiros com salário igual ou acima do mínimo
            if ((codigo.equals("C") && salario >= 2500) || (codigo.equals("P") && salario >= 4650) || (codigo.equals("O") && salario >= 3200) || (codigo.equals("A") && salario >= 5100)) {
                engenheirosComSalarioMinimo++;
            }

            // Calcula a média dos salários dos administradores
            if (codigo.equals("A")) {
                administradores++;
                mediaAdm += salario;
            }

            // Contabiliza engenheiros de outros cargos com salário acima de 5000
            if (codigo.equals("X") && salario > 5000) {
                outros++;
            }

            // Determina o engenheiro com menor salário
            if (salario < menorSalario) {
                nomeMenorSalario = nome;
                cargoMenorSalario = cargo;
                menorSalario = salario;
            }
        }

        // Verifica se a quantidade de engenheiros pesquisados é menor que o número total de engenheiros no arquivo
        if (qntEngenheirosPesquisados >= quantidade) {
            System.out.printf("SÓ FORAM REGISTRADOS %d ENGENHEIROS\n", quantidade);
            System.out.println();
        }

        // Calcula e imprime as estatísticas finais
        mediaAdm /= administradores;
        System.out.printf("QUANTIDADE DE ENGENHEIROS COM SALÁRIO EQUIVALENTE OU ACIMA DO SALÁRIO MÍNIMO: %d\nMÉDIA DOS SALÁRIOS DOS ADMINISTRADORES = %s\nQUANTIDADE DE ENGENHEIROS DE CARGO OUTROS QUE RECEBEM MAIS DE R$ 5.000,00: %d\n", engenheirosComSalarioMinimo, NumberFormat.getCurrencyInstance().format(mediaAdm), outros);
        System.out.println();
        System.out.printf("ENGENHEIRO COM MENOR SALÁRIO: %s\nCARGO: %s\nMENOR SALÁRIO: %s", nomeMenorSalario, cargoMenorSalario, NumberFormat.getCurrencyInstance().format(menorSalario));
        engenheiros.close();
    }
}
