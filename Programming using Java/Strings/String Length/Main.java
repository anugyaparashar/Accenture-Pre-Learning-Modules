import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        //Fill the code here
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len=str.length();
        if(len%2==0)
        System.out.println(len+" Even");
        else
        System.out.println(len+" Odd");
    }
}