
package atividade1;

/**
 *1-Desenvolva um algoritmo que receba dois números e faça a soma, a subtração e a multiplicação de ambos 
 *e imprima na tela os resultados de cada uma destas operações.
 * @author wesle
 */
import java.util.Scanner;
public class Atividade1 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       double n1,n2,soma,sub,multi;
       
        System.out.println("Digite um número: ");
        n1 = scanner.nextDouble();
        
        System.out.println("Digite outro número: ");
        n2 = scanner.nextDouble();
        
        soma = n1 + n2;
        sub = n1 - n2;
        multi = n1 * n2;
        
        System.out.println("A soma dos números digitados é: " + soma);
        System.out.println("A subtração dos números digitados é: " + sub);
        System.out.println("A multiplicação dos números digitados é: " + multi);
           
    }
    
}
