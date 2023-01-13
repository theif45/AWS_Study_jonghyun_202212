package j19_컬렉션;

import java.util.ArrayList;

public class ListStringMain {

	public static void main(String[] args) {

		String[] strArray = new String[] { "java", "python", "C++" };

		String[] newStrArray = new String[strArray.length + 1];

		for (int i = 0; i < strArray.length; i++) {
			newStrArray[i] = strArray[i];
		}
		newStrArray[strArray.length] = "html";

		System.out.println("[strArray]");
		for (String str : strArray) {
			System.out.println(str);
		}
		System.out.println();

		System.out.println("[newStrArray]");
		for (String str : newStrArray) {
			System.out.println(str);
		}
		System.out.println();
		/////////////////////////////////////////////////////
//		List는 유동적으로 인덱스 정리까지 해줌
//		자료구조와 알고리즘
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("java"); // 추가
		strList.add("python");
		strList.add("python");
		strList.remove("java"); // 삭제
		strList.add(1 , "java");// 몇번 인덱스에 뒤의 내용을 집어넣음
		strList.remove(1);
		
//		위와 동일 하지만 잘 사용하지 않음
//		ArrayList<?> strList = new ArrayList<>();
//		((ArrayList<String>)strList).add("java");
//		strList.add("python");
		
		for (int i = 0; i < strList.size(); i++) {
			System.out.print("[" + i + "] : ");
			System.out.println(strList.get(i));
		}
		
		for (String str : strList) {
			System.out.println(str);
		}
		
	}
}
