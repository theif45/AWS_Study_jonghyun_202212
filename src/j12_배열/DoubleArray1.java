package j12_배열;

public class DoubleArray1 {

	public static void main(String[] args) {
		int num = 0;

		int[] nums = new int[2]; // int를 담을 수 있는 배열

		int[][] d_nums = new int[3][2]; // int 배열을 담을 수 있는 배열 // 뒤가 더 하위 //2개짜리 배열이 3개로 묶인 것

		d_nums[0][0] = 1;
		d_nums[0][1] = 4;

		d_nums[1][0] = 2;
		d_nums[1][1] = 5;

		d_nums[2][0] = 3;
		d_nums[2][1] = 6;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(d_nums[j][i]);

			}
		}

		int[][] d_nums2 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(d_nums2[i][j]);

			}
		}

		System.out.println(d_nums2.length);
		System.out.println(d_nums2[0].length); // 배열의 크기가 같을 경우

		int[][] d_nums3 = new int[][] { { 1, 2, 3 }, { 5, 6 } };

		for (int i = 0; i < d_nums3.length; i++) {
			for (int j = 0; j < d_nums3[i].length; j++) {
				System.out.println(d_nums3[i][j]);
			}
		}
	}

}
