import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        //Fill the code here
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        if(str1.equalsIgnoreCase(str2))
        {
            if(a.equals(b)==true)
               System.out.println("Case sensitive");
            else 
               System.out.println("Case insensitive");
        }
        else
        System.out.println("Not equal");
    }
}