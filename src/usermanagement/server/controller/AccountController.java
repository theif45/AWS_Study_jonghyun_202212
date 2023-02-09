package usermanagement.server.controller;

import java.util.Map;

import usermanagement.dto.ResponseDto;
import usermanagement.entity.User;
import usermanagement.service.UserService;

public class AccountController {

	private static AccountController instance;
	private UserService userService;
	
	private AccountController() {
		userService = UserService.getInstance();
	}
	
	public static AccountController getInstance() {
		// 각 스레드를 사용하고 있기 때문에 여러 명이 접근 가능함
		// 한 명이 사용하고 있으면 다른 사람이 사용하지 못하게 동기화를 함
			if(instance == null) {
				instance = new AccountController();
		}
		return instance;
	}
	
	public ResponseDto<?> register(String userJson) {
		
		Map<String, String> resultMap = userService.register(userJson);
		
		if(resultMap.containsKey("error")) {
			return new ResponseDto<String>("error", resultMap.get("error"));
		}
		
		return new ResponseDto<String>("ok", resultMap.get("ok"));
	}
	

}
