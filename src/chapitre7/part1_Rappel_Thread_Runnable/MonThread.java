package chapitre7.part1_Rappel_Thread_Runnable;

public class MonThread extends Thread{
	public void run() {
		for(int l = 0; l<10;l++)
		{
			System.out.println("L = "+l);
		}
	}

}
