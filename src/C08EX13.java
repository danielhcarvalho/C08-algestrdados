import java.text.NumberFormat;
import java.util.Scanner;

public class C08EX13
{
    public static void main(String[] args)
    {
        // Variáveis para armazenar os dados das cidades e as estatísticas
        String nomeCidade, nomeMenorCidade = "";
        long populacao, qntEleitores, qntMulheres, qntHomens, menorPopulacao = Long.MAX_VALUE;
        int cidadeMaiorUmMilhao = 0, cidadeMulheres = 0;
        double percentual;

        // Scanner para ler os dados do arquivo C08EX13.txt
        Scanner cidades = new Scanner(C08EX13.class.getResourceAsStream("C08EX13.txt")); //fazer o download do arquivo C08EX13.txt no mesmo diretório do github

        // Loop para processar os dados de cada cidade no arquivo
        while (cidades.hasNextLine())
        {
            // Lê os dados da cidade do arquivo
            nomeCidade = cidades.nextLine();
            populacao = cidades.nextLong();
            qntEleitores = cidades.nextLong();
            qntMulheres = cidades.nextLong();
            qntHomens = cidades.nextLong();
            cidades.nextLine();

            // Imprime o nome da cidade
            System.out.printf("%s\n", nomeCidade);

            // Verifica se a soma da quantidade de homens e mulheres é igual à população
            if(qntHomens + qntMulheres != populacao)
            {
                System.out.printf(" A soma entre a quantidade de homens e mulheres da cidade de %s é diferente da quantidade da população\n", nomeCidade);
            }

            // Verifica se a população da cidade é maior que um milhão
            if (populacao > 1000000)
            {
                cidadeMaiorUmMilhao++;
            }

            // Verifica se a quantidade de mulheres é maior que a quantidade de homens
            if (qntMulheres > qntHomens)
            {
                cidadeMulheres++;
            }

            // Verifica se a população da cidade é menor que a menor população registrada até o momento
            if (populacao < menorPopulacao)
            {
                menorPopulacao = populacao;
                nomeMenorCidade = nomeCidade;
            }

            // Calcula o percentual de eleitores em relação à população total e imprime
            percentual = (double) qntEleitores / populacao;
            System.out.printf(" Percentual de eleitores: %s\n\n", NumberFormat.getPercentInstance().format(percentual));
        }

        // Imprime as estatísticas finais: cidades com mais de um milhão de habitantes, cidades onde a quantidade de mulheres é maior que a quantidade de homens e a cidade com menor população
        System.out.printf("Cidades com mais de um milhão (1.000.000) de habitantes: %d\nCidades que a quantidade de mulheres é maior que a quantidade de homens: %d\nCidade com menor população: %s\n", cidadeMaiorUmMilhao, cidadeMulheres, nomeMenorCidade);
        cidades.close();
    }

}
