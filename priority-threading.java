class A extends Thread 
{
	public void run ()
	{
		for (int i =1;i<=500;i++)
		{
		System.out.println("\t  From Thread A:i="+ i);
		}
	System.out.println("Exit from A");
	}
}
class B	extends Thread 
{
	public void run()
	{
		for(int j=0;j<=500;j++)
		{
	System.out.println("\t From Thread B:j="+j);
		}
	System.out.println("exit from Thread B:");

	}

}
class  C extends Thread 
{
	public void run ()
	{
		for (int k =1;k<=500;k++)
		{
		System.out.println("\t  From Thread C:k="+ k);
		}
		System.out.println("Exit from C");
	}
}
public class ThreadExample2
{
public static void main(String Args[])
{
A obA=new A();
B obB=new B();
C obC=new C();
obA.setPriority(5);
obB.setPriority(10);
obC.setPriority(1);
obA.start();
obB.start();
obC.start();
}



}
