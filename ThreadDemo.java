class Thread2 implements Runnable{
	public void run() {
		System.out.println("I am thread by implementing runnable interface");
	}
}
class Thread1 extends Thread{
	public void run() {
		System.out.println("I am thread by extending thread class");
	}
}
public class ThreadDemo {
	public static void main(String[]args) {
		//By thread class
		Thread1 th=new Thread1();
		th.run();
		
		//By runnable interface
		Thread2 th1=new Thread2();
		th1.run();
	}
}
