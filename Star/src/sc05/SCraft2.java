package sc05;

import java.util.Scanner;

public class SCraft2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean behavior = true;
		
		Tank t1 = new Tank();
		
		while(behavior) {
			System.out.println("탱크의 행동을 선택하세요.");
			System.out.println("---------------------------------------------------");
			System.out.println("| 1. 이동 | 2. 공격 | 3. 공업 | 4. 방업 | 5. 시즈모드 | 6. 행동종료 |");
			System.out.println("---------------------------------------------------");
			
			int select = sc.nextInt();
			switch(select) {
			case 1:
				t1.move();
				break;
			case 2:
				t1.attack();
				break;
			case 3:
				t1.aUp();
				break;
			case 4:
				t1.dUp();
				break;
			case 5:
				t1.siegeMode();
				break;
			case 6:
				System.out.println("행동을 종료합니다.");
				behavior = false;
				break;
			}
		}
	}
}
