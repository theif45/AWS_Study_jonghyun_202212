package j17_스태틱.싱글톤;

public class KIA {

//	유일한 객체를 만들며 어디서든 사용 가능
	private static KIA instance = null;

	private KIA() {
	}

	// 생성자가 private이라서 외부에서 생성 불가 // 싱글톤 만드는 형식
	public static KIA getInstance() {
		if (instance == null) { // 처음 호출 시 생성 후 그 후로는 생성하지 않음
			instance = new KIA();
		}
		return instance;
	}
//	

	public void printCompanyName() {
		System.out.println(getClass().getSimpleName());
	}

}
