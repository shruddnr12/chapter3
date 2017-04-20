package lang;

public class StringTest {

	public static void main(String[] args) {
		
		//문자 " escape  
		String s = "I Say\"Hello\"";
		System.out.println(s);
		
		//문자 ' escape
		char c= '\'';
		System.out.println(c);
		
		//문자 \ escape
		String s1 = "C:\\jx372";
		System.out.println(s1);
		
		//\t, \n, \r
		System.out.print("\n");
		System.out.println(""); //위 라인과 동일.
		
		// + 연산이 가능하다.
		String s2 = "Hello"+"World";
		System.out.println(s2);
		System.out.println(s2.charAt(4));
		
		//내부 문자(배)열을 가져오기
		char[] cs = s2.toCharArray();
		System.out.println(cs);
		
	}

}
