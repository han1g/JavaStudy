package sc04;

import java.util.Scanner;

public class Marine extends Unit implements Moveable{
	public Marine() {
		this.life = 50;
		this.aPoint = 5;
		this.defence = 0;
		this.speed = 5;
		this.max_aPoint = 8;
		this.max_defence = 3;
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
