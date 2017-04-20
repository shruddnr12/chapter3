package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		
		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			bos = new BufferedOutputStream(fos,5);  // 생성자에 주스트림이 들어와있으면 아! 이거 보조스트림이구나...라고 알면 댐. 숫자는 버퍼의 size. size만큼 차면 write하게 됨.

			for(int i = '1'; i <= '9'; i++)
			{
				bos.write(i);
				bos.flush();// 버퍼가 차지 않은 상태에서  flush(버퍼 안의 값을 전부 send)를 한다.
			}

			//			for(int i = 49; i <= 57; i++){				
			//			}

		} catch (FileNotFoundException e) {
			System.out.println("파일 없음:" + e);
		}
		catch (IOException e) {
			System.out.println("IO error:"+e);
		}
		finally
		{
			try{
				if(bos != null)
				{
					bos.close();
				}
			}
			catch (IOException e) {
				System.out.println("IO error:"+e);
			}
		}

	}

}
