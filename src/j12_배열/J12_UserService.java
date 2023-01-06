package j12_배열;

import java.util.Scanner;

// 비즈니스 로직 //기능을 가지고 있는 클래스
public class J12_UserService {

	private Scanner scanner;

//	결합도가 낮은 코드
//	public J12_UserService(Scanner scanner) {
//		this.scanner = scanner;// 변수에서 바로 선언하게되게 하면 컴파일 시 자동으로 생성되게 때문(사용하지 않았을 경우 메모리 소모)
//	}

	// 결합도가 높은 코드
	public J12_UserService() {
		scanner = new Scanner(System.in); // 생성되었을 때 선언
	}

	public void run() {
		boolean loopFlag = true;
		char select = '\0';

		while (loopFlag) {
			showMainMenu();
			select = inputSelect("메인 ");
			loopFlag = mainMenu(select);
		}

	}

	public void stop() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
				System.out.println("프로그램 종료중...(" + (i + 1) + "/10)");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("프로그램 종료");
	}

	private char inputSelect(String menuName) {
		System.out.print(menuName + "메뉴 선택 : ");
		char select = scanner.next().charAt(0);
		scanner.nextLine();
		return select;
	}

	private void showMainMenu() {
		System.out.println("========<< 메인메뉴 >>========");
		System.out.println("1. 회원 전체 조회");
		System.out.println("2. 회원 등록");
		System.out.println("3. 사용자 이름으로 회원 조회");
		System.out.println("4. 회원 정보 수정");
		System.out.println("==============================");
		System.out.println("q. 프로그램 종료");
		System.out.println();
	}

	private boolean mainMenu(char select) {
		boolean flag = true;

		if (isExit(select)) {
			flag = false;

		} else {
			if (select == '1') {

			} else if (select == '2') {

			} else if (select == '3') {

			} else if (select == '4') {

			} else {
				System.out.println(getSelectedErrorMessage());
			}
		}
		System.out.println();

		return flag;
	}

	// 리팩토링 기법
	private boolean isExit(char select) {
		return select == 'q' || select == 'Q';
	}

	// 후에 잘못된 부분 수정을 위해 return함
	private String getSelectedErrorMessage() {
		return "###<< 잘못된 입력입니다. 다시 입력하세요. >>###";
	}

}
