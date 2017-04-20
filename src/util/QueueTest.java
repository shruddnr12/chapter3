package util;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("둘리");
		queue.offer("마이콜");
		queue.offer("도우넛");
		queue.offer("또치");
		
		System.out.println(queue.isEmpty());
		System.out.println(queue.poll()); // 맨 앞꺼 끄집어 내기
		System.out.println(queue.poll());
		System.out.println(queue.peek()); 
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.isEmpty());
		
		
		//비어 있으면 null이 리턴된다. stack과 다르다.
		System.out.println(queue.poll()); 
		
	}

}
