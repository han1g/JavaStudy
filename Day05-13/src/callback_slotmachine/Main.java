package callback_slotmachine;

public class Main {
	public static void main(String[] args) {
		Object mutex = new Object();
		Object mutex2 = new Object();
		NumberProducer num1 = new NumberProducer(mutex,mutex2);
		NumberProducer num2 = new NumberProducer(mutex,mutex2);
		NumberProducer num3 = new NumberProducer(mutex,mutex2);
		Thread tNum1 = new Thread(num1);
		Thread tNum2 = new Thread(num2);
		Thread tNum3 = new Thread(num3);
		Thread slot = new Thread(new SlotMachine(mutex,mutex2,num1,num2,num3));
		
		tNum1.start();
		tNum2.start();
		tNum3.start();
		
		slot.start();
		
	}
}
