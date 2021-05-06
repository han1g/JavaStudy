package com.obj;

public class StringEx01 {
	public static void main(String[] args) {
		String x = "10";
		String y = x;
		y = "20";
		System.out.println("X = " + x); // 10
		// String은 call by value??
		// NO
		// "10"과 "20"은 다른객체
		// y가 "10"을 참조하다가 "20"을 참조하게 된 것
		// 이런식으로 동작하기 때문에 String이 클래스이지만 기본 자료형처럼 쓰이는것
		
		String a = "10";
		String b = "10";
		System.out.println("a == b ? " + (a == b));//true
		
		String c = new String("10");
		System.out.println("C = " + c); // 10
		System.out.println("a == c ? " + (a == c));//false
		System.out.println("a.equals(c) ? " + a.equals(c));//true
		//"10"과 new String("10")은 다른 객체
		//String비교할 때 equals써야하는 이유
	}
}
