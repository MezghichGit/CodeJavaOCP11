package chapitre7.part1_Rappel_Thread_Runnable;

public class PrintData implements Runnable {
	
	public void run() {
		for (int i = 0; i < 5; i++)
			System.out.println("Printing record: " + i);
	}

	public static void main(String[] args) {

		Runnable task1 = () -> {
			for (int j = 0; j < 20; j++) {
				System.out.println("J = " + j);
			}
		};
		
		Runnable task2 = () -> {
			for (int k = 0; k < 20; k++) {
				
				//Traitement qu'on veut
				System.out.println("K = " + k);
			}
		};
		
		
		System.out.println("Starting main");
	
		//PrintData p1 = new PrintData();
		
		
		
		
		
		
		Thread t1 = new Thread(task1);
		t1.setPriority(2);
		t1.start();
		
		t1 = new Thread(task2);
		t1.start();
		
		/*Thread t2 = new Thread(task2);
		t2.setPriority(10);
		t2.start();*/
		
		//new MonThread().start();
		
		
		/*
		(new Thread(p1)).start();
		//(new Thread(new PrintData())).start();

		(new Thread(task1)).start();
		(new Thread(task2)).start();
		for(int i = 0; i<20; i++)
			System.out.println("I = " + i);
		System.out.println("Ending main");
		 */
	}
}
