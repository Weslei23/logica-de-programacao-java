
package maiormenor;

import java.util.Scanner;
public class Maiormenor {

    /**
     * 1-Faça um algoritmo que leia dois números inteiros e escreva qual deles é o maior.
     */
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a,b;
        
        System.out.println("Digite um número: ");
        a = scanner.nextInt();
        
        System.out.println("Digite outro número: ");
        b = scanner.nextInt();
        
        if(a>b)
        {
            System.out.println(a + " Foi o maior número digitado!");
        }
        else 
        {
            System.out.println(b+ " Foi o maior número digitado");
        }
       
    }
}
    
