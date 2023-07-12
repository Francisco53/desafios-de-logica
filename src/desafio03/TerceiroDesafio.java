
package desafio03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class TerceiroDesafio {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do array: ");
        int n = scanner.nextInt();
        
        System.out.print("Digite o valor alvo: ");
        int k = scanner.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Digite os valores do array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int count = countPairsWithDifferenceK(arr, k);
        System.out.println("Número de pares com diferença igual a " + k + ": " + count);
    }
    
    public static int countPairsWithDifferenceK(int[] arr, int k) {
        // Criar um mapa para armazenar a frequência de cada número
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int count = 0;
        
        // Iterar sobre o array e verificar a existência de pares
        for (int num : arr) {
            int complement = num - k;
            
            // Se o complemento existe no mapa e não é o próprio número
            if (frequencyMap.containsKey(complement) && complement != num) {
                count += frequencyMap.get(complement);
            }
        }
        
        return count;
    }
    
}
