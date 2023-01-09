package j10_생성자;

import j09_클래스.J09_Student;

public class J10_Student {

//	참조 변수, 레퍼런스 변수, 멤버 변수
	public String name;
	public int age;

//	참조 메소드, 레퍼런스 메소드, 멤버 메소드
	J10_Student() {
		System.out.println("기본 생성자 호출");
	}

	J10_Student(int age) {
		System.out.println("학생의 나이 : " + age);
	}

	J10_Student(String name) {
		System.out.println("학생의 이름 : " + name);
	}

	J10_Student(String name, int age) {
//		생성자를 호출할 때 값을 넣어주기 위해서 멤버 변수에 this. 사용하여 구분하여 줌
//		우선 순위는 지역변수가 멤버 변수보다 더 높음
//		this는 자기 자신의 주소를 나타냄
		this.name = name;
		this.age = age;
	}

	void printInfo() {
		System.out.println("학생 이름 : " + name);
		System.out.println("학생 나이 : " + age);
	}

}
