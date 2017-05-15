package zad3;

public class Consumer implements Runnable{
	
	protected Buffer b;
	protected Thread t;
	protected boolean isTrue = true;
	
	public Consumer(Buffer b){
		this.b = b;
		t = new Thread(this);
		t.start();
		
	}

	@Override
	public void run() { 
			while(true){
				try {
					long l = (long) (Math.random() * 3);
					b.get();
					Thread.sleep(l * 1000);
				} catch (InterruptedException e) {
					System.out.println("Minelo 15 sekund - konsumer kończy konsumpcję.");
					break;				
				} 
			}	

	}

}
