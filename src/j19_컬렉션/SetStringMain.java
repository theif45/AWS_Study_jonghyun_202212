package j19_컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetStringMain {

	public static void main(String[] args) {
//		Hash값을 가지고 정렬한것이라 순서가 뒤죽박죽임
		Set<String> setStr = new HashSet<>();
		List<String> listStr = new ArrayList<>();
		
		listStr.add("임나영");
		listStr.add("이강용");
		listStr.add("임나영");
		listStr.add("임나영");
		
		System.out.println(listStr);
		
		
//		중복이 되지 않아 같은 값을 아무리 추가해도 하나로 나옴
		setStr.add("김상현");
		setStr.add("강대협");
		setStr.add("손지호");
		setStr.add("최해혁");
		setStr.add("최해혁");
		setStr.addAll(listStr);
		
		System.out.println(setStr);
		String searchName = "손지호";
		
		// get이 없기 때문에 값을 직접 비교
		for (String name : setStr) {
			if(name.equals(searchName)) {
			System.out.println(name);
			}
		}
		
//		람다식을 모르면 map에서 반복을 돌릴수 있는 방법은 iterator밖에 없음
		Iterator<String> iterator = setStr.iterator();
		while(iterator.hasNext()) {
			String n = iterator.next();
			if(n.equals(searchName)) {
				System.out.println(n);
			}
		}
	}
}
