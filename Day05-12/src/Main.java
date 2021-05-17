import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static final int NUM = 20;
	public static void main(String[] args) {
		List<Integer> sengsan = new LinkedList<>();
		for(int i = 0 ; i < NUM;i++) {
			sengsan.add((int) (Math.random() * 199) - 99);
		}
		
		System.out.println("전체데이터");
		
		List<Integer>[] gesan = new List[3];
		for(int i = 0; i < 3;i++)
			gesan[i] = new ArrayList<Integer>();
		
		Iterator<Integer> it = sengsan.iterator();
		int index = 0;
		while(it.hasNext()) {
			int next = it.next();
			System.out.print(next + " ");
			gesan[index%3].add(next);
			index++;
		}
		System.out.println();
		System.out.println("계산자데이터");
		for(int i = 0 ; i < 3;i++) {
			int sum = 0;
			Iterator<Integer> lIt = gesan[i].iterator();
			while(lIt.hasNext()) {
				sum += lIt.next();
			}
			System.out.println("calc" + (i+1) + ":" + sum);
		}
		
	}
}
