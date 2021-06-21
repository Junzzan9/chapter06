package echo.ex03;

public class DigitThread extends Thread {

	@Override
	public void run() {

		for(int i=0;i<10;i++) {
			
			if(i==9) {
				System.out.println(i);
			}
			else {
				System.out.print(i+", ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	//0-9 출력
	
	
}
