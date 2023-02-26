sho
package salarios;

import java.util.ArrayList;
import java.util.Scanner;

public class Salarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList listaSalario = new ArrayList();
        ArrayList listaNome = new ArrayList();

        
        int count = 0;
        
        while (count < 10) {            
            System.out.println("Informe seu nome: ");
            String nome = scanner.next();
            System.out.println("Informe seu salário: ");
            double salario = scanner.nextDouble();
            
            salario = addAumento(salario);
            salario = addInss(salario);
            
            if(salario >= 2300) salario = addIR(salario);
            
            System.out.println("O Funcionário "+ nome + " terá salário de " + salario + " após os ajustes");
            
            listaSalario.add(salario);
            listaNome.add(nome);
            
            count++;
        }
        
        System.out.println("Recaptular todos os funcionários e salários digitados? (S - N)");
        String escolha = scanner.next();
        
        if(escolha.equalsIgnoreCase("S")){
            int countLista = 0;
            while (countLista < listaNome.size()) {                
                System.out.println(listaNome.get(countLista) + " : " + listaSalario.get(countLista));
                countLista++;
            }
        }else if (escolha.equalsIgnoreCase("N")){
            System.out.println("Encerrando o programa");
        }else{
            System.out.println("Resposta desconhecida, encerrando o programa");
        }
      
    }
    
    private static double addAumento (double salario){
        if(salario >= 1200 && salario <2500) return salario + (salario *0.1);
        else if(salario >= 2500 && salario <3200) return salario + (salario *0.08);
        else if(salario >= 3200) return salario + (salario *0.05);
        
        return salario;
    }
    
    private static double addInss (double salario){
        return salario - (salario * 0.11);
    }
    
    private static double addIR (double salario){
        return salario - (salario * 0.18);
    }
    
}
