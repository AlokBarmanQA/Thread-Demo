package lesson_01;

class myClass2 implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Thread ID: "+ Thread.currentThread().getId() + " Value is: " + i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
public class Demo_02 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new myClass2());
		Thread t2 = new Thread(new myClass2());
		t1.start();
		t2.start();
	}

}
