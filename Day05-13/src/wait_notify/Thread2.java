package wait_notify;

public class Thread2 implements Runnable{

	private Object mutex;
	
	public Thread2(Object mutex) {
		this.mutex = mutex;
	}

	@Override
	public void run() {
		
		synchronized (mutex) {
			try {
				System.out.println(Thread.currentThread().getName() + ".T2");
				mutex.wait();//synchronized의 mutex의 wait을 호출해야 한다.
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + ".T2");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	//run을 부르는건 멀티쓰레딩이 아님
	
}

