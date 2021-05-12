package com.vscore;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class ScoreImpl implements Score {
	
	private Vector<ScoreVO> list = new Vector<>();
	Scanner sc = new Scanner(System.in);
	
	public ScoreVO readScore(String hak) {
		ScoreVO vo = null;
		
		for(ScoreVO tmp : list) {
			if(tmp.getHak().equals(hak)) {
				vo = tmp;
				break;
			}
		}
		return vo;
	}
	public void setVO(ScoreVO vo) {
		System.out.println("이름 : ");
		 vo.setName(sc.next());
		 sc.nextLine();
		 System.out.println("생년월일 : ");
		 vo.setBirth(sc.next());
		 sc.nextLine();
		 System.out.println("국어 : ");
		 vo.setKor(sc.nextInt());
		 sc.nextLine();
		 System.out.println("영어 : ");
		 vo.setEng(sc.nextInt());
		 sc.nextLine();
		 System.out.println("수학 : ");
		 vo.setMat(sc.nextInt());
		 sc.nextLine();
		 
		 list.add(vo);
		 
	}
	
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("\n 자료추가");
		String hak;
		System.out.println("학번 : ");
		hak = sc.next();
		
		ScoreVO tmp = readScore(hak);
		if(tmp != null) {
			System.out.println("이미 존재하는 학생입니다.");
			return;
		}
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		setVO(vo);
		System.out.println("\n추가 완료");
		
		
	}
	
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("\n 자료수정");
		String hak;
		System.out.println("학번 : ");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		if(vo == null) {
			System.out.println("존재하지 않는 학생입니다.");
			return;
		}
		
		setVO(vo);
		System.out.println("\n수정 완료...............");
		//수정완료

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("\n 자료 삭제");
		String hak;
		System.out.print("삭제할 학번 : ");
		hak = sc.next();
		ScoreVO vo = readScore(hak);
		if(vo == null) {
			System.out.println("존재하지 않는 학생입니다.");
			return;
		}
		list.remove(vo);
		System.out.println("삭제완료.................");

	}

	@Override
	public void listAll() {
		// TODO Auto-generated method stub
		System.out.println("\n 전체 자료 출력");
		/*Iterator<ScoreVO> it = list.iterator();
		while(it.hasNext()) {
			ScoreVO vo = it.next();
			System.out.println(vo);
		}*/
		
		for(ScoreVO vo : list)
			System.out.println(vo);
		System.out.println();

	}

	@Override
	public void searchHak() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchName() {
		// TODO Auto-generated method stub

	}

}
