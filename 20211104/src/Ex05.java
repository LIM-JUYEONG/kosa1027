
public class Ex05 {

	public static void main(String[] args) {
		// ����ȯ
		// �ڵ�����ȯ : ���� �ڷ����� ū �ڷ������� ��ȯ�ϴ� ��
		// 1byte -> 2byte -> 4byte -> 8byte
		// 1byte -> 8byte, 1byte -> 4byte
		short sh = 30000;
		int i = sh; // �ڵ�����ȯ
		float f = sh; //�ڵ�����ȯ : ���� ---> �Ǽ�
		System.out.println(i);
		System.out.println(f);
		// ��������ȯ : ū �ڷ����� ���� �ڷ������� ��ȯ�ϴ� ��
		// tlftn ==> ����, ū�� ==> ���� ��
		double d1 = 174.5;
		float f1 = 174.5f;
		int i1 = (int)f1;
		System.out.println(i1);
		i1 = (int)d1;
		System.out.println(i1);
		int i2 = 2100000000;
		short sh1 = (short)i2; // ū�� ==> ���� �� 
		/// �����÷ο찡 �߻��� �� ����
		System.out.println(sh1);
	}
	
}
