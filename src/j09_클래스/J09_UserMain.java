package j09_클래스;

public class J09_UserMain {

	public static void main(String[] args) {

		J09_User user = new J09_User();
		J09_User user1 = new J09_User();

		user.username = "aaa";
		user.password = "1234";
		user.name = "김종환";
		user.email = "aaa@gmail.com";

		user1.username = "theif45";
		user1.password = "1234";
		user1.name = "이종현";
		user1.email = "whdgus1414@gmail.com";

		user.printUserInfo();
		user1.printUserInfo();
	}

}
