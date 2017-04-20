package lang;

public class EqualsTest {
	public static void main(String[] args)
	{
		Point pt1 = new Point(10,20);
		Point pt2 = new Point(10,20);
		Point pt3 = pt2;
		
		/*
		 * Point 객체 비교
		 * equals,hashCode 메소드가 오버라이드가 안된경우
		 */
		// == 연산자에서 두 개의 항이 객체 참조 변수인 경우
		// 두 객체의 동일 여부(동일성)
		System.out.println(pt1 == pt2);
		System.out.println(pt2==pt3);
		
		// 두 객체의 동질성 비교를 할 때에는 equals() 메소드 사용한다.
		// equals가 오버라이드가 안된 경우에는 == 완전히 동일하다.
		System.out.println(pt1.equals(pt2));
		System.out.println(pt2.equals(pt3));
		
		//hashCode 비교
		System.out.println(pt1.hashCode());
		System.out.println(pt2.hashCode());
		System.out.println(pt3.hashCode());
		
		
		/*
		 * String 객체 비교
		 * equals,hashCode 메소드가 오버라이드가 된 경우
		 */
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		String s3 = s2;
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		
		//hashCode출력
		//String 클래스는 내용기반으로 hash code를 생성하게
		//hashCode() 메소드가 오버라이드 되어있다. 
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		// 참조값(객체ID)     
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
		/*
		 * literal를 사용하는 경우
		 * JVM 안의 리터럴(상수) 풀(pool)에서 객체 생성 관리를 하기 때문에
		 * 문자여 해싱값이 같은 문자열 객체는 2개 이상 만들지 않는다.
		 */
		String str1 = "hello";
		String str2 = "hello";
		String str3 = str2;
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);   //결과값을 보면  new로 생성한 것과 다르다. String str1 = "hello" => String str = new String("hello")이 된다는 거짓말 이라는거. 
		
	}
	
}
