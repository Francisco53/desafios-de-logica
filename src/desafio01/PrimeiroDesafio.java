
package desafio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class PrimeiroDesafio {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de valores: ");
        int quantidade = scanner.nextInt();
        
        List<Integer> numeros = new ArrayList<>();
        
        System.out.println("Digite os valores:");
        for (int i = 0; i < quantidade; i++) {
            int valor = scanner.nextInt();
            numeros.add(valor);
        }
        
        // Ordenar os pares em ordem crescente
        List<Integer> pares = new ArrayList<>();
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            }
        }
        Collections.sort(pares);
        
        // Ordenar os ímpares em ordem decrescente
        List<Integer> impares = new ArrayList<>();
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                impares.add(numero);
            }
        }
        Collections.sort(impares, Collections.reverseOrder());
        
        // Juntar as listas ordenadas
        List<Integer> ordenados = new ArrayList<>();
        ordenados.addAll(pares);
        ordenados.addAll(impares);
        
        // Exibir os valores ordenados
        System.out.println("Valores ordenados:");
        for (int numero : ordenados) {
            System.out.println(numero);
        }
        
    }
    
}
