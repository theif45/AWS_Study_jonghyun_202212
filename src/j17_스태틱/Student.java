package j17_스태틱;

public class Student {
	
	private static final int CODE = 20230000;
	private static int ai = 1; // auto_increment
	
	private int studentCode;
	private String name;
	
	public Student(String name) {
		studentCode = CODE + ai;
		ai++;
		this.name = name;
	}

//	호출하지 않아도 사용가능한 static메소드에 생성해야지만 사용가능한 변수가 있기 때문에 에러가 일어남
//	static 메소드 안에서는 static 멤버 변수와 지역 변수만 가능
	public static int getAutoIncrement() {
		System.out.println("현재 AI : " + ai);
//		System.out.println("학생이름 : " + name); // name은 static 변수가 아니라 불가
		return ai;
	}
	
	@Override
	public String toString() {
		return "Student [studentCode=" + studentCode + ", name=" + name + "]";
	}
	
}
