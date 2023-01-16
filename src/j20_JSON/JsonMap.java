package j20_JSON;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import j20_JSON.builder.User;

public class JsonMap {

	public static void main(String[] args) {
//		JSON형태로 변환하는 과정
//		Gson과 GsonBuider 클래스가 따로 있어서 생성함
		Gson gson = new Gson();
//		setPrettyPrinting()은 JSON 형식으로 이쁘게 정리해놓는 것
//		serializeNulls()는 null값도 표시하도록 함
//		create()는 생성하는것
		gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();

//		Map을 JSON으로 변환함
		Map<String, Object> user = new HashMap<>();
		user.put("username", "aaa");
		user.put("password", "1234");
		user.put("name", null);

		String userJson = gson.toJson(user);
		System.out.println(user);
		System.out.println(userJson);

//		JSON을 Map(Object)으로 변환함
		Map<String, Object> userMap = gson.fromJson(userJson, Map.class);
//		JSON을 User(Object)로 변환
		User userObj = gson.fromJson(userJson, User.class);

		System.out.println(userMap);
		System.out.println(userObj);

//		그 자체로 JSON형식임
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("test1", "aaa");
		jsonObject.addProperty("test2", "bbb");
		jsonObject.addProperty("test3", "ccc");

		String jsonObjcetStr = jsonObject.toString();
		System.out.println(jsonObjcetStr);

	}
}
