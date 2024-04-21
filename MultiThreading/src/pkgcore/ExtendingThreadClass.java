package pkgcore;

import java.util.Iterator;

 class NewClass extends Thread{
	public void run() {
		for(int i=0 ;i<1000;i++) {
			System.out.println("class new class itr "+i);
		}
	}
}

public class ExtendingThreadClass  extends Thread{
	public void run() {
		for( int i=0 ;i<1000;i++) {
			System.out.println(" class extnd class iteration"+i);
			
		}
		
	}
	public static void main(String[] args) {
		new ExtendingThreadClass().start();
		new NewClass().start();
	}

}
