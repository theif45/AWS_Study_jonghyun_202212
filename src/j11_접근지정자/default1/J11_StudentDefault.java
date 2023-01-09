package j11_접근지정자.default1;

public class J11_StudentDefault {

//	private를 통해 데이터의 은닉
	private String name;
	private int age;

	public J11_StudentDefault() {

	}

	public J11_StudentDefault(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}

//	Getter // 값을 가지고 오는 것 // get변수명으로 지음
	public String getName() {
		return name;
	}

//	Setter // 값을 대입하여 주는 것 //set변수명으로 지음
	public void setName(String name) {
		this.name = name;
	}

//	${name} //${변수명}은 변수명을 카멜표기법으로 표기한 Getter를 호출

}
