package com.test.gdp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestConcurrencyList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> aList = new ArrayList<String>();
		aList.add("AAA");
		aList.add("BBB");
		for (String x : aList) {
			System.out.println(x);
		}
		
//		List<String> bList = Collections.synchronizedList(aList);
//		for (String x : bList) {
//			bList.add("CCC");
//			System.out.println(x);
//		}
		
		List<String> cList = new CopyOnWriteArrayList();
		cList.add("X");
		cList.add("Y");
		for (String x : cList) {
			System.out.println(x);
			cList.add(x+"Z");			
		}
		System.out.println("-------------------");
		for (String x : cList) {
			System.out.println(x);
		}
		
	}

}
