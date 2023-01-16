package j19_컬렉션;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MapStringMain {

	public static void main(String[] args) {
//		Map에는 Entry가 들어감
//		Entry는 key와 value를 가짐
		Map<String, String> strMap = new HashMap<>();

		strMap.put("이종현", "a");
		strMap.put("진채희", "b");
		strMap.put("김재영", "c");
		strMap.put("이상현", "d");

		System.out.println(strMap);

		System.out.println(strMap.get("a"));
		System.out.println(strMap.get("e"));

//		keySet은 key값을 set으로 뽑아낼 수 있음
//		뽑아낸 key값을 가지고 반복을 돌림
		for (String k : strMap.keySet()) {
			System.out.println("key : " + k);
			System.out.println(strMap.get(k));
		}
//		값은 key의 Hashcode값의 정렬에 따라 순서가 바꿔서 나올수 있음
		for (String v : strMap.values()) {
			System.out.println("value: " + v);
		}
		
		Set<Entry<String, String>> s = null;
		
		for (Entry<String, String> entry : strMap.entrySet()) {
			System.out.println(entry);
			System.out.println("key : " + entry.getKey());
			System.out.println("value : " + entry.getValue());
		}
		
		System.out.println("===================람다식====================");
		strMap.forEach((k, v) -> {
			System.out.println("key : " + k);
			System.out.println("value : " + v);
		});
	}
}
