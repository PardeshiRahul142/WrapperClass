/*Q.4 write a java program to Find the frequency of each character in given String

Example Input: "sucessc"
Output:
s=3, u=1, c=2, e=1
*/

import java.util.*;
public class FCAPP
{ public static void main(String args[])
  { String str="success";
    int size=str.length();
    char a[]=str.toCharArray();
 
    boolean visited[]=new boolean[size];
    
    for(int i=0;i<size;i++)
    {
       if(visited[i]) continue;

       int count=1;
       for(int j=i+1;j<size;j++)
       { if(a[i] ==a[j])
         { 
          count++;
          visited[j]=true;
         }
       }
      System.out.println(a[i]+" "+count);
         
    }
 
 
  }
}//class