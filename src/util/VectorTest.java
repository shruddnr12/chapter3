package util;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<String> v= new Vector<String>();
		
		//삽입
		v.addElement("둘리");
		v.addElement("마이콜");
		v.addElement("도우넛");
		
		//순회1 (v1.2.이전)
		int count = v.size();
		for(int i = 0; i < count; i++)
		{
			String s = v.elementAt(i); 
			System.out.println(s);
		}
		//삭제 (v1.2.이전)
		v.removeElementAt(1);  //순서를 지울때      //객체를 지울때는 At을 빼면 된다.
		
		//순회2 (v1.2.이전)
		Enumeration<String> e  = v.elements();
		while(e.hasMoreElements())
		{
			String s= e.nextElement();
			System.out.println(s);
		}
	}

}
