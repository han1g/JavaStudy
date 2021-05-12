package hashex;

import java.util.HashSet;

class Person {
	int age;
	String name;
	

	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}


	@Override
	public int hashCode() {
		return(name + age).hashCode();
	}


	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/
	
	@Override
	public boolean equals(Object obj) {
		return false;
	}
	
	@Override
	public String toString() {
		return name + " " + age;
	}
}

public class HashSetExample {
	public static void main(String[] args) {
		HashSet set  = new HashSet();
		//HashSet은 hashcode값이 같은 객체만 같은 객체로 친다.
		//equals와 hashcode을 오버라이드하여 어떤객체를 같은 객체로 할지를 정해줘야함
		//equals가 true이고 hashcode값도 같아야 같은 객체로 쳐줌
		Person p = new Person(10,"aaa");
		
		System.out.println(p.equals(p));
		set.add(p);
		set.add(p);
		//equals가 false라도 == 해서 같은 객체면 중복으로 침
		
		//contains(Object o) : o를 포함하는가?
		
		System.out.println(set);
		
	}
}
