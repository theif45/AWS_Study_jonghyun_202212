package j12_배열.di;

public class Main {

	public static void main(String[] args) {
		Test_C tc = new Test_C();
		Test_C tc2 = new Test_C();

		Test_B tb = new Test_B(tc2);
//		Dependency injection
//		객체 주입은 외부에서 일어나야 함
		Test_A ta = new Test_A(tb);

//		ta.setTb(tb); // 기존 것에서 다른 부품으로 갈아 끼울 때

		ta.testA1();
		ta.testA2();

	}

}
