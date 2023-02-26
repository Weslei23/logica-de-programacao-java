package calculadora;

import java.util.Scanner;
public class Calculadora {
    
    public static void main(String[] args) {
        
        double n1, n2;
        double soma, subtracao, multiplicacao, divisao;
        String op;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
            n1 = entrada.nextDouble();
            
        System.out.println(" Digite outro número; ");
            n2 = entrada.nextDouble();
            
        System.out.println("-=-=-= Escolha uma Operação =-=-=-");
        System.out.println("(1) - SOMA");
        System.out.println("(2) - SUBTRAÇÃO");
        System.out.println("(3) - MULTIPLICAÇÃO");
        System.out.println("(4) - DIVISÂO");
        System.out.println("Digite qual operação deseja realizar");
            op = entrada.next();
            
        if (op="(1 - SOMA)"){
            System.out.println("A soma de " +a " + " +b " = " +a+b);
            
        }
        
    }
    
}
