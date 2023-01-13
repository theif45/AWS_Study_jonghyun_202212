package j18_제네릭;

import j17_스태틱.싱글톤.C;

public class Main {

	public static void main(String[] args) {

//		?는 생성 시 자동으로 자료형을 가져옴
//		가능한 자료형을 명시하는 것이 좋음 
//		TestData<?, ?> td = new TestData<>("김준일", 30);
		
		TestData<String, Integer> td = new TestData<String, Integer>("김준일", 30);
		TestData<String, Double> td2 = new TestData<String, Double>("junil", 100.05); // 생성될 때 타입 결정
		System.out.println(td);
		System.out.println(td2);

//		generic 안에 generic 타입의 자료형을 가져올 수 있음
//		data에 td의 자료형인 TestData<String, Integer>를 넣음
		CMRespDto<TestData<String, Integer>> cm =
				new CMRespDto<TestData<String, Integer>>(200, "성공", td);
		
//		td의 자료형을 자동으로 가져옴
//		CMRespDto<TestData<?, ?>> cm =
//				new CMRespDto<TestData<?, ?>>(200, "성공", td);
//		CMRespDto<?> cm =
//				new CMRespDto<>(200, "성공", td);
		
		System.out.println(cm);
		
	}
}
