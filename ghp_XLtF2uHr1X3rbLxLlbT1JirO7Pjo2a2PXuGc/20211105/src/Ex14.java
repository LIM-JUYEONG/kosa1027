
public class Ex14 {

	public static void main(String[] args) {
		// i = 10        #1
		//while i <=9:   #2
		// 	print(i)     #3
		//  i += 1       #4
		// 순서 : 1-> 2-> 3-> 4-> 2-> 3-> 4-> ... ->2
		// for문의 실행순서
		//      1       2       4
		for(int i = 1; i <= 9; i++) {
			// 3
			System.out.println("5*" +i + "=" +5*i);
		}
		// 1--> 2--> 3--> 4--> 2 --> 3--> 4-->... ->2
		int i = 1;  // 1번이고 한번만 실행되도 되니까 맨 위에 써주기
		for(; i <= 9; ) {
			// 3
			System.out.println("5*" +i + "=" +5*i);
			i ++; // 4번이니까 3번밑에 있어도 실행됨
		}
		System.out.println("=== while ===");
		i = 1;  //1   // 위에 int i = 1;이게 있는데 또 int i = 1;넣으면 안되니까 i = 1로
		while (i <=9) {// 2
			System.out.println("5*"+i + "=" +5 * i); //3
			i ++; //4
			
		}
		// while 문으로 3단을 출력
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
