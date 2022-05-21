import java.io.*;
class Ab{
  public static void main(String args[])throws IOException
  {
    FileReader isr = new FileReader("/home/gehu/Desktop/tt1.txt");
     BufferedReader br = new BufferedReader(isr);
     FileWriter fw  =  new FileWriter("/home/gehu/Desktop/tt2.txt");
    BufferedWriter bw  = new BufferedWriter(fw);
   String s;
    while((s=br.readLine())!=null)
    {
      bw.write(s);
      //System.out.println(s);
    }
     bw.close();
     fw.close();
     br.close();
    isr.close();
  }
}
