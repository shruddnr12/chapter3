package util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<Value> set = new HashSet<Value>();
		
		Value v1 = new Value(10);
		Value v2 = new Value(5);
		Value v3 = new Value(1);
		Value v4 = new Value(10);
		
		set.add(v1);
		set.add(v2);
		set.add(v3);
		set.add(v4);
		
		//존재 여부
		
		System.out.println(set.contains(new Value(10))); //동질성 비교
		
		//삭제
		set.remove(new Value(10)); // 값으로 삭제하기 위해서 새로 생성. 값으로 비교하니까 오버라이드 한거다.
		
		//순회
		Iterator<Value> it = set.iterator(); //Iterator는 제네릭으로 타입을 지정해 주는게 좋다. 왜냐면 디폴트로 오브젝트형이기때문. 그러면 다운캐스팅 형변환을 해야하고 그러면 오류가 날 가능성이 있다.
		while(it.hasNext())
		{
			Value v = it.next();
			System.out.println(v);
		}
	}

}
