package lang;

public class WrapperClassTest02 {

	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.isDigit('1'));
		System.out.println(Character.isDigit('@'));
		 
		String s= "1234";  
		// 예외를 발생시키기 보다는 Logic방식을 추천한다. 
		if(s.matches("-?\\d+(\\.\\d+)?") == false){
			System.out.println("숫자가 아닙니다.");
		}
		else{
			int i = Integer.parseInt(s);
			System.out.println(i);
		}
		
		//프로그램 로직(변수 검증...) try~catch문으로 하는 것은 좋지 않은 방식. 하지 말것.
//		try{
//			int i = Integer.parseInt(s);
//		}catch(NumberFormatException ex){
//			System.out.println("숫자가 아닙니다");
//		}
		
		System.out.println(Integer.parseInt("A",16)); //16진수로 "A"를 파싱하기.
		System.out.println(Integer.toBinaryString(255));
		System.out.println(Integer.toHexString(255));
		System.out.println(Double.parseDouble("44.13e-16"));
		System.out.println(Long.parseLong("123456789")); // 이런걸 많이씀.
		
		System.out.println(String.valueOf(12345)); // 이런걸 많이씀.
	}

}
