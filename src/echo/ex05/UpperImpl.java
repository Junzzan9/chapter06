package echo.ex05;

public class UpperImpl implements Runnable{
	
	@Override
	public void run() {
		for (char c='A';c<='Z'; c++) {

			if (c == 'Z') {
				System.out.println(c);
			} else {
				System.out.print(c + ", ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
