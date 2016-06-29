package study.zhaozhu.java.thread;

public class RunnableTest2 {

	public static void main(String[] args) {
		MyRunnable2 myRunnable = new MyRunnable2();

		Thread thread1 = new Thread(myRunnable, "窗口1");
		Thread thread2 = new Thread(myRunnable, "窗口2");
		Thread thread3 = new Thread(myRunnable, "窗口3");
		
		thread1.start();
		thread2.start();
		thread3.start();

	}

}

class MyRunnable2 implements Runnable {

	private int ticket = 10;

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			// 同步锁
			synchronized (this) {
				if (this.ticket > 0) {
					// System.out.println("MyRunnable executed by a thread.");
					System.out.println(Thread.currentThread().getName() + "--卖出票:ticket--" + this.ticket);
					this.ticket--;
				}
			}
		}

		try {
			//sleep不能加到同步锁里面
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}