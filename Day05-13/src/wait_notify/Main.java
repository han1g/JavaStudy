package wait_notify;

public class Main {
	public static void main(String[] args) {
		Object mutex = new Object();
		Thread t1 = new Thread(new Thread1(mutex));
		Thread t2 = new Thread(new Thread2(mutex));
		Thread t2_2 = new Thread(new Thread2(mutex));
		t2.start();
		t2_2.start();
		t1.start();
		
	
	}
}
