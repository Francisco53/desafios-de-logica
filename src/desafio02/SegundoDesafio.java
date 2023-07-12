
package desafio02;

import java.util.Locale;
import java.util.Scanner;


public class SegundoDesafio {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Digite o valor monetário: ");
        double valor = scanner.nextDouble();
        
        int notas100 = (int) (valor / 100);
        valor %= 100;
        
        int notas50 = (int) (valor / 50);
        valor %= 50;
        
        int notas20 = (int) (valor / 20);
        valor %= 20;
        
        int notas10 = (int) (valor / 10);
        valor %= 10;
        
        int notas5 = (int) (valor / 5);
        valor %= 5;
        
        int notas2 = (int) (valor / 2);
        valor %= 2;
        
        int moedas1 = (int) (valor / 1);
        valor %= 1;
        
        int moedas50 = (int) (valor / 0.50);
        valor %= 0.50;
        
        int moedas25 = (int) (valor / 0.25);
        valor %= 0.25;
        
        int moedas10 = (int) (valor / 0.10);
        valor %= 0.10;
        
        int moedas5 = (int) (valor / 0.05);
        valor %= 0.05;
        
        int moedas1cent = (int) (valor / 0.01);
        
        System.out.println("Notas de 100: " + notas100);
        System.out.println("Notas de 50: " + notas50);
        System.out.println("Notas de 20: " + notas20);
        System.out.println("Notas de 10: " + notas10);
        System.out.println("Notas de 5: " + notas5);
        System.out.println("Notas de 2: " + notas2);
        System.out.println("Moedas de 1: " + moedas1);
        System.out.println("Moedas de 0.50: " + moedas50);
        System.out.println("Moedas de 0.25: " + moedas25);
        System.out.println("Moedas de 0.10: " + moedas10);
        System.out.println("Moedas de 0.05: " + moedas5);
        System.out.println("Moedas de 0.01: " + moedas1cent);
    }
    
}
