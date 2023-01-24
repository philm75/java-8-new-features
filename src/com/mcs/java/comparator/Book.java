package com.mcs.java.comparator;

import java.util.StringJoiner;

public class Book implements Comparable<Book> {

	private Integer isdn;
	
	private String title;

	public Book(Integer isdn, String title) {
		this.isdn = isdn;
		this.title = title;
	}

	@Override
	public String toString() {
		StringJoiner toString = new StringJoiner(",", "[", "]");		
		return toString.add(String.valueOf(isdn)).add(title).toString();		
	}

	public Integer getIsdn() {
		return isdn;
	}

	public void setIsdn(Integer isdn) {
		this.isdn = isdn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int compareTo(Book book) {
		return (this.isdn - book.isdn);
	}	
}