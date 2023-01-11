package j16_Object;

public class ObjectEquals {

	public static void main(String[] args) {

		String name1 = "김준일";
		String name2 = "김준일";
		String name3 = new String("김준일");

		System.out.println(name1);
		System.out.println(name2);

		System.out.println(name1 == name2); // 주소 비교
		System.out.println(name1 == name3);
		System.out.println(name1.equals(name3)); // equals를 통해 안에 들어있는 실제 값을 비교
///////////////////////////////////////////////////////////

		Student s1 = new Student("박은빈", 24);
		Student s2 = new Student("박은빈", 24);
		SubStudent s3 = new SubStudent("박은빈", 24);

		System.out.println(s1.equals(s3)); // s2가 Object로 업캐스팅되고 주소를 비교 // s3는 SubStudent로 다른 객체기 때문에 다운캐스팅 불가
	}
}
