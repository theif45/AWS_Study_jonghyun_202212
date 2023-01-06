package j04_연산자;

public class Operation2 {
	
	public static void main(String[] args) {
		int num = 10;
		
		num = num + 1;
		
		System.out.println(num);
		System.out.println(++num);// 선증가는 1 + num으로 더해진 후 출력
		System.out.println(num++);// 후증가는 num + 1으로 num이 출력된 후 더해짐
		System.out.println(num++);
		System.out.println(num);
		
		
	}

}
