	package io;
	
	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	
	public class BufferedReaderTest {
	
		public static void main(String[] args) {
	
			BufferedReader br = null;
			try {
				FileReader fr = new FileReader("./src/io/BufferedReaderTest.java");
				br = new BufferedReader(fr);
	
				int index = 0;
				String line = null;
				while((line = br.readLine()) != null)
				{
					System.out.println(++index + ":" +line);
				}
	
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			finally{
				try {
					if(br != null)
					{
						br.close();
					}
				} catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	
	}
