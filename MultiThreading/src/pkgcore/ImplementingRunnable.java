package pkgcore;
class AgainNewClass implements Runnable{
	public void run() {
		for(int i=0 ;i<1000;i++) {
			System.out.println("class new class itr "+i);
		}	
		
	}
	
}

public class ImplementingRunnable implements Runnable {
	public void run() {
		for( int i=0 ;i<1000;i++) {
			System.out.println(" class implement runnable  class iteration"+i);
			
		}

}
	public static void main(String[] args) {
		Thread thread = new Thread(new ImplementingRunnable());
		Thread thread2= new Thread(new AgainNewClass());
		thread.start();
		thread2.start();
		
	}
}
