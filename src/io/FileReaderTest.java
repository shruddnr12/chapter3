package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		FileReader fr = null;
		FileInputStream fis = null;
		try {
			fr	 = new FileReader("hello.txt");
			fis = new FileInputStream("hello.txt");
			int count = 0;
			int data = -1;
			while((data = fr.read()) != -1){
				count++;
				System.out.print((char)data);
			}
			System.out.println("\n읽은 횟수:" + count);
			System.out.println("===================================");

			count = 0;
			while((data = fis.read()) != -1){
				count++;
				System.out.print((char)data);   //문자를 읽으려면 char형으로 읽어야 됨을 보여주는 사례
			}
			System.out.println("\n읽은 횟수:" + count);   

		} catch (FileNotFoundException e) {  //순서상 이게 먼저 와야 된다. 밑에 오면 에러. IOException이 먼저 거치기 때문.
			System.out.println("파일 없음:" + e);
		}
		catch(IOException e)
		{
			System.out.println("IO error:" + e);
		}
		finally{

			try{
				if(fr != null)
				{
					fr.close();
				}
				if(fis != null)
				{
					fis.close();
				}
			}
			catch(IOException e)
			{
				System.out.println("IO error:" + e);
			}


		}


	}

}
