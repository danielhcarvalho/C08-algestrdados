public class C08EX28 {
    public static void main(String[] args) {
        int numero = 1, aux;
        double media = 0;

        // Loop para calcular números triangulares e calcular a média deles
        for (aux = 1; aux <= numero; aux++) {

            // Calcula o próximo número triangular
            numero = aux * (aux + 1) * (aux + 2);

            // Verifica se o número triangular calculado está dentro do limite de 1000
            if (numero <= 1000 && numero > 0) {
                // Adiciona o número triangular à média
                media += numero;
                // Imprime o número triangular encontrado
                System.out.printf("O número %d é triangular", numero);
                System.out.println();
            } else {
                break;
            }
        }
        // Calcula a média dos números triangulares encontrados
        aux--;
        media /= aux;
        // Imprime a média
        System.out.printf("%.0f", media);
    }
}
