package com.prithvi.marlabs;

import java.util.Calendar;

public class ConsoleCal {
	
	String arr[][] = new String[7][7];
	String[] weekdays = {"Sun","Mon","Tue" , "Wed", "Thu", "Fri" , "Sat"};
	Calendar cal;
	int maxDays, weekDay;
	public ConsoleCal(int month , int year) {
		for(int i = 0 ; i< arr.length;i++){
			arr[0][i] = weekdays[i];
			
		}
		cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		maxDays = cal.getActualMaximum(Calendar.DATE);
		weekDay = cal.get(Calendar.DAY_OF_WEEK);
		boolean flag = false;
		int day = 1;
		//System.out.println();
		for(int i = 0 ; i< arr.length;i++){
			for(int j = 0 ; j< weekdays.length && day <= maxDays;j++){
				if(i == 0){
					
					System.out.print(arr[i][j] + "\t");
				}
				else{
					arr[i][j] =  day + "";
					day++;
					System.out.print(arr[i][j] + "\t" );
					/*if(day > maxDays){
						flag = true;
						break;
					}*/
				}
				
			}
			System.out.println();
			/*if(flag)
				break;*/
		}
		
	}
	
	
	public static void main(String a[]){
		new ConsoleCal(12, 2015);
	}
}
