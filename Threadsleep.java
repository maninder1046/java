class Disp {
public void wish(String name){
  int i;
  for(i=0;i<5;i++)
    System.out.println("hello ");
    try{
        Thread. sleep(1000);
        }
        catch(Exception e)
        { 
          System.out.println(e);
        }
      System.out.println(name);
      }
    }
    class MyThread extends Thread
    {
     Disp d;
     String name;
     MyThread (Disp  d,String name) 
     {
       this.d=d;
       this.name=name;
     }
     public void run()
     {
       d.wish(name);
     }
    }
    class Demo{
  public static void main(String args[])
  {
   Disp d = new Disp();
   MyThread t1=new MyThread(d,"ravi");
   t1.start();
   MyThread t2=new MyThread(d,"raj");
    t2.start();
  }    
}
