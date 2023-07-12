
package desafio04;

import java.util.Scanner;


public class QuartoDesafio {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de casos de teste: ");
        int n = scanner.nextInt();

        scanner.nextLine(); // Consumir a quebra de linha após o próximoInt()

        for (int i = 0; i < n; i++) {
            System.out.print("Digite a frase a ser decifrada: ");
            String linha = scanner.nextLine();

            String fraseDecifrada = decifrarFrase(linha);
            System.out.println("Frase decifrada: " + fraseDecifrada);
        }
    }

    public static String decifrarFrase(String linha) {
        int tamanho = linha.length();
        int metade = tamanho / 2;

        StringBuilder sb = new StringBuilder();

        // Adicionar a metade esquerda da linha (do meio à margem esquerda)
        for (int i = metade - 1; i >= 0; i--) {
            sb.append(linha.charAt(i));
        }

        // Adicionar a metade direita da linha (da margem direita ao centro)
        for (int i = tamanho - 1; i >= metade; i--) {
            sb.append(linha.charAt(i));
        }

        return sb.toString();
    }
}
