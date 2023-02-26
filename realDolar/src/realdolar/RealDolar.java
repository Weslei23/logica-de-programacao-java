package realdolar;

import java.util.Scanner;
public class RealDolar {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double valor;
        double realDolar;
        double realLibra;
        double realFranco;
        double realIene;
        
        int escolha;
            
        System.out.println("Selecione a moeda para qual deseja converter:");
        System.out.println("[1] - Dolar");
        System.out.println("[2] - Libra");
        System.out.println("[3] - Franco");
        System.out.println("[4] - Iene");
            escolha = scanner.nextInt();
        
        System.out.println("Digite o valor que deseja converter");
            valor = scanner.nextDouble();
            
        switch (escolha){
            case 1:
              valor = valorDolar;
            break;
             
            case 2:
                valor = valorLibra;
            break;
                
            case 3:
                valor = valorFranco;
            break;
            
            case 4: 
                valor = valorIene;
            break;
        }
         
        }
    public static double valorDolar (double dolar, double valor) {
        double s = valor * 0.20;
        
        return s;
    }
    
    public static double valorLibra (double libra, double valor) {
        double i = valor * 0.16;
        
        return i;
    }
    
}
