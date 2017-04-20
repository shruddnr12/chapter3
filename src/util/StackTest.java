package util;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("둘리");
		stack.push("마이콜");
		stack.push("도우넛");
		stack.push("둘리");
		
		System.out.println(stack.isEmpty());  //비어잇냐? 안비어있냐?
		System.out.println(stack.pop()); //top 빼내면서 리턴
		System.out.println(stack.pop());
		System.out.println(stack.peek()); // top 확인만\
		System.out.println(stack.pop());
		
		//stack은 비어 있는 경우 pop 호출 시 예외 발생.
		//System.out.println(stack.pop());
		
		System.out.println(stack.isEmpty());
	}

}
