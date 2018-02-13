package customer;

import java.util.LinkedList;

public class Container {
	private static final LinkedList<Object> a=new LinkedList<Object>();//用集合的方法实现数据的存储和输出
	public static Object b=new Object();//后面的生产者和消费者同步需要用它进行锁操作
	public static void add(Object object) {
		a.add(object);
	}
	public static Object get() {
		return a.removeLast();
	}
	public static int size() {
		return a.size();
	}
}
