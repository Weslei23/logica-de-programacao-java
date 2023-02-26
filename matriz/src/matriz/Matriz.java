
package matriz;

public class Matriz {
    
  public static void main (String[] args)
  {
    int matriz[][] = new int[10][10];
    int contador = 1;
    
    for(int i=0; i<10; i++)
    {
      for(int j=0; j<10; j++)
      {
        matriz[i][j] = contador;
        System.out.print(matriz[i][j]+ " ");
        contador ++;
      }
      System.out.println();
    }
  }  
}
