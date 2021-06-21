package echo.ex03;

public class UpperThread extends Thread{

	@Override
	public void run() {

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
