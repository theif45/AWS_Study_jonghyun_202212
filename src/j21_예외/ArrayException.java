package j21_예외;

public class ArrayException {

	public static void main(String[] args) {

		Integer[] nums = { 1, 2, 3, 4, 5 };

		try {
			throw new NullPointerException(); // 강제로 예외를 발생시킴
//			for (int i = 0; i < 6; i++) {
//				System.out.println(nums[i]);
//			}
		} catch(IndexOutOfBoundsException e){ // 다른 예외 처리 불가
			System.out.println("예외 처리함");
		}  catch(NullPointerException e){ // 다른 예외 처리 불가
			System.out.println("빈값 처리함");
		} catch(Exception e) { // 위에서 부터 타고 내려와 Exception이 제일 마지막에 위치
			System.out.println("예상 못한 예외 처리함");
		}
		
		
		System.out.println("프로그램 정상 종료");
	}
}
