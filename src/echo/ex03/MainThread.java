package echo.ex03;

public class MainThread {

	public static void main(String[] args) {
		
		Thread t1 = new DigitThread();
		Thread t2 = new DigitThread();
		Thread t3 = new AlphabetThread();
		
		t1.start(); //run하면 안됨
		t2.start();
		t3.start();

	}

}
