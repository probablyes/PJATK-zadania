package zad2;


public class StringTask implements Runnable {
	private String inscription;
	private long number;
	volatile private TaskState state;
	protected Thread t;
	protected Thread t2;
	private String result = "";
	volatile protected boolean isAborted = false;
	
	public StringTask(String inscription, long number){
		this.inscription = inscription;
		this.number = number;
		t = new Thread(this);
		state = TaskState.CREATED;
	}

	@Override
	public void run() {
		  for (int i = 0; i < number; i++) {			  
			  	if(t.isInterrupted()) {
			  	   state = TaskState.ABORTED;
	            }
			  	if (!isAborted) {
		           result += inscription;
		        }         	              
	        	}  
		  		if (state != TaskState.ABORTED){
		  			state = TaskState.READY;
		  		}
		} 

	public void start() {
		t.start();
		state = TaskState.RUNNING;
	}
	
	public void abort(){
		isAborted = true;
		t.interrupt();
	}

	public TaskState getState(){
		return state;
	}

	public boolean isDone() {
		if((state == TaskState.ABORTED || state == TaskState.READY)){
			return true;
		}else{
			return false;
		}
	}

	public String getResult() {
		return result;
	}

}
