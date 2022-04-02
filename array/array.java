class Abc
{
  public static void main(String args[])
  {
    int a[]=new int[5];  //declaration,instantiation
    a[0]=10;             //initialization 
    a[1]=20; 
    a[2]=30;
    a[3]=40;
    a[4]=50;
    for(int i=0;i<a.length;i++)
    System.out.println(a[i]);
    
    int arr[]={33,3,4,5};  //declaration,instantiation,initialization
     for(int i:arr)        //for each loop
      System.out.println(i);
      
   //multidimentional array
      //int a1[][] = new int[3][3];
      int a2[][]={{1,2,3},{4,5,6},{7,8,9}};
      
      
      for(int i=0;i<a2.length;i++)
      {
         for(int j=0;j<a2[i].length;j++)
           System.out.print(a2[i][j] + " ");
           System.out.println("\n");
      }
      
      
  }
}
