package com.test.ienum;

public class TestEnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x=100,y=30;
		System.out.println(""+x+"+"+y+"="+Operation.sum(x, y));
		System.out.println(""+x+"-"+y+"="+Operation.subtract(x, y));
		System.out.println("asb(-19)="+Operation.asb(-19));
	}

}
