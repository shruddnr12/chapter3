package util;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); //생성이 안되는 경우  1.팩토리 패턴 - 객체를 생성하는 객체가 존재해야 할때  2.싱글톤 패턴 - 유일 객체를 유지 해야 할 때 3.추상클래스일때
		printDate(cal);
		
		//특정 날짜 세틸하기
		cal.set(Calendar.YEAR,2014);
		cal.set(Calendar.MONTH,10);
		cal.set(Calendar.DATE,4);
		
		//cal.set(2014,10,4); //위와 동일
		
		//기념일
		cal.add(Calendar.DATE,1000);
		
		printDate(cal);
	}

	public static void printDate(Calendar cal)
	{
		String[] days = {"일","월","화","수","목","금","토"}; //0(일)~6(토)
		
		int year = cal.get(Calendar.YEAR); 
		//0~11
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		//1(일)~7(토)
		int day = cal.get(Calendar.DAY_OF_WEEK);
		int am = cal.get(Calendar.PM);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.println(year + "년 " + (month+1) + "월 " + date + "일 "+ days[day - 1] + "요일 " + (am == 0 ? "오전" : "오후") + " " +  hour + ":" + min + ":" + sec);
	}
}
