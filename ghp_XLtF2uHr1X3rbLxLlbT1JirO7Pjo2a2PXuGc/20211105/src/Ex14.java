
public class Ex14 {

	public static void main(String[] args) {
		// i = 10        #1
		//while i <=9:   #2
		// 	print(i)     #3
		//  i += 1       #4
		// ���� : 1-> 2-> 3-> 4-> 2-> 3-> 4-> ... ->2
		// for���� �������
		//      1       2       4
		for(int i = 1; i <= 9; i++) {
			// 3
			System.out.println("5*" +i + "=" +5*i);
		}
		// 1--> 2--> 3--> 4--> 2 --> 3--> 4-->... ->2
		int i = 1;  // 1���̰� �ѹ��� ����ǵ� �Ǵϱ� �� ���� ���ֱ�
		for(; i <= 9; ) {
			// 3
			System.out.println("5*" +i + "=" +5*i);
			i ++; // 4���̴ϱ� 3���ؿ� �־ �����
		}
		System.out.println("=== while ===");
		i = 1;  //1   // ���� int i = 1;�̰� �ִµ� �� int i = 1;������ �ȵǴϱ� i = 1��
		while (i <=9) {// 2
			System.out.println("5*"+i + "=" +5 * i); //3
			i ++; //4
			
		}
		// while ������ 3���� ���
		int gop = 1;
		while (gop <=9) {
			System.out.println("3*"+gop + "=" +3 * gop);
			gop ++;
		}
		System.out.println("===============");
		for(gop = 3; gop <=7; gop++) {
			System.out.println("3*" +gop + "=" +3 * gop);
			
		}
		System.out.println(" ======= while =========");
		gop = 3;
		while (gop <=7) {
			System.out.println("3*" +gop + "=" +3*gop);
			gop ++;
		}
	}

}
