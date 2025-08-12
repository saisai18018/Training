package Threading;

public class MyThread extends Thread{
	
	public void run() {
		
		for(int i = 0; i <= 10; i++) {
			
			System.out.println(Thread.currentThread().getName() + " - Value " + i);
			
			try {
				
				Thread.sleep(2500);
				
			}catch(InterruptedException e) {
				
				System.out.println(e);
				
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread t1 = new MyThread();
		
		MyThread t2 = new MyThread();
		
		t1.setName("Thread 1");
		
		t2.setName("Thread 2");
		
		t1.start();
		
		t2.start();
	}

}
