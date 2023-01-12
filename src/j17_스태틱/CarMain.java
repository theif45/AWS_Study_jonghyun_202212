package j17_스태틱;

public class CarMain {

	public static void main(String[] args) {
		Car[] cars = new Car[10];

		cars[0] = new Car("레이");
		cars[1] = new Car("스팅어");
		cars[2] = new Car("쏘렌토");
		cars[3] = new Car("스포티지");
		cars[4] = new Car("모닝");
		cars[5] = new Car("K3");
		cars[6] = new Car("K5");
		cars[7] = new Car("K7");
		cars[8] = new Car("모하비");
		cars[9] = new Car("카니발");

		for (Car car : cars) {
			System.out.println(car);
		}
	}
}
