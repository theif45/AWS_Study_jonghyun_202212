package j11_접근지정자;

import j11_접근지정자.default1.J11_StudentDefault; // 다른 패키지의 자료형을 사용하기 위해 import함

public class J11_StudentMain {

	public static void main(String[] args) {

		J11_Student s1 = new J11_Student();

		s1.printInfo();

		J11_StudentDefault s2 = new J11_StudentDefault();

//		s2.name = "김준이";

		// 보호를 위해 직접 접근을 제한하고 메소드를 통해 데이터를 가져와야함
//		System.out.println("이름 : " + s2.name);
		System.out.println("이름 : " + s2.getName());
	}

}
