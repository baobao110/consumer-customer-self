package customer;

public class customer implements Runnable{
	public void run() {
		synchronized (Container.b) {//ͬ����
			while(true) {//ѭ������
				if(Container.size()>0) {//���м����ж�
					System.out.println(Container.get()+Thread.currentThread().getName());
				}
				else {
					System.out.println("�����ߵȴ�");
					try {
						Container.b.wait(100);//��Ϊ����Ϊ��������������Ҫ�ȴ�
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}
