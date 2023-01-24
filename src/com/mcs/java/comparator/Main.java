package com.mcs.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Example of the comparator changes.
 * 
 * @author merri
 *
 */
public class Main {

	public static void main (String[] args) {
		
		List<Book> books = new ArrayList<>();
		books.add(new Book(3, "Game of Thrones"));
		books.add(new Book(4, "Empire Strikes Back"));
		books.add(new Book(1, "Lord of the rings"));
		books.add(new Book(2, "Star Wars"));
		books.add(new Book(5, "Star Wars"));		
		books.add(new Book(5, "Return of the Jedi"));		
		
		/**
		 * Old style comparator.
		 */
		Comparator<Book> titleComparator = new Comparator<Book>() {
		    public int compare(Book book1, Book book2) {
		        return book1.getTitle().compareTo(book2.getTitle());
		    }
		};

		System.out.println("Comparator Old Style");
		Collections.sort(books, titleComparator);		
		books.forEach(System.out::println);
		
		/**
		 * New style with lambda expressions
		 */
		System.out.println("Comparator Lambda Expression");
		Comparator<Book> newStyleComp = (Book book1, Book book2) -> book1.getTitle().compareTo(book2.getTitle());
		Collections.sort(books, newStyleComp);		
		books.forEach(System.out::println);
		
		/**
		 * Use natural order.
		 */
		System.out.println("Comparator Natural Order");
		Collections.sort(books, Comparator.naturalOrder());		
		books.forEach(System.out::println);
		
		/**
		 * Use reverse order.
		 */
		System.out.println("Comparator Reverse Order");
		Collections.sort(books, Comparator.reverseOrder());		
		books.forEach(System.out::println);	
		
		/**
		 * Comparator chaining
		 */
		System.out.println("Comparator Chaining");
		Collections.sort(books, Comparator.comparing(Book::getTitle).thenComparing(Book::getIsdn));
		books.forEach(System.out::println);	
	}
}