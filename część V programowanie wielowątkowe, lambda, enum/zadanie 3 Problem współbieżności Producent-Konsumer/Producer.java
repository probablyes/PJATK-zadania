package zad3;


public class Producer implements Runnable {
	
	protected Buffer b;
	protected Thread t;
	protected boolean isTrue = true;
	
	public Producer(Buffer b){
		this.b = b;
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		while(true){
				int a = (int) (Math.random() * 50);
				try {
					long l = (long) (Math.random() * 3);
					b.put(a);
					Thread.sleep(l * 1000);
				} catch (InterruptedException e) {
					System.out.println("Minelo 15 sekund - producent kończy produkcję.");
					break;
				}
		}
	}

}

