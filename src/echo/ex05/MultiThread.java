package echo.ex05;

public class MultiThread {

	public static void main(String[] args) {

		Thread thread00=new Thread(new DigiImpl());
		Thread thread01=new Thread(new UpperImpl());
		Thread thread02=new Thread(new LowerImpl());

		thread00.start();
		thread01.start();
		thread02.start();
		
		
		
	}

}
