package com.mcs.java.string;

import java.util.StringJoiner;
import java.util.stream.IntStream;

/**
 * Examples of String new features.
 * 
 * @author merri
 *
 */
public class Main {

	public static void main (String[] args) {		
		// Creates int stream
		IntStream intStream = "phil".chars();
		intStream.forEach(System.out::println);
		
		// Joiner examples
		StringJoiner familyList = new StringJoiner(",", "[", "]");		
		System.out.println(familyList.add("phil").add("lyndsey").add("ollie").add("sofia").toString());		
		System.out.println(String.join(",", "phil", "lyndz", "ollie", "sofia"));
	}
}