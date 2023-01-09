package j07_반복;

public class Loop1 {

	public static void main(String[] args) {

//		for (int i = 0; i < 10; i++) { // for (초기문; 조건; 변화)
//			for (int j = 0; j < 10; j++) {
//				System.out.println(j);
//			}
//		}
		int total = 0;

		for (int i = 0; i < 100; i++) {
//			total = total + i + 1;
			total += (i + 1);
		}

		System.out.println("총합 : " + total);

	}

}
