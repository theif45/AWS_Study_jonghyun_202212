package j20_JSON.builder;

public class UserMain {

	public static void main(String[] args) {
//		User user = new User();
//		User.UserBuilder userBuilder = new User.UserBuilder();
		
//		내가 원하는 변수값만 바꿀 수 있음
//		User 내부에 UserBuilder 생성 시
		User user2 = User.builder()
				.username("aaa")
				.password("1234")
				.name(null)
				.build();
		
//		외부에 UserBuilder 생성시
//		User user3 = new UserBuilder()
//				.username("bbb")
//				.name(null)
//				.build();
		
		System.out.println(user2);
//		System.out.println(user3);
	}
}
