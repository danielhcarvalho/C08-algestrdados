public class C08EX16 {
    public static void main(String[] args) {
        int soma = 0, media, impares = 0;

        // Loop para iterar sobre os números no intervalo de 1000 a 2000
        for (int aux = 1000; aux <= 2000; aux++) {
            // Verifica se o número é ímpar
            if (aux % 2 != 0) {
                soma += aux; // Adiciona o número ímpar à soma
                impares++; // Incrementa o contador de números ímpares
            }
        }
        
        // Calcula a média dos números ímpares
        media = soma / impares;
        
        // Imprime a média dos números ímpares
        System.out.printf("%d", media);
    }
}
