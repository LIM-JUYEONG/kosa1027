
public class Ex03 {
	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		// i = "10"; "문자열이 되버린다"
		String str = "10"; ///문자열인 경우""
		System.out.println(str);
		// char ch = '10'; 문자열(1문자 0문자가 합쳐진 형태)
		char ch = '0'; // 문자인 경우 : ''
		System.out.println(ch);
        ch = '9';
        System.out.println(ch); // 공백문자
		ch = '0'; // 48
		System.out.println(ch);
		System.out.println((int)ch);
		// String str1 = 'a'; //string은 문자열 저장, a는 문자여서 저장안됨
		// char ch1 = "a"; #a는 문자하나더라도 ""을 하면 문자열이 되기 때문에 char 로 사용 불가능
		
	}
}
