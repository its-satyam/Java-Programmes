import java.util.*;
public class Subtract_array {
    public static void main(String args[])
    {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the size of the arrays: ");
            int n=in.nextInt();
            int a[]=new int[n];
            System.out.println("Enter the first array: ");
            for(int i=0;i<n;i++)
            {
                a[i]=in.nextInt();
            }
            int b[]=new int[n];
            System.out.println("Enter the second array: ");
            for(int i=0;i<n;i++)
            {
                b[i]=in.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                a[i]=a[i]-b[i];
            }
            System.out.println("The resultaant array after subtraction is: ");
            for(int i=0;i<n;i++)
            {
               System.out.print(+a[i]+" ");
            }
        }
    }
}