package usermanagement.server.controller;

import usermanagement.dto.ResponseDto;
import usermanagement.entity.User;

public class AccountController {

	private static AccountController instance;
	
	private AccountController() {}
	
	public static AccountController getInstance() {
		// 각 스레드를 사용하고 있기 때문에 여러 명이 접근 가능함
		// 한 명이 사용하고 있으면 다른 사람이 사용하지 못하게 동기화를 함
			if(instance == null) {
				instance = new AccountController();
		}
		return instance;
	}
	
	public ResponseDto<?> register(User user) {
		
		return new ResponseDto<String>("ok", "회원가입 성공");
	}
	

}
