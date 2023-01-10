package j13_상속;

public class KiaCar extends Car {

	public KiaCar() {
		super(); // super는 상위 객체를 의미함 // 부모 클래스의 생성자를 출력함 // 부모 클래스가 먼저 생성되어야 함
		System.out.println("자식");
	}

//	정의하지 않으면 부모 클래스에 있는 걸 직접적으로 가져옴
	@Override
	public int discountPrice(int percentage) {
		return super.discountPrice(percentage);
	}

}
