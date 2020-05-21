package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new Task1());
		executorService.execute(new Thread(new Task2()));
		System.out.println("thread3 kickoff");
		for (int i = 299; i <= 399; i++) {
			System.out.print(i + " ");

		}
		System.out.println("\nthread3 completed");
		System.out.println("\nmain complete");
		executorService.shutdown();
	}

}
