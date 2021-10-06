import java.io.*;
import java.util.*;


class factorial
{ 
  void fact(int n)
  
  {   
	  int factorial = 1;
	  
	  for(int i = n;i>0;i--)
	  {
	   factorial = factorial*n;
	   n--;

	  }
	  System.out.print("\n Factorial :"+factorial);
 
 }
 
}

class factTest
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.print("\n Enter the Number: ");
  int n = sc.nextInt();
  factorial obj = new factorial();
  obj.fact(n);
  
}
}
