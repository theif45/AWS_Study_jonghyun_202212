package usermanagement.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class UserManagmentServerApplication implements Runnable{

	private final static int PORT = 9090;
	private ServerSocket serverSocket;
	
	@Override
	public void run() {
		try {
			serverSocket = new ServerSocket(PORT);
			System.out.println("======<< 서버 실행 >>======");
			
			socketConnection();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(serverSocket != null) {
					serverSocket.close();
				}
				
				System.out.println("======<< 서버 종료 >>======");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void socketConnection() throws IOException {
		while(true) {
			// 접속 시 소켓 객체 생성
			Socket socket = serverSocket.accept();
			SocketServer socketServer = new SocketServer(socket);
			// start 하면 socketServer는 thread
			socketServer.start();
		}
	}
	
	public static void main(String[] args) {
		UserManagmentServerApplication application =  new UserManagmentServerApplication();
		application.run();
		
	}
}
