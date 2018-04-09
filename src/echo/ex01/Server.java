package echo.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {

		// 서버 소켓(연결하는거)
		ServerSocket serverSocket = new ServerSocket();

		// bind (IP, port 정해주기==>그래야 거기서 프로그램이 돔.)
		serverSocket.bind(new InetSocketAddress("123.212.65.58", 10001)); // 이 IP에서 10001번 포트를 지켜보고 있는 것.

		System.out.println("<서버시작>");
		System.out.println("====================");
		System.out.println("[연결을 기다리고 있습니다.]");

		Socket socket = serverSocket.accept();

		// 연결
		System.out.println("[클라이언트가 연결되었습니다.]");

		// 메세지 받기용 스트림
		InputStream is = socket.getInputStream();
		Reader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		// 메세지 보내기용 스트림
		OutputStream os = socket.getOutputStream();
		Writer osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);

		String msg;

		while (true) {
			msg = br.readLine();// 읽기
			if (msg == null) {
				System.out.println("클라이언트 접속 종료");
				break;
			}
			System.out.println("받은메세지: " + msg);

			bw.write(msg);
			bw.newLine();// 개행문자
			bw.flush();// buffered는 일정량 모아서 보냄. 꽉 안차면 전송이 안됨. 생각한 것보다 작으면 모아놓고 보내지 않음. flush는 강제로 보내는 것.

		}

		System.out.println("====================");
		System.out.println("<서버종료>");

		serverSocket.close();

	}

}
