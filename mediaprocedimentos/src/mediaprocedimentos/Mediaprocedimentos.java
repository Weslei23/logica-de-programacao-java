
package mediaprocedimentos;

import java.util.Scanner;
public class Mediaprocedimentos {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double n1,n2, n3, media;
        
        System.out.println("Escreva a primeira nota: ");
            n1 = scanner.nextDouble();
            
        System.out.println("Escreva a segunda nota: ");
            n2 = scanner.nextDouble();
            
        System.out.println("Escreva a terceira nota: ");
            n3 = scanner.nextDouble();
            
        media = (n1 + n2 + n3)/3; 
        resultado(media);
        System.out.println("A media do aluno é: "+media);
    }
    
    public static resultado(double media){
        if (media >7){
            System.out.println("Aprovado!");
        }
        else if (media <7){
         System.out.println("Reprovado!");
        }
    }
}
