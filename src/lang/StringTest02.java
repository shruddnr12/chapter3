package lang;

public class StringTest02 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "cde";
		String str3 = str2;
			
		str2 = str3.toUpperCase();
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		String str4 = str2.concat("??");
		System.out.println(str2);
		System.out.println(str4);
		
		//method chain
		String str5 = "!".concat(str2).concat("@"); // "!" 같은경우는 한번만 사용하려는 목적이 보인다. 재사용이 가능하게 할려고 했으면 변수에 담아서 사용했을 것이다.
//		String s1 = "!";
//		String str5 = s1.concat(str2).concat("@");
	
		System.out.println(str2);
		System.out.println(str5);
		
	}

}
