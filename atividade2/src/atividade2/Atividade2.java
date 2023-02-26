
package atividade2;

import java.util.Scanner;
public class Atividade2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int idade, meses, dias;
                
        System.out.println("Informe sua idade: ");
        idade = scanner.nextInt();
                
        meses = idade * 12;
        dias = idade * 365;
        
        System.out.println("Você já viveu " + meses + " meses!");
        System.out.println("Você já viveu " + dias + " dias!");
        
    }
    
}
