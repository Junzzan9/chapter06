package echo.ex04;

public class MultiThread {

	public static void main(String[] args) {

		Thread thread=new Thread(new DigitalRunableImpl());
		
		thread.start();
		
		for(char c='A';c<='Z';c++) {
			if(c=='Z') {
				System.out.println(c);
			}
			else {
				System.out.print(c+", ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
