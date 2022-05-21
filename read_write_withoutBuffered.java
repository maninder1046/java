import java.io.*;
class Ab{
  public static void main(String args[])throws IOException
  {
    FileInputStream fis = new FileInputStream("/home/gehu/Desktop/tt1.txt");
   // BufferedInputStream bis  =new BufferedInputStream(fis);
     FileOutputStream fos =  new FileOutputStream("/home/gehu/Desktop/tt2.txt");
   // BufferedOutputStream bos  = new BufferedOutputStream(fos);
    int i=0;
    while((i=fis.read())!=-1)
    {
      fos.write(i);
    }
   // bis.close();
   // bos.close();
    fis.close();
    fos.close();
  }
}
