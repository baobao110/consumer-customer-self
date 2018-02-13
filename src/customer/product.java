package customer;

import java.util.Scanner;

public class product implements Runnable{
	public void run() {
		synchronized (Container.b) {//同步锁
			while(true) {//循环操作
				if(Container.size()>0) {
					System.out.println("生产者等待");
					try {
						Container.b.wait(100);//等待操作
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else {
					Container.add("www");//添加元素
					Container.b.notifyAll();//元素添加完成唤醒操作
				}
			}
		}
	}
}
//这里一直在用同步锁和结合的知识，以及线程的相关方法
