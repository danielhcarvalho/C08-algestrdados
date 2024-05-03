import javax.swing.*;

public class C08EX09 {
    public static void main(String[] args) {
        // Variáveis para armazenar o nome, idade e sexo de cada participante, a quantidade de pessoas, a soma das idades dos homens, a soma das idades das mulheres, o número de homens, o número de mulheres e os arrays para as opções de gênero
        String nome;
        String[] options = {"M", "F"};
        int idade, quantPessoas, sexo, somaHomens = 0, somaMulheres = 0, homens = 0, mulheres = 0, aux;
        double mediaMulheres, mediaHomens;

        // Solicita ao usuário que insira a quantidade de pessoas
        quantPessoas = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Informe a quantidade de pessoas:",
                "Exercício 9",
                JOptionPane.QUESTION_MESSAGE));

        // Loop para registrar as informações de cada participante
        for (aux = 1; aux <= quantPessoas; aux++) {

            // Solicita ao usuário que insira o nome do participante e armazena o valor digitado na variável nome
            nome = JOptionPane.showInputDialog(null,
                    "Informe o nome do participante:",
                    "Exercício 9",
                    JOptionPane.QUESTION_MESSAGE);
            
            // Solicita ao usuário que selecione o gênero do participante e armazena o índice da opção selecionada na variável sexo
            sexo = JOptionPane.showOptionDialog(null,
                    "Qual o seu gênero: ",
                    "Exercício 9",
                    0,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    "");
            
            // Solicita ao usuário que insira a idade do participante e armazena o valor digitado na variável idade
            idade = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Informe a idade do participante:",
                    "Exercício 9",
                    JOptionPane.QUESTION_MESSAGE));
            
            // Verifica o sexo do participante e atualiza a soma das idades correspondente e o contador de homens ou mulheres
            if (sexo == 0) {
                somaHomens += idade;
                homens++;
            } else {
                somaMulheres += idade;
                mulheres++;
            }
            
            // Imprime o nome, idade e sexo do participante
            System.out.printf("Nome = %s\nIdade = %d\nSexo = %s\n", nome, idade, options[sexo]);
        }
        
        // Calcula a média das idades dos homens e das mulheres
        mediaHomens = (double) somaHomens / homens;
        mediaMulheres = (double) somaMulheres / mulheres;
        
        // Imprime a média das idades dos homens e das mulheres
        System.out.printf("Média das idades dos homens = %7.2f\nMédia das idades das mulheres = %7.2f", mediaHomens, mediaMulheres);
    }
}
