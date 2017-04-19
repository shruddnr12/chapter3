package lang;

public class PointTest {

	public static void main(String[] args) {
		Point pt = new Point();

		System.out.println(pt.getClass().getName());
		System.out.println(pt.hashCode()); //객체ID, 객체 레퍼런스값
		
		//toString() 기본 내부 구현  => getClass().getName() +"@" + hashCode()  //hashCode()은 16진수로 표기
		System.out.println(pt.toString());
		System.out.println(pt);  // 기본타입이 아닌 객체면 System.out.println(pt.toString())로 자동 컴파일된다.
		
		/*cf String 객체와 비교*/
		
		String s = new String("hello"); // 별로 좋지 않은 방법. 이유는 나중에
		System.out.println(s.getClass().getName());
		System.out.println(s.hashCode());
		System.out.println(s.toString());
		System.out.println(s);
		
		
	}

}
