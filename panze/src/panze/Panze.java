package panze;

import java.util.Scanner;

public class Panze {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String func = "";
        float num2 = 0;
        
        System.out.print("Número 1:  ");
        float result = scanner.nextFloat();
                
        
        while (!func.equals("=")) {      
            
            System.out.print("Escolha a operação: ");
            func = scanner.next();

            if (!func.equals("=")){
                System.out.print(result + " " + func + " ");
                num2 = scanner.nextFloat();
            }
            
            if(func.equals("+")) result = result + num2 ;
            if(func.equals("-")) result = result - num2;
            if(func.equals("*")) result = result * num2;
            if(func.equals("/")) result = result / num2;
            
        }
        
        
        System.out.println("Resultado: " + result);      
       
    }
        
}