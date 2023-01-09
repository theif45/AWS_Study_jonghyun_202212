package j01_출력;

public class Output1 {

	public static void main(String[] args) {
		System.out.print("이름 : "); // 글자는 무조건 큰 따옴표 안에 적음
		System.out.println("이종현");
		System.out.print("나이 : ");
		System.out.println("31" + 1);// 문자열에 아무거나 더할 시 문자로 취급, 숫자로 더하면 연산 과정
		System.out.println("이름 : " + "이종현");

	}

}
