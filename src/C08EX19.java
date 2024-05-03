public class C08EX19 {
    public static void main(String[] args) {
        long numero, soma = 0;

        // Loop para calcular o quadrado de cada número de 1 a 100 e somá-los
        for (int aux = 1; aux <= 100; aux++) {
            numero = (int) Math.pow(aux, 2); // Calcula o quadrado do número atual
            soma += numero; // Adiciona o quadrado ao total da soma
        }
        System.out.printf("%d\n", soma); // Imprime o resultado da soma
    }
}
