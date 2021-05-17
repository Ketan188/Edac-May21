import java.util.*;
public class AssigQ22
{
  public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
      int binary=sc.nextInt(); 
      int deci=0;  
      int n=0;  
      while(true)
	  {  
        if(binary == 0)
	  {  
        break;  
      } 
	  else 
	  {  
          int temp = binary%10;  
          deci += temp*Math.pow(2, n);  
          binary = binary/10;  
          n++;
      }  
	  }
	  System.out.println(deci);	
    }
}