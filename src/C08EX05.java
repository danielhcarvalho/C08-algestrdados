import javax.swing.*;
import java.util.Scanner;

public class C08EX05 {
    public static void main(String[] args) {
        // Variáveis para armazenar o número do candidato e a contagem de votos de cada candidato
        int candidato, fulano = 0, ciclano = 0, beltrano = 0;
        
        // Variável para armazenar o nome do candidato vencedor
        String candidatoVencedor = "1"; // Inicializado com qualquer valor
        
        // Criação do objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Loop para registrar os votos de até 100 eleitores
        for (int aux = 1; aux <= 100; aux++) {
            // Solicita ao eleitor que informe o número do seu candidato
            System.out.print("Olá eleitor " + aux + ", informe o seu candidato: ");
            candidato = sc.nextInt(); // Lê o número do candidato fornecido pelo eleitor
            
            // Verifica o candidato escolhido pelo eleitor e incrementa a contagem de votos correspondente
            if (candidato == 1) {
                fulano++;
            } else if (candidato == 2) {
                ciclano++;
            } else if (candidato == 3) {
                beltrano++;
            } else if (candidato == 0) { // Se o eleitor digitar 0, encerra a votação
                break;
            } else { // Se o eleitor digitar um número inválido, exibe uma mensagem de erro e decrementa o contador para permitir nova entrada
                JOptionPane.showMessageDialog(null, "Selecione um candidato válido!\n1 - Fulano\n2 - Ciclano\n3 - Beltrano", "Erro ao Selecionar Candidato", JOptionPane.ERROR_MESSAGE);
                aux--;
            }
        }
        
        // Verifica o candidato com o maior número de votos e atribui o nome do candidato vencedor à variável candidatoVencedor
        if (fulano > ciclano && fulano > beltrano) {
            candidatoVencedor = "Fulano";
        } else if (ciclano > fulano && ciclano > beltrano) {
            candidatoVencedor = "Ciclano";
        } else if (beltrano > fulano && beltrano > ciclano) {
            candidatoVencedor = "Beltrano";
        }

        // Imprime a contagem de votos de cada candidato e o nome do candidato vencedor
        System.out.printf("Fulano possui %d votos\nCiclano possui %d votos\nBeltrano possui %d votos\nO Candidato eleito foi %s", fulano, ciclano, beltrano, candidatoVencedor);
        
        // Fecha o objeto Scanner para liberar recursos
        sc.close();
    }
}
