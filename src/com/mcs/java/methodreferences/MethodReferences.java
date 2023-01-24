package com.mcs.java.methodreferences;

import java.util.Arrays;
import java.util.List;

/**
 * - Short cut to writing lambda expression
 * - :: indicates a method reference
 * - 4 types of method reference
 *   - Reference to static method, Class::staticMethodName
 *   - Reference to a constructor, Class::new
 *   - Reference to a instance method with aritrary object, Class::instanceMethodName
 *   - References to an instance method of a particular object, object:instanceMethodName 
 */
public class MethodReferences {

	interface Upper {
		String upper(String value);
	}
	
	static String toUpper(String value) {
		return value.toUpperCase();
	}
	
	public static void main (String[] args) {
		/**
		 *  Reference to a static method
		 */
		Upper upper = MethodReferences::toUpper;
		System.out.println(upper.upper("Phil"));
		
		List<String> messages = Arrays.asList("hello", "there", "devs");
		messages.forEach(MethodReferences::toUpper);
		
		/**
		 *  Reference to an instance method of particular object
		 */
		NameComparator comparator = new NameComparator();
		
		List<Name> names = Arrays.asList(new Name("Phil"), 
				                         new Name("Lyndsey"), 
				                         new Name("Ollie"), 
				                         new Name("Sofia"));
		
		names.stream().sorted((a, b) -> comparator.compare(a, b));
		// can be changed to
		names.stream().sorted(comparator::compare);
				
		/**
		 * Reference to an instance method of an arbitrary object of a particular type.
		 */
 
		List<Integer> numbers = Arrays.asList(5, 3, 50, 24, 40, 2, 9, 18);
		numbers.stream().sorted((a, b) -> Integer.compare(a, b));
		// can be changed to
		numbers.stream().sorted(Integer::compare);
		
		/**
		 * Reference to a constructor
		 */
		List<String> listOfNames = Arrays.asList("Phil", "Lyndsey", "Ollie", "Sofia");
		
		listOfNames.stream()
				   .map(Name::new)
				   .toArray(Name[]::new);	
		
	}
}
