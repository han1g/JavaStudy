package com.vscore;

import java.io.IOException;

public class ScoreMain {
	public static void main(String[] args) throws IOException {
		char ch = 1;//메뉴호출
		Score score = new ScoreImpl();
		while(ch != 0) {
			do {
				System.out.println("1.추가,2.수정,3.삭제,4.전체출력,5.학번검색,6.이름검색,7.종료 => ");
				ch = (char) System.in.read();
				System.in.read();
				System.in.read();
				//cr lf
			}while(ch > '7' || ch < '1');
			
			switch(ch) {
			case '1': score.insert(); break;
			case '2': score.update(); break;
			case '3': score.delete(); break;
			case '4': score.listAll(); break;
			case '5': score.searchHak(); break;
			case '6': score.searchName(); break;
			case '7': System.exit(0); break;
			}
		}
		
	}
}
