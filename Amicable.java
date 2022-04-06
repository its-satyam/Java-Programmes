import java.util.*;
public class Amicable {
    public static void main(String args[])
    {
        int num1,num2,sum1=0,sum2=0;
        System.out.println("Enter two numbers: ");
        Scanner in=new Scanner(System.in);
        num1=in.nextInt();
        num2=in.nextInt();
        for(int i=1;i<=num1/2;i++)
        {
            if(num1%i==0)
            sum1=sum1+i;
        }
        sum1=sum1+num1;
        for(int i=1;i<=num2/2;i++)
        {
            if(num2%i==0)
            sum2=sum2+i;
        }
        sum2=sum2+num2;
        if(sum1/num1==sum2/num2)
        System.out.println("Friendly Pair");
        else
        System.out.println("Not a friendly pair");
    }
}