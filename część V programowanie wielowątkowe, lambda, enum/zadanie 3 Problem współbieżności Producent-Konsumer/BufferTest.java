package zad3;

import java.util.Timer;

public class BufferTest {

	public static void main(String[] args) throws InterruptedException {

		Buffer bf = new Buffer();
		Producer producent = new Producer(bf);
		Consumer consumer = new Consumer(bf);
		
		Breake br = new Breake(producent, consumer);
		Timer t = new Timer();
		t.schedule(br, 15000);
	}

}
