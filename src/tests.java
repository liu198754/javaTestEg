
public class tests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//new Thread()
			//Thread.currentThread().getThreadGroup()
			test111.getSelf();
			System.gc();
			Thread.sleep(10000);
			test111.getSelf();
			System.gc();
			test111.getSelf();
			System.gc();
			test111.getSelf();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
