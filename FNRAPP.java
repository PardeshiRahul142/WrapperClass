/*Q.6 write a java program to find the first non-repeating character

Example Input: "swiss"
Output: "w"
*/

import java.util.*;
public class FNRAPP
{ public static void main(String args[])
  {  String str="swiss";
     int size=str.length();
    boolean found=false;
    for(int i=0;i<size;i++)
    { Boolean flag=false;
      for(int j=i+1;j<size;j++)
      {
        if(str.charAt(i) == str.charAt(j))
        { flag=true;
          break;   
        }     
      }
      if(!flag) 
      { System.out.println(str.charAt(i));
        found=true;
        break;
      }
    } 
  }
}//class