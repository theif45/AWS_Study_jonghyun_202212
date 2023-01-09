package j05_입력;

import java.util.Scanner;

public class Input3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String name = null;
		int age = 0;
		String address = null;
		String phone = null;

		System.out.print("이름 : ");
		name = scanner.next();

		System.out.print("나이 : ");
		age = scanner.nextInt();

		scanner.nextLine(); // 버퍼에 남아있는 엔터를 처리해주기 위하여 nextLine()을 한번 더 적어 주어 엔터를 허공에 날림

		System.out.print("주소 : ");
		address = scanner.nextLine();

		System.out.print("연락처 : ");
		phone = scanner.next();

		System.out.println("사용자의 이름은 " + name + "이고 나이는 " + age + "살입니다.");
		System.out.println("주소는 " + address + "에 거주중입니다.");
		System.out.println("연락처는 " + phone + " 입니다.");

	}

}
