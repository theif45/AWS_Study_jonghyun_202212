package j16_Object;

import java.util.Objects;

public class Student {

	private String name;
	private int age;

	public Student(String name, int age) {
		super(); // 부모 클래스의 생성자 // Object클래스에서 상속받음
		this.name = name;
		this.age = age;
	}

	// hash는 특별한 알고리즘을 이용하여 데이터의 고유한 주소값 생기며 이를 숫자로 변환한 것을 hashCode라고 함
	@Override
	public int hashCode() {
		return Objects.hash(name, age); // 객체들을 관리하는 소스코드를 가지고 있음
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj.getClass() == Student.class)) { // 객체의 클래스를 가져와 명확하게 Student 클래스일 경우를 비교함
			return false;
		}

		Student s = (Student) obj;
		boolean result = name.equals(s.name) && age == s.age;

		return result;
	}

	@Override
	public String toString() {
		return "이름 : " + name + "\n나이 :" + age;
	}
}
