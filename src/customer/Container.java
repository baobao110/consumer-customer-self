package customer;

import java.util.LinkedList;

public class Container {
	private static final LinkedList<Object> a=new LinkedList<Object>();//�ü��ϵķ���ʵ�����ݵĴ洢�����
	public static Object b=new Object();//����������ߺ�������ͬ����Ҫ��������������
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
