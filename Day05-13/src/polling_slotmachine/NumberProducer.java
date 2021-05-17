package polling_slotmachine;

public class NumberProducer implements Runnable{

	private Object mutex;
	private int num; 
	
	public NumberProducer(Object mutex) {
		super();
		this.mutex = mutex;
		this.num = SlotMachine.INF;
	}

	@Override
	public void run() {
		synchronized(mutex) {
			while(true) {
				num = (int) (Math.random()*9) + 1;
				try {
					Thread.sleep(10);
					mutex.wait();
				} catch (InterruptedException e) {
					return;
				}
				
			}
		}
		
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
