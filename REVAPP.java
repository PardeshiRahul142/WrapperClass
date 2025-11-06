/*Q.1 Write a java program to reverse given String 

Example Input: "Hello"
Output: "olleH"
*/
import java.util.*;
public class REVAPP
{ public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the String ");
   String str=sc.next();
/*   for(int i=str.length()-1;i>=0;i--)
   { System.out.print(str.charAt(i));
   }
*/
   int len=str.length()-1;
   int i=len;
   while(i>=0)
   { System.out.println(str.charAt(i));
     i--;
   }
  }//main
}//class