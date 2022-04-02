	
class Abc
{
  public static void main(String args[])
  {	
    String  s= "Hello";
    System.out.println(s.concat(" java"));
   
   //string charAt()
    String ss = "Strings are immutable";
    char result = ss.charAt(8);
    System.out.println((result));
   
   //equals()
    String s1 = "Xyz";
    String s2 = "Hello";
    String s3 = "hello";
    System.out.println(s.equals(s1)); //false  
    System.out.println(s.equals(s2)); //True
    System.out.println(s==s2);        //true
    System.out.println(s==s3);        //false
  
  //equalsIgnorecase()
   System.out.println(s.equalsIgnoreCase(s3));  //true
   
  //indexOf()
   System.out.println(ss.indexOf('l'));          //19 
   String str =new String("welcome to tutorial");
   System.out.println(str.indexOf("o",5));        //9 (ignores all o till 5th index)
  
  //lastindexof()
   System.out.println(s.lastIndexOf('e'));    //1
  
  //tolowerCase()
   System.out.println(s.toLowerCase());      //hello
  
  //toUpperCase()
   System.out.println(s.toUpperCase());      //HELLO	
 
  //isEmpty()
   System.out.println(s.isEmpty());          //false
  
  //substring()
   String s4= "javahere";
   System.out.println(s4.substring(2));  //vahere
   System.out.println(s4.substring(2,4));  //va
  }
}
