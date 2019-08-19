// synchronized keyword is used in declaring method
// so that only one thread can access the method at a given time

class SayHi extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}}
	}
}
class SayHello implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}}
	}
}

public class ThreadAndRunnable {

	public static void main(String[] args) throws Exception {
		SayHi obj1 = new SayHi();
		Runnable obj2 = new SayHello();
		Thread t2 = new Thread(obj2);
		obj1.start();
		t2.start();
		
		System.out.println(obj1.isAlive());
		t2.join(); //waits till thread gets executed
	}

}
