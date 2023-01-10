package j15_인터페이스;

public class Main {

	public static void main(String[] args) {
		Equipment[] equipments = new Equipment[2];

		equipments[0] = new GeneralCalculator();
		equipments[1] = new SmartPhone();

		Calculator calculator = new Computer();

		System.out.println("모든 장비 전원 켜기");
		for (Equipment eq : equipments) {
			eq.powerOn();
		}

//		a와 b는 같은 형 변환 과정
//		a는 최종 형 변환 형태인 Calculator를 명시
//		b는 SmartPhone으로 다운 캐스팅하여 명시하고 그 후Calculator로 업캐스팅함

//		a.
//		Equipment eq = equipments[1];
//		Calculator c = (Calculator) eq;

//		b.
//		Equipment eq = equipments[1]; 
//		SmartPhone ca = (SmartPhone) eq;
//		Calculator c = ca;
//		System.out.println("결과 : " + d.plus(20, 20));

		System.out.println("모든 장비에서 10과 20을 더하기");
		for (Equipment eq : equipments) {
			Calculator c = (Calculator) eq; // Equipment가 SmartPhone으로 다운캐스팅 후 Carculator로 업캐스팅하는 과정을 최종역인 Calculator로
											// 명시하여 나타냄
			double result = c.plus(10, 20);
			System.out.println("결과 : " + result);
		}

		System.out.println();

		System.out.println("모든 장비에서 0과 10을 나누기");
		for (Equipment eq : equipments) { // equipment 활성화, calculator 비활성화
			Calculator c = (Calculator) eq; // calculator 활성화, equipment 비활성화
			double result = c.division(10, 0);
			System.out.println("결과 : " + result);
		}

		System.out.println();

		System.out.println("모든 장비 전원 끄기");
		for (Equipment eq : equipments) {
			eq.powerOff();
		}

		System.out.println();
	}
}
