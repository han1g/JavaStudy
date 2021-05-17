package sc04;

import java.util.Scanner;

public class Tank extends Unit implements Moveable{
	boolean siegeMode = false;
	
	public Tank() {
		this.life = 150;
		this.aPoint = 50;
		this.defence = 1;
		this.speed = 5;
		this.max_aPoint = 56;
		this.max_defence = 7;
	}
	
	@Override
	public void move()
	{
		if(siegeMode == true) {
			System.out.println("시즈모드 상태입니다. 이동할 수 없습니다.");
		}
		else {
			System.out.println("좌표를 입력하세요.");
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println("(" + x + ", " + y + ")로 이동합니다.");
		}
	}
	
	void siegeMode() {
		if(siegeMode == false) {
			siegeMode = true;
			System.out.println("시즈모드를 전개합니다.");
			aPoint += 150;
		}
		else {
			siegeMode = false;
			System.out.println("시즈모드를 해제합니다.");
			aPoint -= 150;
		}
	}
}
