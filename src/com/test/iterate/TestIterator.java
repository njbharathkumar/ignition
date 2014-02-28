package com.test.iterate;

import java.util.Iterator;

public class TestIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BookCollection books = new BookCollection();
		books.add(new Book(101,"Java"));
		books.add(new Book(102,"Python"));
		books.add(new Book(300,"C#"));
		
		System.out.println("-----Iterable------");
		for (Book b : books) 
			System.out.println(b);
		
		System.out.println("-----Iterator------");
		/**
		Iterator<Book> iter = books.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}*/
		
		for (Iterator<Book> iter = books.iterator(); iter.hasNext(); )
			System.out.println(iter.next());
	}

}
