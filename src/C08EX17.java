public class C08EX17 {
    public static void main(String[] args) {
        double resultado;
        // Loop para iterar sobre os valores de x no intervalo de 3 a 12
        for (int x = 3; x <= 12; x++) {
            // Calcula o valor da função para o valor atual de x
            resultado = Math.sqrt(Math.pow(x, 2) - 3);
            // Imprime o resultado formatado
            System.out.printf("f(%d) = %6.4f\n", x, resultado);
        }
    }
}
