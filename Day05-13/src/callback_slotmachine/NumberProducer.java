package callback_slotmachine;

public class NumberProducer implements Runnable{

	private Object mutex;
	private Object mutex2;
	private int num; 
	
	public NumberProducer(Object mutex,Object mutex2) {
		super();
		this.mutex = mutex;
		this.mutex2 = mutex2;
		this.num = SlotMachine.INF;
	}

	@Override
	public void run() {
		while(true) {
			synchronized(mutex) {
				//System.out.println("HI");
				num = (int) (Math.random()*9) + 1;
				try {
					//Thread.sleep(10);
					synchronized (mutex2) {
						mutex2.notify();
					}
					
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
