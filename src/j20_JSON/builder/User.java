package j20_JSON.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
// Builder내에 AllArgsConstructor가 포함되어 있음
// Builder 어노테이션 사용하지 않을 시 AllArgsConstructor를 선언해줘야 함
@Builder
// 밑의 주석처리한 부분을 포함하는 어노테이션
// 생성하고자하는 클래스의 AllArgsConstructor가 필요
public class User {

	private String username;
	private String password;
	private String name;
	private String email;

//	생성자는 클래스명에 매개변수를 넣어 만드는데 같은 자료형인 String으로 메소드 오버로딩이 불가능하기 때문에 매개변수 하나씩 넣을 수없음 그래서
//	클래스 내부에 클래스를 만들어 자기가 원하는 매개변수를 넣을 수 있게 각각의 메소드를 만듬
	
	
//	public static UserBuilder builder() {
//		return new UserBuilder();
//	}
//	
//	@Data
////	static으로 붙여주면 User를 생성하지 않아도 사용 가능
//	public static class UserBuilder {
//		private String username;
//		private String password;
//		private String name;
//		private String email;
//		
//		public UserBuilder username(String username) {
//			this.username = username;
//			return this;
//		}
//		
//		public UserBuilder password(String password) {
//			this.password = password;
//			return this;
//		}
//		
//		public UserBuilder name(String name) {
//			this.name = name;
//			return this;
//		}
//		
//		public UserBuilder email(String email) {
//			this.email = email;
//			return this;
//		}
//		
//		public User build() {
//			return new User(username, password, name, email);
//		}
//	}

}
