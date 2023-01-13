package j18_제네릭;

public class Main2 {

//	멤버 메소드는 생성해야지만 즉 객체 생성을 해야지 호출 가능
//	extends 뒤의 자료형을 상속받은 경우만 와일드카드로 허용 
//	super 뒤의 자료형과 상속하는 클래스만 와일드카드로 허용 
	/*
	 * 예시
	 * Person을 상속받은 Student, Teacher
	 * <? extends Person> Person포함 하위 객체인 Student, Teacher가능
	 * <? super Student> Student포함 상위 객체인 Person 가능
	 */
	/*
	 * ? 와일드카드 제약
	 * extends	대상 객체 하위
	 * super	대상 객체 상위
	 */
	public CMRespDto<?> reponse(CMRespDto<?> cmRespDto) {
		System.out.println("[응답데이터]");
		System.out.println(cmRespDto);
		return cmRespDto;
	}
	
//	<?> 와일드카드 : 어디에든 가져갈 수 있음, Object로 형변환 되었다고 생각
	
	public static void main(String[] args) {
		Main2 main = new Main2();
		CMRespDto<String> hello =
				new CMRespDto<String>(200, "성공", "안녕하세요");
		
		CMRespDto<Integer> score = 
				new CMRespDto<Integer>(200, "성공", 85);
		
		System.out.println("hello");
//		Object로 형변환 되었다고 생각함 왜냐하면 <?>로 정의되어 있어 모호하기 때문
		System.out.println(main.reponse(hello));
		
		System.out.println("score");
		System.out.println(main.reponse(score));
//		안녕하세요
	}
}
