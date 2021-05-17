package pk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Collections01 {

	public static void main(String[] args) {

		//  Collections
		// 1. List : 순서가 있는 데이터의 집합. 중복 허용
		//  ArrayList, LinkedList, Vector, Stack....
		// 2. Set : 순서가 없는 데이터의 집합. 중복 허용 안함.
		//  HashSet, TreeSet
		// 3. Map : 키(key)와 값(value)의 쌍으로 이루어진 집합.
		// 순서가 없고, 키는 중복을 허용하지 않고, 값은 중복을 허용함.
		// HashiMap, TreeMap, HashTable...
		
		// Vector나 HashTable은 구형버젼.. 호완성을 위해서 남겨놓음
		// ArrayList나 HashMap을 사용할 것.
		
		
		// ArrayList
		// ArrayList는 List 인터페이스를 상속 받은 클래스.
		// 장점은 크기가 가변적으로 변함
		// 선형 리스트임
		// 일반적인 배열과 같은 순차 리스트이며, 인덱스로 내부의 elements를 관리함.
		// 대신 배열은 한 번 생성되면 크기가 변하지 않지만, ArrayList는 크기가 변한다.
		// ArrayList는 참조타입만 받기 때문에 기본타입으로 만들 수 없다.
		ArrayList aList1 = new ArrayList(4);		// 타입 미설정. 자동으로 Object 타입으로 생성됨.
		ArrayList<Integer> aList2 = new ArrayList<Integer>();
		ArrayList<Integer> aList3 = new ArrayList(); // 타입 파라미터 생략 가능
		ArrayList<Integer> aList5 = new ArrayList(Arrays.asList(1,2,3));
		
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(5);
		aList.add(null);
		
		for(int i=0; i<5;i++) {
			aList.add(i);
		}
//		
//		for(Integer out: aList)
//		{
//			System.out.println(out);
//		}
//		
		aList.add(1, 10);
//		for(Integer out: aList)
//		{
//			System.out.println(out);
//		}
		
//		aList.clear();
		
		// 하늘색은 인터페이스
		List aa = new ArrayList();
	
		// ArrayList 값 제거.
//		for(Integer out: aList)
//		{
//			System.out.println(out);
//		}
		
		System.out.println(aList.get(2));
		Iterator it = aList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		System.out.println(aList.contains(6));
		System.out.println();
		System.out.println(aList.indexOf(1));
	}

	
	
	
	// LinkedList
	// 연결리스트라고 하고, 각 노드가 데이터와 포인터를 가지고 한 줄로 연결되어 있는 방식의 자료구조.
	// 데이터를 담고 있는 노드들이 연결되어 있고, 노드의 포인터가 이전 노드와 다음노드와의 연결을 담당함.
	// 자료(객체)를 추가하거나 삭제하면 앞 뒤의 링크만 변경되고 나머지는 그대로 있음.
	// 전체 데이터가 밀리거나 당겨지는 일이 없어서 추가, 삭제 속도는 빠르나 검색 속도는 ArrayList에 비해 드림.
	
	List aList6 = new LinkedList();
	LinkedList aList1 = new LinkedList();
	LinkedList aList4 = new LinkedList();		
	LinkedList<Integer> aList2 = new LinkedList<Integer>();
	LinkedList<Integer> aList3 = new LinkedList(); 
	LinkedList<Integer> aList5 = new LinkedList(Arrays.asList(1, 3));
	
	// LinkedList 값 추가.
	LinkedList<Integer> lList = new LinkedList<Integer>(); 

	
	
}
