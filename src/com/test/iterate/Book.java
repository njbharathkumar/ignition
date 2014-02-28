package com.test.iterate;

public class Book {
	private int isbn;
	private String name;
	
	Book (int isbn, String name) {
		this.isbn = isbn;
		this.name = name;
	}
	
	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return "book: ISBN="+isbn+", name="+name;
	}
	
}
