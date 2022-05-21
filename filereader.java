//read from file and priting on console
import java.io.*;
class Ab{
  public static void main(String args[])throws IOException
  {
    FileReader isr = new FileReader("/home/gehu/Desktop/tt1.txt");
     BufferedReader br = new BufferedReader(isr);
   String s;
    while((s=br.readLine())!=null)
    {
      
      System.out.println(s);
    }
   
     br.close();
    isr.close();
  }
}
