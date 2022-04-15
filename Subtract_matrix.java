import java.util.*;
public class Subtract_matrix {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrices: ");
        int m=in.nextInt();
        int n=in.nextInt();
        int a[][]=new int[m][n];
        System.out.println("Enter the first matrix: ");
        for(int i=0;i<m;i++)
        {
           for(int j=0;j<n;j++)
           {
               a[i][j]=in.nextInt();
           }
        }
        System.out.println("Enter the second matrix: ");
        int b[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
           for(int j=0;j<n;j++)
           {
               b[i][j]=in.nextInt();
           }
        }
        for(int i=0;i<m;i++)
        {
           for(int j=0;j<n;j++)
           {
               a[i][j]=a[i][j]-b[i][j];
           }
        }
        System.out.println("The resultant matrix after subtraction is: ");
        for(int i=0;i<m;i++)
        {
           for(int j=0;j<n;j++)
           {
               System.out.print(+a[i][j]+ " ");
           }
        }
    }
}
