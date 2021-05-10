package hashex;

import java.util.HashSet;

class Person {
	int age;
	String name;
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		
		Person tmp = (Person) obj;
		if(this.age == tmp.age && this.name.equals(tmp.name))
			return true;
		
		return false;
		
	}
}

public class HashSetExample {
	public static void main(String[] args) {
		HashSet set  = new HashSet();
		//HashSet은 hashcode값이 같은 객체만 같은 객체로 친다.
		//equals를 오버라이드하여 어떤객체를 같은 객체로 할지를 정해줘야함
		
		
	}
}
