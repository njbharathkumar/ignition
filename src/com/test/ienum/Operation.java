package com.test.ienum;

public final class Operation {

	public static int sum(int a, int b) {
		return EOperator.SUM.calculate(a,b);
	}

	public static int subtract(int a, int b) {
		return EOperator.SUBTRACT.calculate(a,b);
	}
	
	public static int asb(int a) {
		return (a <= 0) ? 0 - a : a;
	}
}
