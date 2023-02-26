
package reverso;

public class Reverso {

    public static void main (String[]args)
    {
        int [] n = new int [15];
        for(int w = 0; w < n.length; w++)
        {
            System.out.print(w + 1);
        }
        System.out.println();
        for(int w = (n.length ); w > 0; w--)
        {
            System.out.print(w);
        }
    }
}
