import java.util.Scanner;
class NegativeAgeException extends Exception {
	int age;
	NegativeAgeException (int a)
	{
		age = a;
	}
	public String toString()
	{
		return "Age cannot be negative" + " " + age;
	}
}
class Excep4
{
	public static void main(String[] args)
	{
		int age;
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter your age: ");
			age = sc.nextInt();
			if(age < 0)
			{
				NegativeAgeException e = new NegativeAgeException(age);
				throw e;
			}
			else
			{
				System.out.println("Age entered is " + age);
			}
		}
		catch(NegativeAgeException ex)
		{
			System.out.println(ex);
		}
		finally
		{
			sc.close();
		}
		System.out.println("Rest of code...");
	}
}
