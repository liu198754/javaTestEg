
public class test111 {

	private static test111 t1 = null;
	public test111(){
		System.out.println("111111111");
	}
	
	
	public static test111 getSelf(){
		return t1;
	}
	
	static{
		t1 = new test111();
	}
}
