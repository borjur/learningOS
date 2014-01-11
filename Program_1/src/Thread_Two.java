/*
 * Boris Jurosevic
 * CS 3100
 * Program 1
 * 
 */


public class Thread_Two extends Thread
{
	public void run()
	{
		System.out.println("Thread Two starts");
		
		for(int x=1;x<=3;x++)
			System.out.println("Thread Two : x=" + x); 
		
		System.out.println("Exit from Thread Two ");
	}
}

