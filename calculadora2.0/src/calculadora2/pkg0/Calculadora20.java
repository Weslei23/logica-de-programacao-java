package calculadora2.pkg0;
/**
 * 3- Faça um algoritmo que simule uma calculadora simples, com a possibilidade 
 * soma e subtração.
 */
import java.util.Scanner;
public class Calculadora20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1,n2,calculo, soma, sub;
        
        System.out.println("Digite um número: ");
        n1 = scanner.nextInt();
        
        System.out.println("Digite outro número: ");
        n2 = scanner.nextInt();
        
        System.out.println("-=-=-=Calculadora=-=-=-");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
        calculo = scanner.nextInt();
        
        switch(calculo){
            case 1: 
              soma = n1+n2;
              System.out.println("O resultado da soma dos números é de: " + soma);
            break;
            case 2:
                sub = n1-n2;
                System.out.println("O resultado da subtração dos números é de: " + sub);
            break;
            default:
                System.out.println("Opção não encontrada!");
       }
    }  
}
