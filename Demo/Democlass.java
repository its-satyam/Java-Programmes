package Demo;
import java.util.*;
class Democlass
{
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int opt=0;
        System.out.println("Enter choice \n 1.find index \n 2.find chaaracter at index \n 3.convert string to uppercase \n 4.comparison substring of s1");
        opt=sc.nextInt();
        switch(opt)
        {
            case 1:
                    findIndex(s1,s2);
                    break;
            case 2: 
                    CharacterIndex(s1,s2);
                    break;
            case 3: 
                    convert(s1,s2);
                    break;
            case 4: 
                    comparison(s1,s2);
                    break;
            case 5:
                    findSubstring(s1);
                    break;
        }
    }
    public static void comparison(String s1, String s2) 
    {
        if(s1.compareTo(s2)==00)
        System.out.println("Equal Strings");
        else
        System.out.println("Not Equal");
    }
    public static void convert(String s1, String s2) 
    {
        System.out.println("Lower Case" + s1.toLowerCase() + " " + s2.toLowerCase());
        System.out.println("Upper Case" + s1.toUpperCase() + " " + s2.toUpperCase());
    }
    public static void CharacterIndex(String s1, String s2) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index: ");
        int ind=sc.nextInt();
        System.out.println(s1.charAt(ind) + "\n" + s2.charAt(ind));
    }
    public static void findSubstring(String s1) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index from which substring has to be found");
        int ind=sc.nextInt();
        System.out.println(s1.substring(0,ind));
    }
    public static void findIndex(String s1,String s2)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the variable: ");
            char el=sc.next().charAt(0);
            System.out.println(s1.indexOf(el) + "\n" + s2.indexOf(el));
        }
}