
public class Ex12 {

	public static void main(String[] args) {
		/* num = 1 : 전역변수
		 *		 * def test():
		 * 	   num = 100 : 지역변수(자바에서는 블럭 변수라고 부름)
		 *     print(num)
		 *     
		 * test()
		 * print(num)
		 */
		int num = 1;
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
			int a = 10;
			// 변수 i, a를 블럭 변수라하고 블럭 안에서만 사용이 가능하다.
		}
		/* 블럭 밖에서 사용하려고 하면 오류가 발생한다.
		System.out.println(i);
		System.out.print'ln(a);
		*/
		num = 3;
		for(num = 1; num <=10; num ++) {
			System.out.println(num);
			//블럭 밖에 있는 변수 num은 블럭 안에서 사용가능하다.
		}
	}

}
