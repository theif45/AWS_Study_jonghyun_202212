package j21_예외;

import java.util.Arrays;
import java.util.List;

public class ThrowsException {
//	일반 예외로 반드시 체크해줘야해서 throws Exception로 넘겨주고 try ~ catch문으로 체크함
	public static void printList(List<String> list, int size) throws Exception {

		for (int i = 0; i < size; i++) {
			System.out.println("[" + i + "]" + list.get(i));
		}
		System.out.println();
	}

	public static void main(String[] args) {
		String[] names = { "김수현", "이종현", "박성진", "김동민" };

		try {
			printList(Arrays.asList(names), 5);
		} catch (Exception e) {
//			지금 발생한 예외가 어떤 예외인지 알려줌
//			e.printStackTrace();
			
//			Exception 대신 하위 예외를 잡을 경우에 사용
//			예상치 못한 에러가 발생할 경우 실행
//			무조건 실행하기 때문에 저장하는 작업을 넣어줌
		} finally {
			System.out.println("무조건 실행");
		}

		System.out.println("프로그램 정상 종료");
	}
}
