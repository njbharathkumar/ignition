package com.test.gdp;

public class GenericArrayTest<E> {

	public static void main(String[] args){
		GenericArrayTest<String> t = new GenericArrayTest<String>();
	    t.test("Hello World");
	    
		GenericArrayTest<Integer> t2 = new GenericArrayTest<Integer>();
	    t2.test(125);
	}

	public void test(E a){
	    E[] b = (E[])new Object[1];
	    b[0] = a;
	    System.out.println(b[0]);
	}
}
