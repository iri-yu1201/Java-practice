package practice;

public class Chapter15_4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 2; i++) {
			ThreadSample mt = new ThreadSample(i);
			
			Thread thread = new Thread(mt);
			
			thread.start();
		}
		for (int i = 1; i <= 3; i++) {
			try {
				//sleepメソッドはInterruptedExceprionの例外が発生する可能性がある
				//そのためtry-catch文で囲む
				Thread.sleep(1000);
				System.out.println("Chapter15_4のスレッド：" + i + "回目");
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
