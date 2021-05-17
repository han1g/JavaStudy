package sc04;

// 마린 : 공 5, 방0, 공업 +1, 방업 +1
// 탱크 : 공 50, 방1, 공업 +2, 방업 +2
// 레이스 : 공10, 방0,  공업 +2, 방업 +1

import java.util.Scanner;

public class Unit {
	int life;
	int aPoint;
	int defence;
	int speed;
	int max_aPoint;
	int max_defence;
	int u_aPoint;
	int u_defence;
	
	void attack() {
		System.out.println("공격합니다.");
		int damage = (int) ((aPoint * Math.random()) + 1);
		System.out.println(damage + "의 대미지를 주었습니다.");
	}
	
	void aUp(int u_aPoint) {
		if(aPoint < max_aPoint) {
			aPoint += u_aPoint;
			System.out.println("공격력이 업그레이드 되었습니다.");
			System.out.println("공격력은 " + aPoint + "이 되었습니다.");
		}
		else {
			System.out.println("공격력이 최대치입니다.");
			aPoint = max_aPoint;
		}
	}
	
	void dUp(int u_defence) {
		if(defence < max_defence) {
			defence += u_defence;
			System.out.println("방어력이 업그레이드 되었습니다.");
			System.out.println("방어력은 " + defence + "이 되었습니다.");
		}
		else {
			System.out.println("방어력이 최대치입니다.");
			aPoint = max_defence;
		}
	}
}
