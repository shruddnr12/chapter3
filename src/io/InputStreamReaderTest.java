package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		InputStreamReader   isr= null; 
		

			try {
				isr = new InputStreamReader(new FileInputStream("ms949.txt"),"MS949");    // UTF-8는 3바이트 체계, ms949는 2바이트 체계 
				int data = -1;
				while((data = isr.read()) !=-1)
				{
					System.out.print((char)data);
				}
				
				
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch(IOException e)
			{
				e.printStackTrace();
			}
		
	}

}
