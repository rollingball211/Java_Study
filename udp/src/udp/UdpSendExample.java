package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UdpSendExample {

	public static void main(String[] args) throws Exception{
		DatagramSocket datagramSocket = new DatagramSocket(); //DataGram Socket 생성
		
		System.out.println("발신 시작.");
		
		for(int i =1;i<3;i++) {
			String data = "메시지" + i ;
			byte [] byteArr = data.getBytes("UTF-8");	//보내고자 하는 데이터를 BYTE배열로 생성, 문자열인 경우 UTF-8로 인코딩해 BYTE배열 얻음
			DatagramPacket packet = new DatagramPacket(byteArr, byteArr.length, new InetSocketAddress("localhost",5001)); 
			//Datagram packet 생성. 첫번째 매개값 보낼 데이터는 byte 배열, 두번째 매개값은 배열에서 보낼 항목 수 , 세번쨰 매개값은 수신자 ip 와 포트정보를 가지고 있는것.
			
			datagramSocket.send(packet); //패킷 전송
			System.out.println("[보낸 바이트 수] " + byteArr.length + "bytes");
			
		}
		System.out.println("발신 종료");
		
		datagramSocket.close();
	}

}
