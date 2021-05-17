package sc04;

import java.util.Scanner;

public class SCraft {
	static Scanner sc = new Scanner(System.in);
	static boolean behavior = true;
	static Marine m1 = new Marine();
	static Tank t1 = new Tank();
	static Wraith w1 = new Wraith();
	
	public static void main(String[] args) {	
		while(true) {
			System.out.println("유닛을 선택하세요.");
			System.out.println("-----------------------------");
			System.out.println("| 1. 마린 | 2. 탱크 | 3. 레이스 |");
			System.out.println("-----------------------------");
			
			int selectUnit = sc.nextInt();
			behavior = true;
			
			if(selectUnit == 1) {
				order(m1);// 넣는건 아규먼트
			}
			else if(selectUnit == 2) {
				order(t1);
			}
			else if(selectUnit == 3) {
				order(w1);
			}	// end of while(명령)
		}		// end of while(유닛 선택)
	}	// end of main method
	
	// order라는 메서드를 만들겁니다.
	// parameter : 매개변수,  메서드를 선언 할 때 적는거
	// argument : 인자, 만들어진 메서드를 사용할 때 넣는 값
	public static void order(Unit unit)//만든 건 파라메터
	{
		String name = "";
		if(unit instanceof Marine) {name ="마린";}
		else if(unit instanceof Tank) {name = "탱크";}
		else if(unit instanceof Wraith) {name = "레이스";}
		
		while(behavior) {
			System.out.println(name + "의 행동을 선택하세요.");
			System.out.println("------------------------------------------------");
			if(unit instanceof Tank){
				System.out.println("| 1. 이동 | 2. 공격 | 3. 공업 | 4. 방업 | 5. 시즈모드 | 0. 행동종료 |");
			}
			else {
				System.out.println("| 1. 이동 | 2. 공격 | 3. 공업 | 4. 방업 | 0. 행동종료 |");
			}
			System.out.println("------------------------------------------------");
			
			int select = sc.nextInt();
			switch(select) {
			case 1:
				if(unit instanceof Marine) {m1.move();}
				else if(unit instanceof Tank) {t1.move();}
				else if(unit instanceof Wraith) {w1.fly();}
				break;
			case 2:
				unit.attack();
				break;
			case 3:
				if(unit instanceof Tank || unit instanceof Wraith)
				{
					unit.aUp(2);
				}
				else {
					unit.aUp(1);
				}
				break;
			case 4:
				if(unit instanceof Marine || unit instanceof Wraith) {
					unit.dUp(1);
				}
				else {
					unit.dUp(2);
				}
				break;
			case 0:
				System.out.println("행동을 종료합니다.");
				behavior = false;
				break;
			case 5:
				if(unit instanceof Tank) {t1.siegeMode();}
				break;
			}
		}
	}
}		// end of class
