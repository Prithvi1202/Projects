package com.prithvi.marlabs;

import java.util.Calendar;

public class CallInfo {

	public static void main(String a[]){
		Calendar cal = Calendar.getInstance();
		int date = cal.get(Calendar.DATE);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		
		int maxDays = cal.getActualMaximum(Calendar.DATE);
		int  dayYear= cal.get(Calendar.DAY_OF_YEAR);
		int weekDay = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(date + "-"+ month + "-"+ year );
		System.out.println("max days: " +maxDays);
		System.out.println("Weekday:"  + weekDay);
		System.out.println("Day of year: " +dayYear);
		
		cal.set(2015, 11, 1);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	}
}
