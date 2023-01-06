package j09_클래스;

public class J09_Student { 

	String name = "김";
	int age = 100;
	
	// 기본생성자
	J09_Student() {
		// 기본적으로 생략되어 있음
		// 반환 자료형을 우리가 정의할 필요없이 주소값을 리턴하는 자료형
		System.out.println("생성됨!!!");
	}
	
	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
