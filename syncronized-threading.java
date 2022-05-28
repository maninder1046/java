class  Message1 extends Thread
{
 synchronized public void run()
{
  try
  {
    while(true)
    {
       sleep(1000);
       System.out.println("hello  ");
      }
   }
  catch( Exception e)
  {
    System.out.println(e);
  }
  }
}
class  Message2 extends Thread
{
    synchronized public void run()
   {
     try
    {
       while(true)
    {
       sleep(2000);
      System.out.println("good morning ");
   }
 }
   catch( Exception e)
  {
     System.out.println(e);
  }
 }
}
class  Message3 extends Thread
{
  synchronized public void run()
  {
   try
 {
   while(true)
  {
    sleep(3000);
    System.out.println("good bye ");
    }
}
catch( Exception e)
{
System.out.println(e);
}
}
}
public class ThreadExample3
{
    public static void main(String args[])
    { 
      Message1 m1= new Message1();
      Message2 m2= new Message2();
      Message3 m3= new Message3();
      m1.start();
      m2.start();
      m3.start();
   }   
 }


