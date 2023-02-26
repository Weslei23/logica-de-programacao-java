/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorapanze;

import java.util.Scanner;

/**
 *
 * @author Miguel Cruz
 */
public class CalculadoraPanze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String func = "";
        float num2 = 0;
        
        System.out.print("Número 1:  ");
        float result = scanner.nextFloat();
                
        
        while (!func.equals("=")) {      
            
            System.out.print("Operação: ");
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
