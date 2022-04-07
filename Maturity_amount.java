import java.util.*;
import java.lang.Math;
public class Maturity_amount {
    public static void main(String args[])
    {
        int ch=0;
        System.out.println("Enter 1 to calculate maturity amount for term deposit and 2 to calculae maturity amount for recurring deposit: ");
        try (Scanner in = new Scanner(System.in)) {
            ch=in.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter the principal,rate of interest and time period in years rspectively: ");
                double p,r;
                int n;
                p=in.nextDouble();
                r=in.nextDouble();
                n=in.nextInt();
                double amt;
                amt=p*(Math.pow((1+(r/100)),n));
                System.out.println("The maturity amount is: "+amt);
                break;
                case 2:
                System.out.println("Enter the monthly installment,rate of interest and time period in months rspectively: ");
                double pr,ra;
                int no;
                pr=in.nextDouble();
                ra=in.nextDouble();
                no=in.nextInt();
                double a;
                a=(pr*no)+(((pr*no*(no+1))/2)*(ra/100)*(1/12));
                System.out.println("The maturity amount is: "+a);
                break;
                default:
                System.out.println("You have entered the wrong choice");
            }
        }
    }
}

