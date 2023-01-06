package j08_메소드;

public class Method1 {
	
//	매개변수 : x, 반환 : x
//	매개변수가 입력
//	void는 공허함을 뜻하며, 값을 반환하지 않음
//	호이스팅 : 위에서 아래로 코드를 먼저 분석하여 정의를 먼저 하고 그 뒤에 실행해서 위, 아래 둘다 작성 가능
	public static void method1() {
		System.out.println("단순 실행");
		System.out.println();
	}
	
//	매개변수 : int 하나 입력, 반환 : x
	public static void method2(int num) {
		System.out.println("num : " + num);
		System.out.println();
	}
	
//	매개변수 : int 두개 입력, 반환 : x
	public static void method3(int num, int num2) {
		System.out.println("num : " + num);
		System.out.println("num2 : " + num2);
		System.out.println();
	}
	
	public static String method4() {
		return "데이터 반환"; // 반환은 여러개의 값을 할 수 없고 무조건 하나만 가능
	}
	
	public static String method5(int age) { // 독립된 공간으로 변수 ageStr을 main에서도 사용 가능
		String ageStr = age + "살";
		return ageStr;
	}
	
	public static void main(String[] args) {
		String ageStr = "30살";
		
		method1();// 함수 호출
		method2(100);
		method3(200,300);
		
		System.out.println(method4());
		System.out.println();
		
		String data1 = method4();
		System.out.println(data1);
		System.out.println();
		
		System.out.println(method5(30));
		System.out.println();
		
	}

}
