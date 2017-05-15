package zad1;


public class Letters{

	private Thread[] threadsArr;
	volatile private boolean isTrue = true;
	
	public Letters(String string) throws InterruptedException {
		threadsArr = new Thread[string.length()];
		char[] a = string.toCharArray();
		
		for (int i = 0; i < threadsArr.length; i++) {
			char value = a[i];
			threadsArr[i] = new Thread(() -> {
				try {
					Thread.sleep(1000);
				while (isTrue) {
					String name = Thread.currentThread().getName();
					char lastLetter = name.charAt(name.length()-1);
					System.out.print(lastLetter);
					Thread.sleep(1000);

				}
			} catch (InterruptedException e) {
				e.printStackTrace();;
			}
			}, "Thread " + value);
	}
	}
	
	public Thread[] getThreads() {
		return threadsArr;
	}
	
	public void setIsTrue(boolean b){
		isTrue = b;
	}
}
