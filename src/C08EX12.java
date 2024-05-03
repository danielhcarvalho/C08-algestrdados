import javax.swing.*;
import java.text.NumberFormat;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class C08EX12 {
    public static void main(String[] args) {

        // Variáveis para armazenar o faturamento formatado, o código do produto, a quantidade de cada produto vendido e o preço de cada produto
        String faturamentoFormatado;
        String[] codigos = {"1", "2", "3", "4", "5"};
        int codigoProduto, aux, qntProduto01 = 0, qntProduto02 = 0, qntProduto03 = 0, qntProduto04 = 0, qntProduto05 = 0;
        double preco01 = 1565, preco02 = 1890, preco03 = 2150, preco04 = 2963, preco05 = 3750, faturamentoTotal;

        // Loop para registrar vendas de 1000 produtos
        for (aux = 1; aux <= 1000; aux++) {
            // Solicita ao usuário que informe o código do produto vendido e armazena o valor digitado na variável correspondente
            codigoProduto = JOptionPane.showOptionDialog(null,
                    "Informe o código do produto vendido:",
                    "Exercício 12",
                    0,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    codigos,
                    "");

            // Incrementa a quantidade vendida do produto correspondente com base no código informado
            if (codigoProduto == 0) {
                qntProduto01++;
            } else if (codigoProduto == 1) {
                qntProduto02++;
            } else if (codigoProduto == 2) {
                qntProduto03++;
            } else if (codigoProduto == 3) {
                qntProduto04++;
            } else {
                qntProduto05++;
            }
        }

        // Calcula o faturamento total somando o valor total de vendas de cada produto
        faturamentoTotal = (preco01 * qntProduto01) + (preco02 * qntProduto02) + (preco03 * qntProduto03) + (preco04 * qntProduto04) + (preco05 * qntProduto05);

        // Formata o faturamento total como uma string formatada em moeda
        faturamentoFormatado = NumberFormat.getCurrencyInstance().format(faturamentoTotal);

        // Imprime o faturamento total do período
        System.out.printf("O faturamento total do período é de %s", faturamentoFormatado);
    }
}
