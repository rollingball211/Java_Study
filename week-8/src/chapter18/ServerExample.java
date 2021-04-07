package chapter18;

import java.io.*;
import java.net.*;

public class ServerExample {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
		serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("localhost",5001)); //serversocket 실행
		while(true) {
			System.out.println("[연결 기다림]");
			Socket socket = serverSocket.accept(); //클라이언트 연결 수락
			InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
			System.out.println("[연결 수락함]" + isa.getHostName());
			
			byte[] bytes = null; //보낼 데이터 배열로 생성
			String message = null;
			
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			message = new String(bytes,0,readByteCount,"UTF-8");
			System.out.println("[데이터 받기 성공!] " + message);
			
			OutputStream os = socket.getOutputStream();
			message = "Hello Client";       
			bytes = message.getBytes("UTF-8"); //문자열 인코딩.
			os.write(bytes);
			os.flush();
			System.out.println(" [데이터 보내기 성공!] ");
			
			is.close();
			os.close();
			socket.close();
			}
		}catch(Exception e) {}
		if(!serverSocket.isClosed()) {  //안닫혀있으면
			try {
				serverSocket.close(); //닫음
			}catch(IOException e1) {}
		}
	}

}
