package j12_배열.di;

public class Test_A {
//	setter를 통해 바뀌면 안될때는 final을 넣어서 상수로 만듬
	private Test_B tb;

//	생성자를 매개변수로 주는 방법
//	required args constructor
	public Test_A(Test_B tb) {
		this.tb = tb; // 의존성이 높음, 결합도가 높다
	}

////	Set을 이용해서 주는 방법
//	public void setTb(Test_B tb) {
//		this.tb = tb;
//	}

	public void testA1() {
		System.out.println("테스트A1 메소드 호출!!");
//		Test_B tb = new Test_B();

		tb.testB1();
	}

	public void testA2() {
		System.out.println("테스트A2 메소드 호출!!");
//		Test_B tb = new Test_B();

		tb.testB1();
	}
}
