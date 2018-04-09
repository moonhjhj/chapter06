package echo.ex04;

public class DigitThread implements Runnable {// thread를 상속받아서 구현하는 방법도 있고, 인터페이스로 구현하는 방법도 있음.

	public void run() {
		for (int cnt = 0; cnt < 10; cnt++) {
			System.out.println(cnt);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
