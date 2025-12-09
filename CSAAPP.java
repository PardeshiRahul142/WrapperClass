import java.util.*;
public class CSAAPP
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
    
      System.out.println("Enter the first string ");
      String s1=sc.nextLine();
      System.out.println("Enter the second string ");
      String s2=sc.nextLine();

      if(s1.length()!=s2.length())
      { System.out.println("String is not equal");
      } 
     else
      { int result=0;
         for(int i=0;i<s1.length();i++)
         { 
            result=s1.charAt(i)-s2.charAt(i);
            if(result!=0)
            {
                  break;
            } 
         }
            String ans=(result==0) ? "String is equal":"String is not equal";
           System.out.println(ans);
      }
     
   }
}