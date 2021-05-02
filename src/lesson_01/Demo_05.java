package lesson_01;

public class Demo_05 {
	private static int count = 0;
	
	public static synchronized void incrementCount() {
		count++;
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<1000; i++) {
					incrementCount();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<1000; i++) {
					incrementCount();
				}
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread: "+Thread.currentThread().getId()+" Value: " + count);
	}

}
