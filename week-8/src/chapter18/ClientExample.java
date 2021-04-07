package chapter18;

import java.io.*;
import java.net.*;

public class ClientExample {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket= new Socket();
			System.out.println("[연결 요청] ");
			socket.connect(new InetSocketAddress("localhost",5001));
			System.out.println("[연결 성공]");
			
			byte[] bytes = null; //보낼 데이터 배열로 생성
			String message = null;
			
			OutputStream os = socket.getOutputStream();
			message = "Hello Server";       
			bytes = message.getBytes("UTF-8"); //문자열 인코딩.
			os.write(bytes);
			os.flush();
			System.out.println(" [데이터 보내기 성공!] ");
			
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			message = new String(bytes,0,readByteCount,"UTF-8");
			System.out.println("[데이터 받기 성공!] " + message);
			
			os.close();
			is.close();
			
		}catch(Exception e) {}
		
		if(!socket.isClosed()) {            //연결이 되어있을경우
		try{
			socket.close();
		}catch(IOException e1) {}
		}
	}

}
