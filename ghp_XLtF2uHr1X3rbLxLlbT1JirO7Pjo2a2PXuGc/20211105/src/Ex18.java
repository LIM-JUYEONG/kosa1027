
public class Ex18 {

	public static void main(String[] args) {
		// 3단부터 7단까지 출력하시오(while)
		// 3eks
		int gop = 1;
		while (gop<=9) {
			System.out.println("3*"+gop +"=" +3*gop);
			gop++;
		}
		gop = 1;
		while (gop<=9) {
			System.out.println("4*"+gop +"=" +4*gop);
			gop++;
		}
		gop = 1;
		while (gop<=9) {
			System.out.println("5*"+gop +"=" +5*gop);
			gop++;
		}
		System.out.println("=========================");
		int dan = 3;
		while( dan <=7) {
			gop=1;
			while (gop <=9 ) {
				System.out.println(
						dan+"*" + gop +"=" +dan *gop);
				gop++;
			}
			dan++;
		}
		
		
		
	}

}
