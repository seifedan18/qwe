package com.craft;

import org.joda.time.DateTime; 

public class Demo {

	private static String month;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateTime d = new DateTime ();
		int mouth = d.getMounthOfYear();
		int date = d.getDayOfMonth();
		System.out.println(month + "  " + date);
		

	}

}
