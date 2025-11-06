/*Q.3 write a java program to Count vowels and consonants character given String

Example Input: "Programming"
Output: Vowels = 3, Consonants = 8
*/

import java.util.*;
public class CVCAPP
{ public static void main(String args[])
  {  
    String str="Programming";
    int vow=0;
    int con=0;

    for(int i=0;i<str.length();i++)
    {  if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'|| str.charAt(i)=='i'||
          str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U')
        {vow++;
        }
       else
       { con++;
       }
    }
   System.out.println("Vowels is :"+vow);
   System.out.println("Consonants is :"+con);
    
  }
}//class