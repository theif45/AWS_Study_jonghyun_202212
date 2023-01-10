package j15_인터페이스;

public class Computer implements Calculator {

	@Override
	public double plus(double x, double y) {
		System.out.println("컴퓨터에서 더하기 실행");
		return x + y;
	}

	@Override
	public double minus(double x, double y) {
		System.out.println("컴퓨터에서 빼기 실행");
		return x - y;
	}

	@Override
	public double division(double x, double y) {

		System.out.println("컴퓨터에서 나누기 실행");
		if (x == 0 || y == 0) {
			return ERROR;
		}

		return x / y;
	}
}
