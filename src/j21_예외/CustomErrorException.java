package j21_예외;

// 내가 예외 생성 시 RuntimeException을 상속받음
public class CustomErrorException extends RuntimeException {

	public CustomErrorException() {
		System.out.println("내가 만든 예외 생성");
	}
	
	public CustomErrorException(String message) {
//		Throwable가 최상위이므로 최상위로 전달하여 메세지 출력
		super(message);
	}
}
