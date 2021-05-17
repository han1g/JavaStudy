package com.ex;

import java.util.Map;
import java.util.Map.Entry;

/*
 * Daemon Thread
 * 종속스레드
 * 메인스레드가 죽으면 같이죽음
 * setDaemon으로 지정 isdaemon으로 데몬인지 확인
 * 부른 스레드에 종속됨
 * 
 * 데몬으로 안하면 메인이 죽어도 스레드가 안끝남
 */
public class ThreadEx implements Runnable{
	
	static boolean autoSave = false;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(autoSave) {
				Map<Thread, StackTraceElement[]> trace = Thread.getAllStackTraces();
				for(Map.Entry<Thread, StackTraceElement[]> elem : trace.entrySet()) {
					for(int i=0;i < elem.getValue().length;i++) {
						System.out.println(elem.getKey() + " " + elem.getValue()[i]);
					}
				}
				autoSave();
			}
			try {
				Thread.sleep(3000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void autoSave() {
		System.out.println("saved");
	}
	public static void main(String[] args) {
		Thread t = new Thread(new ThreadEx());
		t.setDaemon(true);
		t.start();
		
		for(int i = 0 ; i < 10;i++) {
			try {
				Thread.sleep(1000);
				
			}catch (InterruptedException e) {
				// TODO: handle exceptioen
				e.printStackTrace();
				
			}
			System.out.println();
			if(i == 5) {
				autoSave=true;
			}
		}
		//데몬으로 안하면 메인이 죽어도 저장이 안끝남
	}
	
}
