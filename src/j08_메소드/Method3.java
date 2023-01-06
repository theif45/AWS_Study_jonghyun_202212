package j08_메소드;

public class Method3 {
	
//	메소드의 오버로딩(오버로드) : 호출할(부를) 때 달라지는 것
	public static void ov1() {
		System.out.println("매개변수 없음");
	}
	
	public static void ov1(int a) {
		System.out.println("int 매개변수 하나");
	}
	
//	오버로딩은 무조건 매개변수에 따라 달라짐
//	public static int ov1(int a) {
//		System.out.println("int 매개변수 하나");
//		return a;
//	}
	
	public static void ov1(int a, String b) {
		System.out.println("int 먼저 그다음 String");
	}
	
	public static void ov1(String a, int b) {
		System.out.println("String 먼저 그다음 int");
	}
	
	public static void main(String[] args) {
		ov1();
		ov1(10);
		
	}

}
