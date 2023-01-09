package j09_클래스;

public class J09_StudentMain {

	public static void main(String[] args) {

		J09_Student s1 = new J09_Student(); // J09_Student 클래스를 객체라고 표현, new J09_Student()를 생성하는 생성자를 통해 주소값을 입력하면
											// 인스턴스라고 표현
		J09_Student s2 = new J09_Student();

		System.out.println();

		s1.name = "김준일";
		s1.age = 30;

		s1.printInfo();

		s2.printInfo();

//		J09_Student student1 = new J09_Student(); // 생성자는 클래스명과 일치
//		J09_Student student2 = new J09_Student();
//		
//		System.out.println(student1);
//		System.out.println(student2);

	}
}
