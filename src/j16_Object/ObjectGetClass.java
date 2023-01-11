package j16_Object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ObjectGetClass {

	public static void main(String[] args) {

		Student student = new Student("김재영", 29);

		System.out.println(student.getClass()); // getClass()를 통해 해당하는 객체의 클래스의 정보를 가져옴
		System.out.println(Student.class); // .class는 해당 클래스의 정보를 가져옴 // getClass()를 통해 명확하게 같은 클래스인지 확인

		System.out.println(student.getClass().getName());

		Class studentClass = student.getClass();

		String className = studentClass.getName(); // 패키지명도 나옴
		System.out.println("클래스 이름 : " + className);

		String simpleName = studentClass.getSimpleName(); // 클래스명만 나옴
		System.out.println("클래스 이름만 : " + simpleName);

//		Declared가 있으면 접근 지정자에 상관없이 다 가져옴
		Field[] fields = studentClass.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}

		System.out.println();

		Method[] methods = studentClass.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}

	}
}
