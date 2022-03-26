import java.util.*;
// program to enter details of student with static university 
class Student{
 int rollno;
 String name;
 String branch;
 static String university="Graphic Era Hill University ";
void set(String name ,int rollno ,String branch)
{
  this.name=name;
  this.rollno=rollno;
  this.branch=branch;
}
void get()
{
  System.out.println("Name " + name + "\nBranch " + branch + "\nrollno " + rollno + "\nuniversity" + university);

}
public static void main(String args[])
{
  Scanner sc= new Scanner(System.in);
  Student s1=new Student();
  String name ,branch;
  int rollno;
  System.out.println("enter name  :");
  name =sc.nextLine();
  System.out.println("enter rollno");
  rollno =sc.nextInt();
  System.out.println("enter branch");
  branch =sc.nextLine();
  System.out.println("enter university");
  university =sc.nextLine();
  s1.set(name,rollno,branch);
  s1.get();
  
}
}
