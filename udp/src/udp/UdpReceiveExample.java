package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiveExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DatagramSocket datagramSocket = new DatagramSocket(5001);//5001번 포트에서 수신하는 Datagram socket 생성
		
		Thread thread = new Thread() {
		
		public void run() {
			System.out.println("[수신 시작!]");
		try {
			while(true) {
				DatagramPacket packet = new DatagramPacket(new byte[100], 100); 
				//첫 번째 매개값=읽은 패킷 데이터를 저장한 바이트 배열
				//두 번째 매개값=읽을수 있는 최대 바이트 수.
				datagramSocket.receive(packet);
				//receive 메소드로 패킷을 읽었다면 getdata 메소드로 데이터가 저장된 바이트 배열을 얻어냄.
				String data = new String(packet.getData(),0,packet.getLength(),"UTF-8");
				//getlength를 이용해 읽은 바이트 수를 얻고 받은 데이터가 인코딩된 문자열이라면, 디코딩해서 문자열 얻음.
				System.out.println("[받은 내용 : "  + packet.getSocketAddress() + "]" + data);
			
			}
		}catch(Exception e){
			System.out.println("[수신 종료!]");
				}
			}
		};
		thread.start();
		
		Thread.sleep(10000);
		datagramSocket.close();
	}

}
