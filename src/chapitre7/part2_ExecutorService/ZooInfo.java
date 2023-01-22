package chapitre7.part2_ExecutorService;

import java.util.List;
import java.util.concurrent.*;

public class ZooInfo {    // 2 Thread : main et service
	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			//service = Executors.newFixedThreadPool(20);
			service = Executors.newCachedThreadPool();
			//service = Executors.newSingleThreadExecutor();
			System.out.println("begin");
			
			service.execute(
					
					() -> {
						System.out.println("Printing zoo inventory 1");
						System.out.println(Thread.currentThread().getName());
					}
					
					); //Task1
			
			service.execute(() -> {  //Task2
				for (int i = 0; i < 30; i++)
					System.out.println("Printing record: " + i);
				
				System.out.println(Thread.currentThread().getName());
			});
			
			service.execute(() -> 
			
			            {
			            	System.out.println("Printing zoo inventory 2");
			            	System.out.println(Thread.currentThread().getName());
			            }
					
					); //Task3
			
			service.execute(() -> 
			
			   {
	            	System.out.println("Printing zoo inventory 3");
	            	System.out.println(Thread.currentThread().getName());
	            }
			
			
					);  //Task4
			
			
			System.out.println("end");
		} finally {
			System.out.println("Block finally");
			if (service != null)
				{
				service.shutdown();
				//List<Runnable>notTerminatedTasks = service.shutdownNow();
				System.out.println("service.isShutdown ?" +service.isShutdown());
				System.out.println("service.isTerminated ? " +service.isTerminated());
				
				//System.out.println(notTerminatedTasks);
				
				//System.out.println("service.isShutdown ?" +service.isShutdown());
				//System.out.println("service.isTerminated ? " +service.isTerminated());
				
				//service.execute(() -> System.out.println("Printing zoo inventory 4")); //RejectedExecutionException
				
				/*List<Runnable>notTerminatedTasks = service.shutdownNow();
				System.out.println(notTerminatedTasks);
				System.out.println("service.isShutdown ?" +service.isShutdown());
				System.out.println("service.isTerminated ? " +service.isTerminated());*/
				}
			
			
			
			
			//service.execute(() -> System.out.println("Printing zoo inventory 3")); //RejectedExecutionException
		}
		//System.out.println("service.isShutdown 2 ?" +service.isShutdown());
		//System.out.println("service.isTerminated  2? " +service.isTerminated());
	}
}
