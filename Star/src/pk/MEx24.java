package pk;

import java.util.ArrayList;
import java.util.LinkedList;

public class MEx24 {
	public static void main(String[] args) {
		ArrayList<Marine24> marines = new ArrayList<Marine24>();
		
		marines.add(new Marine24(50));
		marines.add(new Marine24(100));
		marines.add(new Marine24(100));
		System.out.println(marines.get(0));
		System.out.println(marines.get(1));
		
		
		System.out.println(marines.get(0).life);
		System.out.println(marines.get(1).life);
		System.out.println(marines.get(2).speed);
		
		// LinkedList 만든 이유 ArrayList는 가변적이라 사용이 쉽지만 하나를 수정할 경우 모든 값의 위치 값이 이동되어야 함 따라서 트래픽이 발생
		
		LinkedList lList = new LinkedList();
		lList.add(1);
	}
}
