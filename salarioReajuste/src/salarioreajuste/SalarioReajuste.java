
package salarioreajuste;
import java.util.Scanner;
public class SalarioReajuste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double salario;

        System.out.println("Digite o salário do funcionário: ");
        salario = scanner.nextDouble();
        if (salario < 500) 
        {
        System.out.println("O salário será de: R$ "+(salario*1.15));
        } 
        if (salario <= 1000) 
        {
        System.out.println("O salário será de: R$ "+(salario*1.10));
        } 
        else 
        {
        System.out.println("O saário será de: R$ "+(salario*1.05));
        }
    }
}


