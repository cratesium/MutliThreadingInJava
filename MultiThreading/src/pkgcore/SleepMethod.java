package pkgcore;
class fallingThreads implements Runnable {
	public void run() {
		for( int i=0 ;i<15;i++)
		{
			try {
				System.out.println("Threads are falling ");
				Thread.sleep(999);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		 
		
	}
	
}

public class SleepMethod implements Runnable  {
	public void run() {
		try {
			
			for( int i=0 ;i<15;i++)
			{  	Thread.sleep(1000);
				System.out.println("hiii this is c2 ");
			}
			 
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1= new Thread(new fallingThreads());
		Thread t2= new Thread(new SleepMethod());
		t1.start();;
		t2.start();
		}

}
