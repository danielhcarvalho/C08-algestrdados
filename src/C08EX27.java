public class C08EX27 {
    public static void main(String[] args) {
        // Loop externo para determinar quantas vezes o padrão será repetido
        for (int aux = 1; aux <= 2; aux++) {
            // Loop interno para iterar sobre as linhas do padrão
            for (int aux2 = 1; aux2 <= 8; aux2++) {
                // Loop interno para imprimir os asteriscos de acordo com o padrão
                for (int aux3 = 1; aux3 <= Math.pow(2, aux2 - 1); aux3++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            // Loop interno para iterar sobre as linhas do padrão na ordem decrescente
            for (int aux2 = 7; aux2 >= 1; aux2--) {
                // Loop interno para imprimir os asteriscos de acordo com o padrão
                for (int aux3 = 1; aux3 <= Math.pow(2, aux2 - 1); aux3++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
