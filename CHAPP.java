import java.util.*;
public class CHAPP
{  public static void main(String args[])
   {
      String s="GOOD";
      int len=s.length();

      for(int i=0;i<len;i++)
      {
         char ch=s.charAt(i);
         System.out.println(i+"--->"+ch);
      }

   }

}