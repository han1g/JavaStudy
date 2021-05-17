package wait_notify;

public class Thread1 implements Runnable{

	private Object mutex;
	
	public Thread1(Object mutex) {
		this.mutex = mutex;
	}

	@Override
	public void run() {
		
		synchronized (mutex) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("T1");
			mutex.notify();
		}
		
	}
}
