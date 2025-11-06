/*Q.5 write a java program to Remove duplicate characters from given String

Example Input: "programming"
Output: "progamin"
*/

import java.util.*;
public class RDSAPP
{ public static void main(String args[])
  {  String str="programming"; 
     char ch[]=str.toCharArray();
     int len=ch.length;
    // System.out.println("total length :"+len);
     int count=0;
     for(int i=0;i<len;i++)
     {  
        for(int j=i+1;j<len;j++)
        { if(ch[i] == ch[j])
          {  ch[j] = ch[j+1];
             for(int k=j;k<len-1;k++)
             { ch[k]=ch[k+1];
             }
            j--;
            len--;
          }
           
        }
     }
    
        for(int i=0;i<len;i++) 
        { System.out.print(ch[i]+" ");
        }
  }
}//class