package com.auribises;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("Today is: "+date);

		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		String newDate = sdf.format(date);
		
		System.out.println("Date is: "+newDate);
		
		Calendar cal = Calendar.getInstance();
		//System.out.println("cal is: "+cal);
		
		int dd = cal.get(Calendar.DAY_OF_MONTH);
		int mm = cal.get(Calendar.MONTH);
		int yy = cal.get(Calendar.YEAR);
		
		System.out.println("Calendar Date: "+dd+"/"+(mm+1)+"/"+yy);
		
	}

}
