package j22_익명클래스;

public class Main {

	public static void main(String[] args) {
		
		Calculator c1 = new Addition();
		System.err.println(c1.calc(10, 20));
		
////////////////////////////////////////////////////////
		
//		임시적으로 구현된 객체이며 클래스 파일로 저장 되어 있지 않음
//		클래스 이름이 없어서 익명 클래스라고 함
//		다른 곳에서 사용 불가
//		딱 한번만 생성 가능
//		한번만 사용하는 경우는 클래스로 만들 필요가 없기 때문에 익명 클래스로 사용
//		추상클래스도 가능
		Calculator c2 = new Calculator() {

			@Override
			public int calc(int x, int y) {
				return x - y;
			}
		}; 
		
		System.out.println(c2.calc(200, 100));
		
		Calculator c3 = (x, y) -> x * y;
		System.out.println(c3.calc(20, 3));
	}
	
}
