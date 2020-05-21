package threads;
class Task1 extends Thread {
	public void run() {
		System.out.println("\ntask1 started");
		for (int i = 99; i <= 199; i++) 
			System.out.print(i + " ");
		Thread.yield();
		System.out.println("\ntask1 done");
		}
	
	}
class Task2 implements Runnable{

	@Override
	public void run() {
		System.out.println("\nthread2 kickoff");
		for (int i = 199; i <= 299; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nthread2 completed");
	}
	
}


public class ThreadRunner {
	

	public static void main(String[] args) throws InterruptedException {
		Task1 task1 = new Task1();
		task1.setPriority(6);
		task1.start();
		Task2 task2 = new Task2();
		Thread thread = new Thread(task2);
		thread.setPriority(10);
		thread.start();
		task1.join();
		thread.join();
		
		System.out.println("thread3 kickoff");
		for (int i = 299; i <= 399; i++) {
			System.out.print(i + " ");

		}
		System.out.println("\nthread3 completed");
	}

}
