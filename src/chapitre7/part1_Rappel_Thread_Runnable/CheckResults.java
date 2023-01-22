package chapitre7.part1_Rappel_Thread_Runnable;

public class CheckResults {
	private static int counter = 0;

	public static void main(String[] args) throws InterruptedException {
		
		new Thread(() -> {
			
			for (int i = 0; i < 500; i++)
			{
				CheckResults.counter++;
			    System.out.println(CheckResults.counter);
			}
		}).start();
		
		int k = 0;
		while (CheckResults.counter < 100) {
			System.out.println("Not reached yet : "+k);
			Thread.sleep(1000); // 1 SECOND
			k++;

		}
		//send email counter = 100 send mail
		System.out.println("Reached!");
	}
}
