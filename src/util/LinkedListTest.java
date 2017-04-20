package util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();  //1.2 버전 이후 생선된 List로 객체생성하였으므로 List의 메소드를 사용한다.

		//삽입
		list.add("둘리");
		list.add("마이콜");
		list.add("도우넛");

		//순회1 
		int count = list.size();
		for(int i =0; i < count; i++)
		{
			String s = list.get(i);
			System.out.println(s);
		}

		//삭제
		list.remove(1);

		//순회 2
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			String s = it.next();
			System.out.println(s);
		}

		//순회 3
		for(String s: list)
		{
			System.out.println(s);
		}

	}
}


