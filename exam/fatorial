import java.io.*;
import java.util.*;
class copy
{
 public static void main(String args[]) throws IOException
 {
  File f1 = new File("input.txt");
  f1.createNewFile();
  File f2 = new File("even.txt");
  f2.createNewFile();
  File f3 = new File("odd.txt");
  f3.createNewFile();
  
  FileWriter fw = new FileWriter(f1);
  FileWriter fw2 = new FileWriter(f2);
  FileWriter fw3 = new FileWriter(f3);
  

   
   
  Scanner sc = new Scanner(System.in);
  try
  {
   System.out.println("Enter the number of inputs: ");
   int n =sc.nextInt();
   int num;
   for(int i=0;i<n;i++)
   {
   System.out.print("Enter number: ");
   num = sc.nextInt();
   fw.write(num+"\n");
       
   }
    fw.close();   
   //File f4 = new File("input.txt");
   FileReader fr = new FileReader(f1);
   
 int i;   
   do
   {
   i=(int)fr.read();
   System.out.println(i);
   if(i%2==0)
   {
    fw2.write(i+"\n");
   }
   else
   {
    fw3.write(i+"\n");
   }
   

   }while(i!=-1);
   fr.close();
  
  }
  catch(IOException e)
  {
  System.out.println("error");
  
  }
  fw2.close();
  fw3.close();
 
 }
} 
  
  
 

