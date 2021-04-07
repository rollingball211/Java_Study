package chapter18;

public class Edit2 {
/*
 
 	TCP NETWORKING
 	연결 지향적 프로토콜
 	클라이언트와 서버가 연결된 상태에서 데이터를 주고받는 프로토콜을 말함
 	클라이언트의 연결 요청을 기다리면서 연결 수락을 담당하는 것이 java.net.ServerSocket
	클라이언트와 통신을 담당하는것이 java.net.Socket클래스이다.
	클라이언트가 연결 요청을 해오면 ServerSocket은 연결을 수락, 통신용 socket을 만듬
	
	ServerSocket serverSokcket = new ServerSocket(5001); 
	5001번 포트에 바인딩함.
	
	Socket으로 부터 input,outputStream 얻는 코드
	
	InputStream is= socket.getInputStream();
	OutputStream os= socket.getOutputStream();
	
	
	UDP NETWORKING
 	비연결 지향적 프로토콜 , 발신자가 일방적으로 데이터를 발신하는 방식.
 	java.net.DatagramSocket , java.net.DatagramSocket 클래스를 제공
 */
}
