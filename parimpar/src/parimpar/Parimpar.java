
package parimpar;
import java.util.Scanner;
public class Parimpar
{
public static void main (String args[])
    {   
        Scanner scanner = new Scanner(System.in);
	int vetor [] =  {1,2,3,4,5,6,7,8,9,10};   
	int  p;   
	int impar;
        for (int i =0; i<vetor.length; i++) {   
	        if (i%2!=0) 
                {
	           System.out.println("O número: "+ i + " é Impar.");   
	        }   
	        if(vetor[i]%2==0)
                {
                    System.out.println("O número: "+vetor[i]+" é Par.");
	        }
	     }   
	  }   
 public static boolean p(int numero) 
    {   
        return (numero % 2 == 0); 
    }
}