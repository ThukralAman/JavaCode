package multithreading;

public class CreateThreadAnonymousClass {

	public static void main(String[] args) {
		Thread t1 = new Thread( new Runnable() {
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println(i);
					try{
						Thread.sleep(100);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		t1.start();

		System.out.println("main end");
	}

	private static void run() {
		// TODO Auto-generated method stub
		
	}

}
