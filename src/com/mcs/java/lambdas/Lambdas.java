package com.mcs.java.lambdas;

import java.io.File;
import java.io.FileFilter;
import java.util.Comparator;

/**
 * Lambda Expressions.
 * 
 * - Another way of writing instances anonymous classes
 * - You can put modifier on the parameters of a lambda expression
 *   - final keyword
 *   - annotations
 * - Pass code to method parameter
 * - You can also omit the type of the parameters (String s1, String s2) becomes (s1, s2)
 * - To make instances of anonymous classes easier to write and read
 * - What is the type of a lambda expression? A Functional Interface, an interface with only one abstract method
 * - Example Functional Interfaces, Runnable, Comparator<T>, FileFilter
 * - Methods from the object class don't count
 * - Can be annotated with @FunctionalInterface, optional. Compiler will check the interface is functional if the 
 *   interface is annotated with @Functional Interface 
 * - A lambda can be taken as a method parameter and can be returned by a method
 * - A lambda is an object without an identity
 * 
 */
public class Lambdas {

	@SuppressWarnings("unused")
	public static void main (String[] args) {

		  Comparator<String> comp = new Comparator<String>() {
				public int compare (String s1, String s2) {
					return Integer.compare(s1.length(), s2.length());
			    }
		  };	
		  
		  // Lambda equivalent
		  Comparator<String> lambdaComp = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());
		  
		  FileFilter fileFilter = new FileFilter() {
				@Override
				public boolean accept(File file) {
					return file.getName().endsWith(".java");
				}
		  };
		  
		  // Several ways of writing a lambda expression

		  FileFilter filter = (File file) -> file.getName().endsWith(".java");
		  
		  // You can omit types from the method arguments		  
		  // Comparator<String> c = (s1, s2) -> {};
		  
		  // More than one line of code, use curly braces, note even methods with no arguments are shown as ()
		  Runnable r = () -> {
			 for (int i=0; i <5; i++) {
				System.out.println("Hello");
			 }
		  };		  
	}
}