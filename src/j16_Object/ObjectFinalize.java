package j16_Object;

class Test {
	private int num;

	public Test(int num) {
		super();
		this.num = num;
		System.out.println(num + "생성");
	}

//	Garbage collector가 실행되어 소멸되었을 때 실행
//	소멸자 finalize()
	@Override
	protected void finalize() throws Throwable {
		System.out.println(num + "객체 소멸");
	}

}

public class ObjectFinalize {

	public static void main(String[] args) {

		Test test = null;

		for (int i = 0; i < 10; i++) {
//			실행 지연을 해서 system.gc()가 순차적으로 실행되도록 함
//			try { 
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			test = new Test(i);

			test = null;

			System.gc(); // JVM이 여유있을때 실행 // 어떤걸 소멸시킬지 모르기 때문에 주의해서 사용
		}
	}
}
