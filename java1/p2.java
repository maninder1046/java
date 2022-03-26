//program to count number of objects created]

class Count{
 static int counter=0;
 Count(){
   counter++; 
 }

public static void main(String args[])
{
  Count o1=new Count();
  Count o3=new Count();
  Count o2=new Count();
  System.out.println(counter);
}
  
 
}
