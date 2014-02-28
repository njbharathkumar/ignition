package com.test.timezone;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TestTimezone {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss zzzz");
		Calendar date1 = new GregorianCalendar(2014,0,15,10,0,0);
		System.out.println(sdf.format(date1.getTime())+"\n");
		long utcTimeStamp = Utility.toUTC(date1.getTimeInMillis(), date1.getTimeZone());
		Calendar utcCal = Calendar.getInstance();
		utcCal.setTimeInMillis(utcTimeStamp);
		System.out.println("toUTC: "+sdf.format(utcCal.getTime())+"\n");
		
		System.out.println("---------------------------------------");
		Calendar date2 = new GregorianCalendar(2014,2,15,10,0,0);
		System.out.println(sdf.format(date2.getTime())+"\n");
		utcTimeStamp = Utility.toUTC(date2.getTimeInMillis(), date2.getTimeZone());
		utcCal.setTimeInMillis(utcTimeStamp);
		System.out.println("toUTC: "+sdf.format(utcCal.getTime())+"\n");
		
		System.out.println("---------------------------------------");
		Calendar date3 = new GregorianCalendar(2014,11,25,9,0,0);
		System.out.println(sdf.format(date3.getTime())+"\n");
		long uTime = Utility.toUTC(date3.getTimeInMillis(), date3.getTimeZone());
		System.out.println("utcTimeStamp: "+uTime+"\n");
		long lTime = Utility.toLocalTime(uTime, TimeZone.getTimeZone("EST"));
		Calendar locCal = Calendar.getInstance();
		locCal.setTimeInMillis(lTime);
		System.out.println("toLocal: "+sdf.format(locCal.getTime())+"\n");
		
		System.out.println("---------------------------------------");
		Calendar date4 = new GregorianCalendar(2014,6,4,9,0,0);
		System.out.println(sdf.format(date4.getTime())+"\n");
		uTime = Utility.toUTC(date4.getTimeInMillis(), date4.getTimeZone());
		System.out.println("utcTimeStamp: "+uTime+"\n");
		lTime = Utility.toLocalTime(uTime, TimeZone.getTimeZone("EST"));
		locCal = Calendar.getInstance();
		locCal.setTimeInMillis(lTime);
		System.out.println("toLocal: "+sdf.format(locCal.getTime())+"\n");
	}
}
