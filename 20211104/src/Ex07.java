
public class Ex07 {
	
	public static void main(String[] args) {
		char ch1 = 'A' + 1; //2byte + 2byte : 문자 + 2byte
		System.out.println(ch1);
		char ch2 = 'C'; //wjdtn
		char ch3 = (char)(ch2 +1); // (char)(4byte + 4byte)
		
		short sh = 65 + 60;
		short sh1 = 65;
		short sh2 = 60;
		short sh3 = (short)(sh1 + sh2);
		float f1 = 10.5f;
		double d1 = 10.6;
		double d2 = d1 + f1;
		
		int result = (int) 10.5 + 4;
		System.out.println(result);
		
		
		/* 자료형 : 
		 *  정수 : byte, short, int, long
		 *  실수 : float, double
		 *  분자열 : String
		 *  문자 : char , ''
		 *  부울 : true, false : 1byte
		 */
		char ch = 'a';
		ch = 97;
	}
}
