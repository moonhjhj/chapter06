package echo.ex02;

public class DigitThread extends Thread {

	public void run() {

		for (int cnt = 0; cnt < 10; cnt++) {

			System.out.println(cnt);

			/********* 너무 빨라서 텀 주기 **********/
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
