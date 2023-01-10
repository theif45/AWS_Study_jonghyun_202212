package j15_인터페이스;

// 인터페이스 내부는 모두 abstract 메소드임
// 멤버 변수는 가질 수 없지만 상수는 가질 수 있음
public interface Calculator {

//	인터페이스는 상수 생성 시 final 생략가능
	public int ERROR = -9999999;

	public double plus(double x, double y);

	public double minus(double x, double y);

//	default를 사용하면 일반 메소드를 사용가능
	public default double multiplication(double x, double y) {
		return x * y;
	}

	public double division(double x, double y);
}
