public class C08EX25 {
    public static void main(String[] args) {
        // Loop externo para determinar quantas vezes o conjunto completo irá se repetir
        for (int aux = 1; aux <= 10; aux++) {
            // Loop interno para determinar quantas vezes o conjunto crescente irá se repetir
            for (int aux2 = 1; aux2 <= 10; aux2++) {
                // Loop interno para determinar a quantidade de colunas em cada linha do conjunto crescente
                for (int aux3 = 1; aux3 <= aux2; aux3++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            // Loop interno para determinar quantas vezes o conjunto decrescente irá se repetir
            for (int aux2 = 10; aux2 >= 1; aux2--) {
                // Loop interno para determinar a quantidade de colunas em cada linha do conjunto decrescente
                for (int aux3 = 1; aux3 <= aux2; aux3++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
