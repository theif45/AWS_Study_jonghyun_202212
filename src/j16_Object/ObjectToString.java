package j16_Object;

public class ObjectToString {

	public static void main(String[] args) {

//		Object obj = new Object();
//		System.out.println(obj);
//		String str = obj.toString(); // String으로 return해서 String에 대입 가능
//		System.out.println(str);

		Student student1 = new Student("조병철", 34);
		Student student2 = new Student("김동민", 28);
		Student student3 = new Student("김두영", 28);
		Student student4 = new Student("강의진", 29);

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);

		System.out.println();

		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		System.out.println(student4.toString());

	}
}
