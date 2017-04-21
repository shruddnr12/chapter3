package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyboardTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		// 기반 스트림은 System.in( 표준 입력, 키보드)
		try {
			InputStreamReader isr = new InputStreamReader(System.in,"utf-8");   // "utf-8"이 default다.
			br = new BufferedReader(isr);

			while(true)
			{
				System.out.print(">>"); //prompt

				String line = br.readLine();
				if(line == null){
					break;
				}

				if("exit".equals(line) == true){
					break;
				}
				System.out.println(line);
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}

		finally{

			try {
				if(br != null){
					br.close();	
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}

	}

}
