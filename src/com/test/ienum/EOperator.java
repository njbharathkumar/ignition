package com.test.ienum;

public enum EOperator implements Operator {
	SUM {
		@Override
		public int calculate(int a ,int b) {
			return a + b;
		}
	},
	SUBTRACT {
		@Override
		public int calculate(int a ,int b) {
			return a - b;
		}
	}
}
