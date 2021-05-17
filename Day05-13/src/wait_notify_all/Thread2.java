package wait_notify_all;

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
				//wait을 하면 waiting풀로 들어가서 다른 스레드가 싱크로나이즈 블록에 들어옴
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + ".T2");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

