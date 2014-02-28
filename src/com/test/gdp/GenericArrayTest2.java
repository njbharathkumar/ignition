package com.test.gdp;

public class GenericArrayTest2<E> {
		private final static int init_capacity = 1;
		private E[] ary;
		private int n = 0;
		
		public static void main(String[] args){
			GenericArrayTest2<String> t = new GenericArrayTest2<String>(5);
			t.add("Hello");
			t.add("Kitty");
			t.add("cow");
			t.add("mow...");
			t.test();
		}

		GenericArrayTest2() {
			this(init_capacity);
		}
		
		GenericArrayTest2(int s) {
			ary = (E[])new Object[s];
		}
		
		public void add(E e) {
			if (n == ary.length) throw new IndexOutOfBoundsException();
			ary[n] = e;
			n++;
		}
		
		public E get(int i) {
			if (i < 0 || i >= ary.length) throw new IndexOutOfBoundsException();
			return ary[i];
		}
		
		public void test(){
		    for (int i=0 ; i <ary.length; i++) {
		    	if (ary[i] != null) 
		    		System.out.println(ary[i]) ;
		    	
		    }
		}
	}
