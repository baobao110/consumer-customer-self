package customer;

import java.util.Scanner;

public class product implements Runnable{
	public void run() {
		synchronized (Container.b) {//ͬ����
			while(true) {//ѭ������
				if(Container.size()>0) {
					System.out.println("�����ߵȴ�");
					try {
						Container.b.wait(100);//�ȴ�����
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else {
					Container.add("www");//���Ԫ��
					Container.b.notifyAll();//Ԫ�������ɻ��Ѳ���
				}
			}
		}
	}
}
//����һֱ����ͬ�����ͽ�ϵ�֪ʶ���Լ��̵߳���ط���
