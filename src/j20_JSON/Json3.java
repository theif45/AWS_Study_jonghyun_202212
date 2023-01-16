package j20_JSON;

import com.google.gson.Gson;

public class Json3 {

	public static void main(String[] args) {
//		gson이라는 라이브러리를 사용하고 싶을 경우 gson이라는 객체를 생성
		Gson gson = new Gson();
		
		gson.toJson(null);					// object	->	json
		gson.fromJson("", Object.class);	// json		->	object
	}
}
