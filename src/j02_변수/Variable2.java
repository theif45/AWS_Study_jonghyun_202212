package j02_변수;

public class Variable2 {

	public static void main(String[] args) {
		char firstName1 = '가';
		char firstName2 = '일';
		
		char alphabetA = 'A';
		
		long l = 1L;
		float f = 1.0F;
		
		System.out.println(l + f);
		
		System.out.println("김" + firstName1 + firstName2);
		System.out.println("알파벳A : " + alphabetA);
		
		System.out.println(alphabetA + 'B'); // 연산자는 숫자로 표현되기 때문에 문자열을 더하면 숫자로 표현됨
		System.out.println(alphabetA);
		System.out.println("\uAC00");
		System.out.println(firstName1 + 0);
	}

}
