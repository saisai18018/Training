package Threading;

public class ThreadRunnable implements Runnable{
	
	public void run() {
		
		for(int i = 1; i <= 15; i++) {
			
			System.out.println(Thread.currentThread().getName() + "- Value " + i);
			
			try {
				
				Thread.sleep(1500);
				
			}catch(InterruptedException e) {
				
				System.out.println(e);
				
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadRunnable runnable = new ThreadRunnable();
		
		Thread t1 = new Thread(runnable, "Thread-1");
		
		Thread t2 = new Thread(runnable, "Thread-2");
		
		t1.start();
		
		t2.start();

	}

}
