package j16_Object;

public class ObjectHashCode {

	public static void main(String[] args) {
		
		Student s1 = new Student("김수현", 31);
		Student s2 = new Student("김수현", 31);
		SubStudent s3 = new SubStudent("김수현", 31);
		
		System.out.println(s1.hashCode()); // 기본 생성 시 hashCode() 주소값을 나타냄
		System.out.println(s2.hashCode());
		
		System.out.println(s1.hashCode() == s2.hashCode());
		System.out.println(s1.hashCode() == s3.hashCode()); // 객체가 달라도 hashCode값이 같으면 true로 성립
	}
}
