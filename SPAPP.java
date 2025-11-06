/*Q.2 Write java program to Check if String is Palindrome or not*/

import java.util.*;
public class SPAPP
{ public static void main(String args[])
  { String str="madam";
    int len=str.length()-1;
    int i=0;
    int left=str.charAt(i); 
    int size=str.length()-1;
    int right=size;
    
    boolean flag=true;
    while(left<right)
    { 
       if(str.charAt(left) != str.charAt(right))
       { 
         flag =false;
         break;
       }
      left++;
      right--;
    }

    if(!flag)
    { System.out.println("String is not palindrome");
    }
    else 
    { System.out.println("String is palindrome");
    }
  }
}//class