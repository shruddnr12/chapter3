package lang;

public class WrapperClassTest01 {

	public static void main(String[] args) {
		Integer i = new Integer(10); // 추천하지 않는 방식.
		Character c = new Character('c');
		Float f = new Float(3.14);
		Boolean b = new Boolean(true);
		
		//Auto Boxing
		//상수 풀을 거쳐서 자동으로 new Integer(10)
		Integer j = 10;
		
		//Auto Unboxing
		//int k = 10 + j.intValue();
		int k = 20 + j; //자동으로 unboxing해준다.
		
		swap(i,i);
		
		System.out.println(k);	
		
	}

	public static  void swap(Integer i, Integer j){
		//객체이지만 내부를 수정할 수 없기 때문에 
		//swap 되지않는다.
	}
}
