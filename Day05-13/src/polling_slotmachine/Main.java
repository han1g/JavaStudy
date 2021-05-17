package polling_slotmachine;

public class Main {
	public static void main(String[] args) {
		Object mutex = new Object();
		NumberProducer num1 = new NumberProducer(mutex);
		NumberProducer num2 = new NumberProducer(mutex);
		NumberProducer num3 = new NumberProducer(mutex);
		Thread tNum1 = new Thread(num1);
		Thread tNum2 = new Thread(num2);
		Thread tNum3 = new Thread(num3);
		Thread slot = new Thread(new SlotMachine(mutex,num1,num2,num3));
		tNum1.start();
		tNum2.start();
		tNum3.start();
		
		slot.start();
		
	}
}
