package atividade3;

import java.util.Scanner;
public class Atividade3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int c,l,a,v;
        
        System.out.println("Digite o comprimento da sala: ");
        c = scanner.nextInt();
        
        System.out.println("Digite a largura da sala: ");
        l = scanner.nextInt();
        
        System.out.println("Digite a altura da sala: ");
        a = scanner.nextInt();
        
        v = c*l*a;
        
        System.out.println("O volume da sala será de: " + v);
    }
    
}
