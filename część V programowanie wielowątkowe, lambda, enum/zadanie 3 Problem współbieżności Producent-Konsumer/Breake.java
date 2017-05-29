package zad3;

import java.util.TimerTask;

public class Breake extends TimerTask{
	
	Producer p;
	Consumer c;
	
	public Breake(Producer p, Consumer c){
		this.p = p;
		this.c = c;
	}
	
	@Override
	public void run() {
		p.t.interrupt();
		c.t.interrupt();
		System.exit(0);
	}
}
