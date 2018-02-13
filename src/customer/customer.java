package customer;

public class customer implements Runnable{
	public void run() {
		synchronized (Container.b) {//同步锁
			while(true) {//循环操作
				if(Container.size()>0) {//进行集合判断
					System.out.println(Container.get()+Thread.currentThread().getName());
				}
				else {
					System.out.println("消费者等待");
					try {
						Container.b.wait(100);//因为集合为空所以消费者需要等待
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}
