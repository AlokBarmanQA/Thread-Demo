package lesson_01;

class myClass extends Thread {
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
public class Demo_01 {

	public static void main(String[] args) {
		myClass object = new myClass();
//		object.run();// will run only one thread
		object.start();
		
		myClass object1 = new myClass();
		object1.start();
	}

}
