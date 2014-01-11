

public class Thread_Four extends Thread
{
	public void run()
	{
		System.out.println("Thread Four starts");
		
		for(int x=1;x<=3;x++)
			
			System.out.println("Thread Four : x=" + x); 
		
		System.out.println("Exit from Thread Four ");
	}
}
