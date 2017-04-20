package lang;

public class SBTest {

	public static void main(String[] args) {
		//생성
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb); //객체니까 toString으로 호출하는게 더 좋겠다.
		
		//문자열 추가
		sb.append(" is a pencil");
		System.out.println(sb);
		
		//삽입 
		sb.insert(7, " my");
		System.out.println(sb);
		
		//치환
		sb.replace(8, 10, "your");
		System.out.println(sb);
		
		//버퍼 크기 조정
		sb.setLength(3);
		System.out.println(sb);
		
		//더 중요한 내용
		//문자열  + 연산은 내부적으로 StringBuffer 객체로 변환된다.
		
		String s1 = "Hello" + "World" + 10 + true;
		String s2 = new StringBuffer("Hello").     //데이터의 양이 많으면 stringBuffer를 사용하는게 좋다. 보통 서버프로그래밍이나 빅데이터 에서 유용하게 쓰인다. 보통의 웹 프로그래밍에서는 잘 쓰이지 않는다.
					append("world").
					append(10).
					append(true).toString();
		System.out.println(s1);
		System.out.println(s2);
	}

}
