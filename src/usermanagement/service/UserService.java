package usermanagement.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.mindrot.jbcrypt.BCrypt;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import usermanagement.entity.User;
import usermanagement.repository.UserRepository;

public class UserService {

	private UserRepository userRepository;
	private Gson gson;
	
	private static UserService instance;
	
	public static UserService getInstance() {
		if(instance == null) {
			instance = new UserService();
		}
		return instance;
	}
	
	private UserService() {
		userRepository = UserRepository.getInstance();
		gson = new GsonBuilder().setPrettyPrinting().create();
	}
	
	public Map<String, String> login(String userJson){
		
		Map<String, String> response = new HashMap<>();
		Map<String, String> userMap = gson.fromJson(userJson, Map.class);
		for(Entry<String, String> userEntry : userMap.entrySet()) {
			if(userEntry.getValue().isBlank()) {
				response.put("error", userEntry.getKey() + "은(는) 공백일 수 없습니다.");
				return response;
			}
		}
		
		User user = gson.fromJson(userJson, User.class);
		
		System.out.println("로그인 요청!!");
		
		if(!(duplicatedUsername(user.getUsername()))) {
			response.put("error", "사용자 정보가 잘못되었습니다.");
			return response;
		}
		
		if(!(duplicatedPassword(user.getPassword()))) {
			response.put("error", "사용자 정보가 잘못되었습니다.");
			return response;
		}
		
		response.put("ok", "로그인 성공.");
		System.out.println();
		return response;
		
	}
	
	public Map<String, String> register(String userJson) {
//		reponse : 응답
		Map<String, String> response = new HashMap<>();
//		반복 작업을 하기 위해서 Map형태로 변환
		Map<String, String> userMap = gson.fromJson(userJson, Map.class);
		for(Entry<String, String> userEntry : userMap.entrySet()) {
//			isBlank는 스페이스를 공백으로 봄
			if(userEntry.getValue().isBlank()) {
				response.put("error", userEntry.getKey() + "은(는) 공백일 수 없습니다.");
				return response;
			}
		}
		
		User user = gson.fromJson(userJson, User.class);
		System.out.println("서비스에 넘어옴! User 객체로 변환");
		System.out.println(user);
		
		if(duplicatedUsername(user.getUsername())) {
			response.put("error", "이미 사용중인 사용자 이름입니다.");
			return response;
		}
		
		if(duplicatedEmail(user.getEmail())) {
			response.put("error", "이미 사용중인 이메일입니다.");
			return response;
		}
		
//		password를 암호화한 것을 pw에 대입
//		String pw = BCrypt.hashpw("1234", BCrypt.gensalt());
//		System.out.println(pw);
//		System.out.println(BCrypt.checkpw("1234", pw));
		
		user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt()));
		System.out.println("암호화 후");
		System.out.println(user);
		
		userRepository.saveUser(user);
		
		response.put("ok", "회원가입 성공.");
		
		return response;
	}
	
	private boolean duplicatedUsername(String username) {
		return userRepository.findUserByUsername(username) != null;
	}
	
	private boolean duplicatedEmail(String email) {
		return userRepository.findUserByEmail(email) != null;
	}
	
	private boolean duplicatedPassword(String password) {
		return userRepository.findUserByPassword(password) != null;
	}
	
}
