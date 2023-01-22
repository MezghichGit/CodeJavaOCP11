package chapitre7.part2_ExecutorService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExempleCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			Future<Double> res = service.submit(() -> 15.5);
			
			System.out.println("isDone ? :" + res.isDone());
			System.out.println("isCancelled ? :" + res.isCancelled());
			
			System.out.println(res.get());
			
			System.out.println("isDone ? :" + res.isDone());
			System.out.println("isCancelled ? :" + res.isCancelled());
			
		} finally {
			if (service != null)
				service.shutdown();
		}

	}
}
