package Threading;

public class ThreadJoin extends Thread{

	public void run() {
		
		for(int i = 1; i <= 4; i++) {
			
			System.out.println(Thread.currentThread().getName() + "- count" + i);
			
			try {
				
				Thread.sleep(1000);
				
			}catch(InterruptedException e) {
				
				System.out.println(e);
				
			}
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadJoin t1 = new ThreadJoin();
		
		ThreadJoin t2 = new ThreadJoin();
		
		ThreadJoin t3 = new ThreadJoin();
		
		t1.setName("Worker-1");
		t2.setName("Worker-2");
		t3.setName("Worker-3");
		
		System.out.println("Starting Threads ");
		
		t1.start();
//		t2.start();
		try {
			
			t1.join();
//			t2.join();
			
		}catch(InterruptedException e) {
			
			System.out.println(e);
			
		}
		
		t2.start();
		
		try {

			t2.join();
//			t2.join();

		} catch (InterruptedException e) {

			System.out.println(e);

		}
		
		t3.start();
		
		System.out.println("Thread " + t1.getName() + " is alive ? " + t1.isAlive());
		System.out.println("Thread " + t2.getName() + " is alive ? " + t2.isAlive());
		System.out.println("Thread " + t3.getName() + " is alive ? " + t3.isAlive());
		
		System.out.println("Main thread ends ");

	}

}
