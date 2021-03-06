import java.util.Formatter;

//Format 문법
// %[argument_index$][flag][width][precision]conversation : 문자,숫자
// %[argument_index$][flag][width][precision] : 날짜,시간
// %[flags][width]conversation
// 인자위치 : 1$,2$ 이런식으로 표시
// flags : 출력형식을 바꿀 수 있는 문자셋
// width : 출력할 글자들의 최저 수(최솟값)
// precision : 표현될 글자들의 최대 수
// conversation : 전달 된 인자가 어떻게 포맷될지를 알려주는 포맷 형식 문자


public class FormatExample {
	public static void main(String[] args) {		
		Formatter f = new Formatter();
		f.format("%1$b, %3$h, %2$5s", false, 500,'A'/*65*/);
		//b : boolean,h : 16진수, s : string
		//%2$5s 문자열형식으로 5자리는 보장하라 빈자리는 공백
		System.out.println(f);
	}
}
