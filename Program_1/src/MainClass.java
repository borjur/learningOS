/*
 * Boris Jurosevic
 * CS 3100
 * Program 1
 * 
 */



public class MainClass
{
	public static void main(String args[])
	{
		Thread_One threadOne = new Thread_One();
		Thread_Two threadTwo = new Thread_Two();
		Thread_Three threadThree = new Thread_Three();
		Thread_Four threadFour = new Thread_Four();
		
		threadThree.setPriority(Thread.MAX_PRIORITY);
		threadFour.setPriority(Thread.NORM_PRIORITY);
		threadTwo.setPriority(threadOne.getPriority());
		threadOne.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("Start Thread One");	
		threadTwo.start();
		System.out.println("Start Thread Two");	
		threadThree.start();
		System.out.println("Start Thread Three");	
		threadOne.start();
		System.out.println("Start Thread Four");	
		threadFour.start();


		
		
	}
}	
