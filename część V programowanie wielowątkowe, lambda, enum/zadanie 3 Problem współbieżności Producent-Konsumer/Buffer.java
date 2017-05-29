package zad3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Buffer {
	
	protected BlockingQueue<Integer> abq = new ArrayBlockingQueue<>(5);

	public int get() throws InterruptedException{
		int number = abq.take();	
		System.out.println("Skonsumowano element: " + number);
		return number;

	}
	
	public void put(int a) throws InterruptedException{
		System.out.println("Produkuję element: " + a + " ... czy się udało? " + abq.offer(a));
	}
	
}
