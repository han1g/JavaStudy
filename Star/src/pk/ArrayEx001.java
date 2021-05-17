package pk;

public class ArrayEx001 {
	String s3;
	// 노란색 지역변수
	// String 클래스 = 참조자료형
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.println(arr);
			System.out.println(arr[i]);
		}
	}
}
