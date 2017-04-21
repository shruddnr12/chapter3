package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {
		BufferedReader br = null;
		try{
			File file = new File("phone.txt");
			if(file.exists() == false){
				System.out.println("파일이 존재 하지 않습니다");
				//프로그램 종료코드 : System.exit(1);
				return ;  
			}

			System.out.println("===================파일정보=======================");
			System.out.println("경로:" + file.getAbsolutePath());
			System.out.println("크기:" + file.length() + "Bytes");
			//System.out.println("마지막 수정:" + file.lastModified());
			System.out.println("마지막 수정:" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));

			System.out.println("===================전화번호=======================");
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis,"utf-8");
			br = new BufferedReader(isr);
			
			String line = null;
			while((line = br.readLine()) != null){
				 StringTokenizer st = new StringTokenizer(line,"\t "); //토큰을 분리하는 경우 아니면 쓰지 말것. new StringTokenizer(line,"여기들어오는 문자를 기준으로 분류를 한다.")
				 
				 int index = 0;
				 while(st.hasMoreTokens()){
					 String s = st.nextToken();
					 if(index == 0){
						 System.out.print(s + ":");
					 }
					 else if(index == 1){
						 System.out.print(s + "-");
					 }
					 else if(index == 2){
						 System.out.print(s + "-");
					 }
					 else if(index == 3){
						 System.out.print(s);
					 }
					 
					 index++;
				 }
				 System.out.println("");
			}
			
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(UnsupportedEncodingException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		finally{
			try {
				if(br != null)
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
