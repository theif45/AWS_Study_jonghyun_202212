package j07_반복;

import java.util.Iterator;

public class Continue {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0) {
				continue; // 다음 반복을 계속 진행시킴, 반복문으로 다시 돌아감
			}
			
			System.out.println("i : " + i);
		}
		
		int i = 0;
		
		while (i < 10) {
			if (i % 2 != 0) {
				i++;
				continue;
			}
			
			System.out.println("i : " + i);
			i++;
		}
	}

}
