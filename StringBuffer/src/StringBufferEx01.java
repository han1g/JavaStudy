
public class StringBufferEx01 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();//버퍼용량 16
		StringBuffer sb2 = new StringBuffer(32);//버러용량 32
		StringBuffer sb3 = new StringBuffer("1234");//버퍼용량 : 초기값길이 + 기본버퍼(16)
		System.out.println(sb2.capacity());//용량표시
		System.out.println(sb3.length());//문자열길이 표시
		sb.append("hi");//append(기본자료형, char[], CharSequence, Object, String, StringBuffer)
		//delete(int start,int end) start부터 end까지 삭제
		//insert(int offset,String str) 중간에 끼워넣기
		//replace(int start,int end, str)교체하기
		//setLength(int newLength)//문자열 길이 재설정. 줄어들면 뒷부분 짤림. 늘어나면? 쓰레기값으로 채워짐
		//reverse() : 역순출력
		System.out.println(sb);
		sb.insert(1, "abc");
		System.out.println(sb);
		sb.replace(0, 1, "abc");//start부터 end까지 지우고 start부터 끼워넣기
		System.out.println(sb);
		//버퍼가 꽉차면 2배 + 2만큼 늘어남
		//또꽉차면 그거에 2배 + 2만큼 늘어남 
		
		//지워서 줄어들어도 버퍼용량은 그대로
		
		
	}
}
