package j07_반복;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		String name = "김준일";
//		System.out.println(name.charAt(0)); // 문자열중 첫번째 인덱스를 문자형으로 가져옴
		
		boolean loopFlag1 = true;
		
		while(loopFlag1) {
			char select = '\0';
			
			System.out.println("========<< 식당 >>========");
			System.out.println("1. 김밥천국");
			System.out.println("2. 탄탄면");
			System.out.println("3. 홍대개미");
			System.out.println("4. 밥앤밥");
			System.out.println("==========================");
			System.out.println("q. 프로그램 종료");
			System.out.println("==========================");
			
			System.out.print("식당 번호 선택 : ");
			select = scanner.next().charAt(0); // charAt(a)는 a번째 인덱스의 단어를 입력
			
			if (select == 'q' || select == 'Q') {
				loopFlag1 = false;
			} else if (select == '1') {
				boolean loopFlag2 = true;
				
				while (loopFlag2) {
					System.out.println();
					System.out.println("========<< 김밥천국 >>========");
					System.out.println("1. 라면");
					System.out.println("2. 돌솥비빔밥");
					System.out.println("3. 오므라이스");
					System.out.println("4. 김치볶음밥");
					System.out.println("==============================");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("==============================");
					
					System.out.print("메뉴 선택 : ");
					select = scanner.next().charAt(0);
					
					if (select == 'b' || select == 'B') {
						loopFlag2 = false; // 메뉴 영역 종료
					} else if (select == 'q' || select == 'Q') {
						loopFlag1 = false; // 식당, 메뉴 둘 다 종료
						loopFlag2 = false;
					} else if (select == '1') {
						System.out.println();
						System.out.println("라면을 선택했습니다.");
					} else if (select == '2') {
						System.out.println();
						System.out.println("돌솥비빔밥을 선택했습니다.");
					} else if (select == '3') {
						System.out.println();
						System.out.println("오므라이스를 선택했습니다.");
					} else if (select == '4') {
						System.out.println();
						System.out.println("김치볶음밥을 선택했습니다.");
					} else {
						System.out.println();
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
						System.out.println("사용할 수 없는 번호입니다.");
						System.out.println("다시 입력하세요.");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					}
					
					System.out.println();
				}
			} else if (select == '2') {
				boolean loopFlag2 = true;
				
				while (loopFlag2) {
					System.out.println();
					System.out.println("========<< 탄탄면 >>========");
					System.out.println("1. 탄탄면");
					System.out.println("2. 비빔탄탄면");
					System.out.println("3. 마파탄탄면");
					System.out.println("==============================");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("==============================");
					
					System.out.print("메뉴 선택 : ");
					select = scanner.next().charAt(0);
					
					if (select == 'b' || select == 'B') {
						loopFlag2 = false;
					} else if (select == 'q' || select == 'Q') {
						loopFlag1 = false;
						loopFlag2 = false;
					} else if (select == '1') {
						System.out.println();
						System.out.println("탄탄면을 선택했습니다.");
					} else if (select == '2') {
						System.out.println();
						System.out.println("비빔탄탄면을 선택했습니다.");
					} else if (select == '3') {
						System.out.println();
						System.out.println("마파탄탄면를 선택했습니다.");
					} else {
						System.out.println();
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
						System.out.println("사용할 수 없는 번호입니다.");
						System.out.println("다시 입력하세요.");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					}
				}
			} else if (select == '3') {
				boolean loopFlag2 = true;
				
				while (loopFlag2) {
					System.out.println();
					System.out.println("========<< 홍대개미 >>========");
					System.out.println("1. 대창 덮밥");
					System.out.println("2. 스테이크 덮밥");
					System.out.println("3. 연어 덮밥");
					System.out.println("4. 불닭 덮밥");
					System.out.println("==============================");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("==============================");
					
					System.out.print("메뉴 선택 : ");
					select = scanner.next().charAt(0);
					
					if (select == 'b' || select == 'B') {
						loopFlag2 = false;
					} else if (select == 'q' || select == 'Q') {
						loopFlag1 = false;
						loopFlag2 = false;
					} else if (select == '1') {
						System.out.println();
						System.out.println("대창 덮밥을 선택했습니다.");
					} else if (select == '2') {
						System.out.println();
						System.out.println("스테이크 덮밥을 선택했습니다.");
					} else if (select == '3') {
						System.out.println();
						System.out.println("연어 덮밥를 선택했습니다.");
					} else if (select == '4') {
						System.out.println();
						System.out.println("불닭 덮밥을 선택했습니다.");
					} else {
						System.out.println();
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
						System.out.println("사용할 수 없는 번호입니다.");
						System.out.println("다시 입력하세요.");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					}
				}
			} else if (select == '4') {
				boolean loopFlag2 = true;
				
				while (loopFlag2) {
					System.out.println();
					System.out.println("========<< 밥앤밥 >>========");
					System.out.println("1. 소고기미역국");
					System.out.println("2. 제육볶음");
					System.out.println("3. 순두부 찌개");
					System.out.println("4. 순두부 된장찌개");
					System.out.println("==============================");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("==============================");
					
					System.out.print("메뉴 선택 : ");
					select = scanner.next().charAt(0);
					
					if (select == 'b' || select == 'B') {
						loopFlag2 = false;
					} else if (select == 'q' || select == 'Q') {
						loopFlag1 = false;
						loopFlag2 = false;
					} else if (select == '1') {
						System.out.println();
						System.out.println("소고기미역국을 선택했습니다.");
					} else if (select == '2') {
						System.out.println();
						System.out.println("제육볶음을 선택했습니다.");
					} else if (select == '3') {
						System.out.println();
						System.out.println("순두부 찌개를 선택했습니다.");
					} else if (select == '4') {
						System.out.println();
						System.out.println("순두부 된장찌개을 선택했습니다.");
					} else {
						System.out.println();
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
						System.out.println("사용할 수 없는 번호입니다.");
						System.out.println("다시 입력하세요.");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					}
				}
			} else {
				System.out.println();
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				System.out.println("사용할 수 없는 번호입니다.");
				System.out.println("다시 입력하세요.");
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			}
			
			System.out.println();
		}
		
		System.out.println("프로그램 정상 종료!");
		
		
	}

}
