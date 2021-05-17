package sc05;

import java.util.Scanner;

public class Wraith extends Unit implements Flyable{
	public Wraith() {
		this.life = 100;
		this.aPoint = 10;
		this.defence = 1;
		this.speed = 10;
		this.max_aPoint = 16;
		this.max_defence = 3;
	}

	@Override
	public void fly() {
		System.out.println("좌표를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("(" + x + ", " + y + ")로 '날아서' 이동합니다.");
		
	}
}
