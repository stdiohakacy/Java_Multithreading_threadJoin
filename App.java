package _03;


class Runner1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Runner1 " + i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}

class Runner2 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Runner2 " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
public class App {
	public static void main(String[] args) throws InterruptedException {
		Runner1 run1 = new Runner1();
		Runner2 run2 = new Runner2();
		
		
		
		run1.start();
		run2.start();
		
		run1.join();
		run2.join();
		
		System.out.println("Finished!");
	}
}
