package study.zhaozhu.java.thread;

public class RunnableTest1{
	
	public static void main(String[] args) {
		MyRunnable1 myRunnable = new MyRunnable1();
		
		Thread thread = new Thread(myRunnable);
		
		thread.start();
		
	}
	
}


class MyRunnable1 implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("MyRunnable executed by a thread.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}