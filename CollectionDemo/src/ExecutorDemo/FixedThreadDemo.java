package ExecutorDemo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadDemo {

	public static void main(String[] args) {
		System.out.println("Main thread started here");
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		
		executor.execute(new LoopTask());
		executor.execute(new LoopTask());
		executor.execute(new LoopTask());
		executor.execute(new LoopTask());
		
		executor.shutdown();
		
		System.out.println("main thread end hee");
	}

}
