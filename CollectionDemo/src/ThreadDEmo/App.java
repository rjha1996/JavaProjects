package ThreadDEmo;

import java.util.Scanner;

class Processor extends Thread {

	
	private volatile boolean runner = true;
	//volatile is used to prevent caching thread 
	@Override
	public void run()
	{
		while(runner)
		{
			System.out.println("Hello");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}		
	
	
	public void shutdown()
	{
		runner = false;
	}

 }
	
public class App
{
	public static void main(String[] args) {
		
		Processor p1 = new Processor();
		p1.start();
		
		System.out.println("Processor return to stop..");
		
		Scanner s = new Scanner(System.in);
		s.nextLine();
		p1.shutdown();
		
		
		
	}
	
}

