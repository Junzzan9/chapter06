package echo.ex03;

public class MultithreadApp {

	public static void main(String[] args) {

		Thread thread00 = new DigitThread();
		Thread thread01 = new UpperThread();
		Thread thread02 = new LowerThread();
		
		thread00.start();
		thread01.start();
		thread02.start();
		
		
	}

}
