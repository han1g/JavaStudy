package callback_slotmachine;

public class SlotMachine implements Runnable{
	public static final int INF = 987654321;
	Object mutex;
	Object mutex2;
	NumberProducer num1;
	NumberProducer num2;
	NumberProducer num3;
	
	public SlotMachine(Object mutex,Object mutex2, NumberProducer num1, NumberProducer num2, NumberProducer num3) {
		super();
		this.mutex = mutex;
		this.mutex2 = mutex2;
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("슬롯머신 가동");
		
		while(true) {
			synchronized(mutex2) {
				while(true) {
					if(num1.getNum() == INF || num2.getNum() == INF || num3.getNum() == INF) {
						try {
							mutex2.wait();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					}
					else
						break;
				}
			}
			
			synchronized(mutex) {
				System.out.println(num1.getNum() + " " + num2.getNum() + " " + num3.getNum());
				if(num1.getNum() == num2.getNum() && num2.getNum() == num3.getNum()) {
					System.out.println("!!!!!!!!JACKPOT!!!!!!!!!!");
					System.exit(0);
				}	
				num1.setNum(INF);num2.setNum(INF);num3.setNum(INF);
				mutex.notifyAll();
			}
		}
		//wait을 안하면서 무한루프가 싱크로나이즈 안에 있으면 얘가 영원히 점거해버림
		//polling을 통해 확인하므로 cpu를 많이 잡아먹는다.
	}
	
}
