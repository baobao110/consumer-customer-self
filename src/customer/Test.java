package customer;

public class Test {
	public static void main(String[] args) {
		Container.add("wqq");
		Container.add("wqq");
		Container.add("wqq");
		Container.add("wqq");
		customer a=new customer();
		product b=new product();
		new Thread(a,"1").start();
		new Thread(a,"2").start();
		new Thread(a,"3").start();
		new Thread(a,"4").start();
		new Thread(b).start();
	}

}
