package sc04;

import java.util.Scanner;

public class Firebat extends Unit implements Moveable {
	public Firebat() {
		this.life = 50;
		this.aPoint = 15;
		this.defence = 0;
		this.speed = 5;
	}

	@Override
	public void move() {
		System.out.println("좌표를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("(" + x + ", " + y + ")로 이동합니다.");
		
	}
	
}
