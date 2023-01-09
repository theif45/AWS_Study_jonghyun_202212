package j04_연산자;

public class Operation1 {

	public static void main(String[] args) {
		int add = 1 + 2;
		int sub = 10 - 5;
		int mul = 10 * 2;
		int div = 10 / 4; // 실수형으로 나누면 소수점까지 나옴
		int remainder = 10 % 5; // 나머지가 0인 것은 뒤 수의 배수임

		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(remainder);

		System.out.println(remainder == 0 ? "5의 배수이다" : "5의 배수가 아니다");

	}

}
