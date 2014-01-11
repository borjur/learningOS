/*
 * Boris Jurosevic
 * CS 3100
 * Program 1
 * 
 */


public class Thread_Three extends Thread
{
	public void run()
	{
		System.out.println("Thread Three starts");
		
		for(int x=1;x<=3;x++)
			
			System.out.println("Thread Three : x=" + x); 
		
		System.out.println("Exit from Thread Three ");
	}
}

