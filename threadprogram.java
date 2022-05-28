class Reserve extends Thread{
    
     int available = 1;
     int wanted;
 
     public Reserve(int i){
          wanted = i;
     }
    
     public synchronized void run(){
          
          System.out.println("Available berths= "+available);
       
          if(available>=wanted){
          
              String name = Thread.currentThread().getName();
            
              System.out.println(wanted +" Berth(s) reserved for "+name);
              try{
                   Thread.sleep(2500);
                   available = available-wanted;
                 
              }catch (InterruptedException ie) {
                   ie.printStackTrace();
              }
          }else{
              
              System.out.println("Sorry! No berths available");
          }
     }
}

public class ThreadExample4 {

     public static void main(String[] args) {
          
          Reserve obj = new Reserve(1);
          Thread t1 = new Thread(obj);
          
          Thread t2 = new Thread(obj);
         
          t1.setName("First Person");
          t2.setName("Second Person");
         
          t1.start();
          t2.start();
     }

}
