package echo.ex04;

public class MainThread {

	public static void main(String[] args) throws Exception {

		Thread thread = new Thread(new DigitThread()); // () 안에(생성자위치) 만든 인터페이스(new DigitThread) 넣기

		thread.start();

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}
	}

}
