package lang;

public class StringTest03 {

	public static void main(String[] args) {
		String s = "abcAbcaBcabCABC";				
		
		//charAt
		System.out.println(s.charAt(2));
		
		//indexOf
		System.out.println(s.indexOf("Ab"));
		System.out.println(s.indexOf("xyz")); // 없을 경우 -1 반환
		
		//replace (치환)
		System.out.println(s.replace('a', 'R')); // 원본은 바뀌지 않고 새로운 문자열을 반환한다.
		System.out.println(s);
		
		//replaceAll (치환)
		System.out.println(s.replace("bc", "12")); //차이가 없다.
		System.out.println(s.replaceAll("bc", "12"));
		
		//substring
		System.out.println(s.substring(3, 7));  // s.substring(3부터, 7 앞까지!!!!)
		
		//toLowerCase
		System.out.println(s.toLowerCase());
		
		String str1 = " ab cd";
		String str2 = ",efg";
		
		//concat
		str1 = str1.concat(str2);
		System.out.println(str1);
		
		//trim
		//str1 = " ab cd,efg"
		System.out.println("--" + str1 + "--");
		str1 = str1.trim();
		System.out.println("--" + str1 + "--");  // 앞/뒤의 공백을 제거. 그럼 중간에 있는 공백은?? replace(" ","")로 하면 된다. 
		
		//split (구분자)-> 구분자를 통해서 분리.
		String[] tokens = str1.split(",");
		for(String str : tokens)
		{
			System.out.println(str);
		}
		
		//split 예외  -> 구분자가 없어도 비교대상에 없어도 가능.
		tokens = "abcdefg".split(",");
		for(String str : tokens)
		{
			System.out.println(str);
		}
		
		tokens = "".split(",");
		System.out.println(tokens.length);
		
	}

}
