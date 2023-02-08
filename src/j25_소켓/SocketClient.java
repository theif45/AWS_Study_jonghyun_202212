package j25_소켓;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import com.google.gson.Gson;

import usermanagement.dto.RequestDto;

public class SocketClient {

	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("127.0.0.1",9090);
			System.out.println("서버에 접속 성공!");
			
			// server에서 보낸 것을 받을 수 있음
			InputStream inputStream = socket.getInputStream();
			InputStreamReader streamReader = new InputStreamReader(inputStream);
			// buffer를 사용하지 않으면 하나씩 가져오지만 buffer를 사용하면 buffer에 저장하여 한 덩이를 가져올 수 있음
			BufferedReader reader = new BufferedReader(streamReader);
			// readline은 한 줄씩 읽음
//			System.out.println(reader.readLine());
			
			OutputStream outputStream = socket.getOutputStream();
			PrintWriter printWriter = new PrintWriter(outputStream, true);
			
			Gson gson = new Gson();
			RequestDto<String> dto = new RequestDto<String>("test","테스트 데이터");
			
			printWriter.println(gson.toJson(dto));
			
			// ip를 찾지 못했을 때의 오류
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
