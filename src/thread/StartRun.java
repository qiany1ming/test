package thread;
/*
 * �����̷߳�ʽ����
 * 1��������ʵ��Runnabled+��дrun
 * 2��������������ʵ�ֶ���+Thread����+start 
 * �Ƽ������ⵥ�̳еľ����ԣ�����ʹ�ýӿ�
 */
public class StartRun implements Runnable {
	/*
	 * �߳���ڵ�
	 */
	@Override
		public void run() {
			for(int i=0;i<20;i++) {
				System.out.println("һ������");
			}
		}
	public static void main(String[] args){
		//����ʵ�������
		StartRun sr=new StartRun();
		//�������������
		Thread t =new Thread(sr);		
		//����
		t.start();
		
		for(int i=0;i<20;i++) {
			System.out.println("һ��Coding");
		}
	}
}