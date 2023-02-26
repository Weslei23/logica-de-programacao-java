/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;

import java.util.Scanner;
public class Teste {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        
        int notaAlunos[] = new int[10];

         //obtém notas dos alunos
         for(int i=0; i < notaAlunos.length; i++)
         {
           notaAlunos[i] = Entrada.nextInt("Nota do Aluno "+i+": ");
         }
         //imprime as notas dos alunos
         for(int i=0; i < notaAlunos.length; i++)
         {
           System.out.println("Nota do aluno "+i+": "+notaAlunos[i]);
         }
       }
}