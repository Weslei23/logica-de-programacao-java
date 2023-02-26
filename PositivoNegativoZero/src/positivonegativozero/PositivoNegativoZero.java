
package positivonegativozero;
import java.util.Scanner;
public class PositivoNegativoZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;
        
        System.out.println("Digite um numéro");
        numero = scanner.nextDouble();
        
        if (numero < 0)
        {
            System.out.println("O número " + numero + " é negativo!");
        }
        if (numero == 0)
        {
            System.out.println("O número " + numero + " é zero!");
        }
        if (numero > 0)
        {
            System.out.println("O número " + numero + " é positivo!");
        }
    }
    
}
