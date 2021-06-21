package echo.ex03;

public class LowerThread extends Thread{

	@Override
	public void run() {

		for(char c='a';c<='z';c++) {
			if(c=='z') {
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
