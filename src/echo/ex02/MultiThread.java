package echo.ex02;

public class MultiThread {

	public static void main(String[] args) throws Exception {
/*
		Thread thread = new DigitThread();
		thread.start(); // digitthread랑 multithread 번갈아가면서 실행
		// thread.run(); // digitthread에 new를 했으니까 digitthread 먼저 쭉 실행하고 multithread 실행함
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}*/
		
		/******=================================================*******/
	
		Thread thread1 = new DigitThread();
		Thread thread2 = new DigitThread();
		Thread thread3 = new AlphabetThread();
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
