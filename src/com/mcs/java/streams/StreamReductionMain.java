package com.mcs.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Stream reduce and collect examples.
 * 
 * @author merri
 *
 */
public class StreamReductionMain {

	public static void main (String[] args) {
	
		/**
		 * Adds all numbers together in the range.
		 */
		OptionalInt reduced = IntStream.rangeClosed(1, 4).reduce((a, b) -> a + b);
		System.out.println(reduced);
		
		/**
		 * Collector example.
		 */
		List<String> products = Arrays.asList("potatoes", "orange", "lemon", "bread", "sugar");
		
		String listToString = products.stream().collect(Collectors.joining(", ", "[", "]"));
		System.out.println(listToString);
		
		/**
		 * Parallel example
		 */
		IntStream intStreamParallel = IntStream.range(1, 150).parallel();
		boolean isParallel = intStreamParallel.isParallel();
		System.out.println("isParallel is " + isParallel);
	}
}
