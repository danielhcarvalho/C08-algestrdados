import java.text.NumberFormat;
import java.util.Scanner;

public class C08EX10 {
    public static void main(String[] args) {
        // Variáveis para armazenar o nome, quantidade e preço do insumo, a soma dos custos, a média dos custos, o maior preço de insumo e o nome do insumo com o maior custo
        String nome, nomeMaiorInsumo = "";
        int quantidade;
        double preco, soma = 0, media = 0, maiorInsumo = 0;

        // Criação do objeto Scanner para ler os dados do arquivo "C08EX10.txt"
        Scanner insumo = new Scanner(C08EX10.class.getResourceAsStream("C08EX10.txt"));

        // Loop para processar cada linha do arquivo
        while (insumo.hasNextLine()) {
            // Leitura do nome, quantidade e preço do insumo
            nome = insumo.nextLine();
            quantidade = insumo.nextInt();
            preco = insumo.nextDouble();
            insumo.nextLine(); // Consumir a quebra de linha após o preço

            // Cálculo do custo total acumulado
            soma += quantidade * preco;

            // Cálculo da média dos custos parciais (não parece estar correto, pois é atualizado a cada iteração do loop)
            media = soma / 4;

            // Verificação se o preço atual é o maior até o momento e atualização do maior preço e do nome do insumo com o maior custo
            if (maiorInsumo < preco) {
                maiorInsumo = preco;
                nomeMaiorInsumo = nome;
            }
        }

        // Impressão dos resultados finais: custo total, média dos custos parciais e nome do insumo com o maior custo
        System.out.printf("Custo Total --> %s\nMédia dos Custos Parciais --> %s\nNome do Insumo de maior custo parcial --> %s", 
                            NumberFormat.getCurrencyInstance().format(soma), 
                            NumberFormat.getCurrencyInstance().format(media), 
                            nomeMaiorInsumo);
        insumo.close();
    }

}
