/* 
 * Boris Jurosevic
 * CS3100
 * Program 2
 */
public class Program2 extends Object {  
 
	//monkey variable
     private String monkey;  
 
    
    // our constuctor
       public Program2(String monkey) {  
 
        this.monkey = monkey;  
 
      }  
 
     
       //we start synchonizing 
       public synchronized void crossing(int mon) {  
 
    	   result("is ready to go!");  
           
           
          int monkey_broj = mon + 2 + monkey.length();  
 
          result("is going east NUMBER " + monkey_broj);  
 
     
  
          //put thread to sleep
          try { Thread.sleep(2050); }   
 
                         catch ( InterruptedException x ) { }  
 
   
 
          result("is leaving east and going towards west");  
         System.out.println("MONKEY IS ON A WEST SIDE");
 
       }  
 
     
       //print our results
       public void result(String poruka) {  
 
    	   printCrossing("-->" + monkey + " - " + poruka);  
           
       }  
 
     
       //print our crossing
       public static void printCrossing(String poruka) {  
 
           String cross_monkey = Thread.currentThread().getName();  
 
           System.out.println(cross_monkey + ": " + poruka);  
           
           
 
      }  
 
      
       
 
       //main class
       public static void main(String[] args) {  
      	 
           final Program2 key = new Program2("step");  
           
           System.out.println("WE WILL SEE HOW 2 MONKEYS GO ON ONE SIDE , ONE AT THE TIME");
           System.out.println("EACH MONKEY HAS IT'S OWN NUMBER JUST TO SEE WHAT MONKEY IS CROSSING");
     
           //our runnable mothod for monkey A
           Runnable Monkey_A = new Runnable() {  

                   public void run() {  

                	   key.crossing(1);  

                    }  

                };  

                

            Thread first_monkey = new Thread(Monkey_A, "MONKEY A");  

            first_monkey.start();  

          

            try { Thread.sleep(250); }   

                          catch ( InterruptedException x ) { }  

            
            //our runnable mothod for monkey B

           Runnable Monkey_B = new Runnable() {  

                    public void run() {  

                    	key.crossing(2);  

                   }  

               };  

      

            Thread second_monkey = new Thread(Monkey_B, "MONKEY B");  
            
            second_monkey.start();  
            
            

        }  
 
   } 
 