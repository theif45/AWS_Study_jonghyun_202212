package j12_배열;

public class Array6 {

	public static void main(String[] args) {
		String[] names = { "박성진", "조병철", "황창욱" };

		// 값을 하나씩 꺼내는 구조라서 뒤돌아갈수 없음
		for (String name : names) { // for(변수 : 배열이나 리스트)
			System.out.println(name);
			name = "김준일"; // 변수에다 넣은거지 배열에 넣은게 아님
		}

		System.out.println("========<forEach>========");

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			names[i] = "김준일";
		}

		int[] nums = { 1, 2, 3, 4, 5 };

		for (int i : nums) {
			System.out.println("i : " + i);
		}

	}
}
