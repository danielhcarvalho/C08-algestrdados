import java.util.Scanner;

public class C08EX01 {
    public static void main(String[] args) {
        // Declaração das variáveis para armazenar o valor de pi, o raio e a área do círculo
        double pi, R, a;
        
        // Atribuição do valor de pi
        pi = 3.1416;
        
        // Criação do objeto Scanner para ler a entrada do usuário
        Scanner teclado = new Scanner(System.in);
        
        // Loop para calcular a área de 10 círculos com diferentes raios
        for (int repetition = 1; repetition <= 10; repetition++) {
            // Solicita ao usuário que insira o valor do raio do círculo atual
            System.out.print("Informe o valor do raio do " + repetition + "° círculo: ");
            R = teclado.nextDouble(); // Lê o valor do raio fornecido pelo usuário
            
            // Calcula a área do círculo com base no raio fornecido
            a = pi * Math.pow(R, 2);
            
            // Imprime a área calculada do círculo atual
            System.out.println("r" + repetition + " = " + a);
        }
        
        // Fecha o objeto Scanner para liberar recursos
        teclado.close();
    }
}
