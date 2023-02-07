package j25_소켓;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class SocketServer {

	public static final int PORT = 9090;
	
	public static void main(String[] args) {
		// client를 담을 수 있는 list 생성
		List<Socket> clients = new ArrayList<>();
		
		try {
			// PORT를 정해줘야 함
			ServerSocket serverSocket = new ServerSocket(PORT);
			while(true) {
				System.out.println("클라이언트의 접속을 기다리는 중입니다.");
				// client에서 접속을 기다림
				Socket socket = serverSocket.accept();
				// 접속한 client를 list에 추가함
				clients.add(socket);
				System.out.println("클라이언트가 연결되었습니다.");
				System.out.println(clients);
				OutputStream outputStream = socket.getOutputStream();
				// 문자열을 보낼 때 사용, 버퍼 기능 탑재
				PrintWriter out = new PrintWriter(outputStream, true);
				out.println("___서버에 접속한 것을 환영합니다.");
			}
			
			// 인터넷 연결에 대한 오류
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
