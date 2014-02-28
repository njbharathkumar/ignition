package com.test.iterate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollection implements Iterable<Book> {
	List<Book> list = new ArrayList<Book>();
	
	public void add(Book book) {
		list.add(book);
	}
		
	public void remove(Book book) {
		list.remove(book);
	}
	
	@Override
	public Iterator<Book> iterator() {
		return new BookIterator(list);
	}

	private class BookIterator implements Iterator<Book>{
		private List<Book> list = null;
		private int position = 0;
		
		public BookIterator(List<Book> list) {
			this.list = list;
		}
		
		@Override
		public boolean hasNext() {
			return position < list.size(); 
		} 
		
		@Override
		public Book next() {
			Book b = list.get(position);
			position++;
			return b;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub			
		}		
	}
}
