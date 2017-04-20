package util;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();  // 아무 parameter 없이 호출시 현재 시스템 시간을 반환한다.
		System.out.println(now);
		printDate(now);
		printDate2(now);
		
		//특정 날짜 세팅(2000년/4월/21일)
		Date d2 = new Date(100,3,21);
		printDate(d2);
		
		//특정 시간 세팅(2000년/4월/21일/ 13시:25분:30초)
		Date d3 = new Date(100,3,21,13,25,30);
		printDate(d3);
				
		//1970년 1월 1월  00:00:00.000기준
		//milliseconds 값 세팅
		long milliseconds = 24L * 60 * 60 * 1000 * 365 * 30; //30년 millisecond 양
		Date d4 = new Date(milliseconds);
		printDate(d4);
		
	}
	
	public static void printDate(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초");
		System.out.println(sdf.format(date));
	}
	
	public static void printDate2(Date date)
	{
		//년도 (+1900)
		int year = date.getYear();  // deprecated-> 나중에 없어질꺼니까 다른거 써라라는 의미.캘린더 쓰면 된다. but 기존 시스템 때문에  사라지긴 힘들다 
		//월(0~11)
		int month = date.getMonth();
		//날짜
		int day = date.getDate();
		//시
		int hours = date.getHours();
		//분
		int minutes = date.getMinutes();
		//초
		int seconds = date.getSeconds();
					
		System.out.println((year+1900) + "년 " + (month+1) + "월 " + date + "일 " + hours +"시 " + minutes + "분 " + seconds + "초");
	}
}
