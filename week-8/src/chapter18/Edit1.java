package chapter18;

public class Edit1 {
	/*
	 자바에서 데이터는 스트림을 통해 입출력됨.
	 스트림은 단일 방향으로 연속적으로 흘러가는 것을 말함.
	 데이터를 입력받을 떄 =>InputStream (키보드,파일,네트워크상의 프로그램..)
	 프로그램이 데이터를 보낼 떄 =>OutputStream (모니터,파일.네트워크상의 프로그램)
	 
	 스트림 클래스
	 1.byteStream
	 	Input&OutputStream
	 	
	 2.문자기반 스트림
	 	Reader
	 	Writer
	 	
	 보조 스트림
	 다른 스트림과 연결되어 여러 가지 편리한 기능을 제공해주는 스트림을 말함
	자체적으로 입출력을 수행할수 없기때문에 입/출력 소스와 바로 연결되는 스트림들에 연결되어 입출력 수행
	문자변환,객체 입출력 등의 기능 제공.
	
	InputStreamReader
	바이트 입력 스트림에 연결되어 문자입력 스트림인 Reader로 변환시킴
	Reader reader = new InputStreamReader(byte input stream);
	
	콘솔 / 파일을 위한 스트림도 reader타입으로 변환 가능
	InputStream is = system.in;
	FileInputStream fis= new FileInputStream();
	Reader reader = new InputStreamReader(is/fis);
	 
	OutputStreamWriter
	바이트 출력 스트림에 연결되어 문자 출력 스트림인 Writer로 변환.
	Writer writer = new OutputStreamWriter();
	
	성능 향상 보조 스트림
	메모리 버퍼와 작업해 실행 성능을 향상시킴.
	버퍼는 데이터가 쌓이기를 기다렸다가 꽉 차게 되면 데이터를 한꺼번에 하드디스크로 보냄으로써 출력횟수 줄임
	바이트기반은 Buffered Input/Output Stream이 있고
	문자 기반 스트림에는 BufferedReader/Writer가 있음.
	
	BufferedReader/ BufferedInputStream
	문자 / 바이트 입력 스트림에 연결되어 버퍼를 제공해줌.
	자신의 내부 버퍼 크기만큼 데이터를 미리 읽고 버퍼에 저장해놓음.
	바이트는 최대 8192, 문자는 최대 8192문자까지 저장가능
	
	BufferedWritter/ BufferedOutputStream
	프로그램에서 전송한 데이터를 내부에 쌓아 두었다가 버퍼가 꽉 차면,
	버퍼의 모든 데이터를 한꺼번에 보냄.
	출력 작업을 마친 뒤에는 flush()메소드를 호출해 버퍼에서 잔류하고 있는 데이터를 보내게 해야함.
	
	기본 타입 입출력 보조 스트림
	DataInputStream / DataOutputStream 
	사용하면 기본 데이터 타입으로 입출력 가능.
	데이터 타입의 크기가 모두 다르므로 outputStream으로 출력한 데이터를다시 읽어와야할 때는출력한 순서와 동일한 순서로 읽어와야함.
	
	프린터 보조 스트림
	PrintStream/PrintWriter 
	출력 스트림과 연결됨. Writer은 문자출력 스트림과 연결됨.
	

	PrintStream ps = new PrintStream(byte 출력);
	PrintWriter pw = new PrintWriter(문자출력);
	
	객체 입출력 보조 스트림
	자바는 메모리에 생성된 객체를 파일 또는 네트워크로 출력 가능.
	객체는 문자가 아님=> 바이트 기반 스트림으로 출력해야함.
	객체를 출력하기 위해서는 데이터(필드값)을 일렬로 늘어선 연속적인 바이트로 변경해야함
	=>객체의 직렬화
	입력 스트림으로부터 읽어들인 연속적인 바이트를 객체로 복원하는것을 역직렬화라고 함.
	
	ObjectInputStream / ObjectOutputStream
	
	
	직렬화가 가능한 클래스(Serializable)
	자바는 Serializable 인터페이스를 구현한 클래스만 직렬화 할수 있도록 제한함.
	객체를 직렬화할때 변환되는건 필드기 때문에 역직렬화 할떄도 필드의 값만 복원됨.
	static or transient가 붙어있다면 직렬화 x
	
	자식만 직렬화가 되있고 부모의 필드를 직렬화시키고 싶을 떄
	부모 클래스가 Serilalizable 클래스를 구현하도록 함
	or 자식 클래스에서 writeObject()와 readObject()메소드를 선언해 부모객체의 필드를 출력시킴.
	 */
}
