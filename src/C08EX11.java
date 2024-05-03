import javax.swing.*;
import java.text.NumberFormat;

public class C08EX11 {
    public static void main(String[] args) {
        // Variáveis para armazenar informações sobre cada pessoa, incluindo nome, idade, gênero, estado civil, cor dos olhos, cor do cabelo, escolaridade, salário, o nome da pessoa com maior salário, a quantidade de mulheres supimpa, o maior salário entre os homens e o menor salário entre os homens
        String nome, nomeMaiorSalario = "", salarioFormatado, diferencaFormatada;
        String[] opcoesGenero = {"M", "F"}, opcoesEstadoCivil = {"C", "S", "O"}, opcoesCorOlhos = {"A", "C", "P", "O"}, opcoesCorCabelo = {"L", "P", "C", "R"}, opcoesEscolaridade = {"1", "2", "3", "4"};
        int idade, genero, estadoCivil, corOlhos, corCabelo, escolaridade, mulherSupimpa = 0;
        double salario, maiorSalario = 0, maiorSalarioHomens = 0, menorSalarioHomens = 0, diferenca;

        // Loop para registrar informações sobre 50 pessoas
        for (int aux = 1; aux <= 50; aux++) {

            // Solicita ao usuário que insira informações sobre a pessoa e armazena os valores digitados nas variáveis correspondentes
            nome = JOptionPane.showInputDialog(null,
                    "Qual o seu nome?",
                    "Exercício 11",
                    JOptionPane.QUESTION_MESSAGE);
            idade = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Qual a sua idade?",
                    "Exercício 11",
                    JOptionPane.QUESTION_MESSAGE));
            genero = JOptionPane.showOptionDialog(null,
                    "Qual o seu gênero?\nM - Masculino\nF - Feminino",
                    "Exercício 11",
                    0,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoesGenero,
                    "");
            estadoCivil = JOptionPane.showOptionDialog(null,
                    "Qual o seu estado civil?\nC - Casado\nS - Solteiro\nO - Outro",
                    "Exercício 11",
                    0,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoesEstadoCivil,
                    "");
            corOlhos = JOptionPane.showOptionDialog(null,
                    "Qual a cor dos seus olhos?\nA - Azul\nC - Castanho\nP - Preto\nO - Outra cor",
                    "Exercício 11",
                    0,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoesCorOlhos,
                    "");
            corCabelo = JOptionPane.showOptionDialog(null,
                    "Qual a cor dos seus cabelos?\nL - Loiro\nP - Preto\nC - Castanho\nR - Ruivo\nO - Outra cor",
                    "Exercício 11",
                    0,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoesCorCabelo,
                    "");
            escolaridade = JOptionPane.showOptionDialog(null,
                    "Qual o seu nível de escolaridade?\n1 - 1° grau\n2 - 2° grau\n3 - 3° grau\n4 - 4° grau",
                    "Exercício 11",
                    0,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoesEscolaridade,
                    "");
            salario = Float.parseFloat(JOptionPane.showInputDialog(null,
                    "Quanto ganha atualmente?,",
                    "Exercício 11",
                    JOptionPane.QUESTION_MESSAGE));

            // Verifica se a pessoa atende aos critérios para ser considerada uma "mulher supimpa" e atualiza o contador correspondente
            if (genero == 1 &&  corCabelo == 0 && corOlhos == 0 && idade >= 18 && idade <= 25 && estadoCivil == 1 && salario >= 10000 && escolaridade == 3) {
                mulherSupimpa++;
            }

            // Verifica se o salário atual é o maior até agora e atualiza o maior salário e o nome da pessoa com o maior salário
            if (aux == 1 || salario > maiorSalario) {
                maiorSalario = salario;
                nomeMaiorSalario = nome;
            }

            // Verifica se o salário atual é o maior entre os homens e atualiza o maior salário entre os homens
            if (genero == 0 && salario > maiorSalarioHomens) {
                maiorSalarioHomens = salario;
            }

            // Verifica se o salário atual é o menor entre os homens e atualiza o menor salário entre os homens
            if ((aux == 1 || salario < menorSalarioHomens) && genero == 0) {
                menorSalarioHomens = salario;
            }
        }

        // Formata o maior salário como uma string formatada em moeda
        salarioFormatado = NumberFormat.getCurrencyInstance().format(maiorSalario);

        // Calcula a diferença entre o maior e o menor salário entre os homens
        diferenca = maiorSalarioHomens - menorSalarioHomens;

        // Formata a diferença como uma string formatada em moeda
        diferencaFormatada = NumberFormat.getCurrencyInstance().format(diferenca);

        // Imprime os resultados finais: quantidade de mulheres supimpa, nome da pessoa com maior salário, maior e menor salário entre os homens
        System.out.printf("Quantidade de mulheres supimpa: %d\nPessoa com maior salário: %s, %s\nDiferença entre o maior e menor salário dos homens: %s",
                            mulherSupimpa, nomeMaiorSalario, salarioFormatado, diferencaFormatada);
    }
}
