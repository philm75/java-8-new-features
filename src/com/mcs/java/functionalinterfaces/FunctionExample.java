package com.mcs.java.functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {

	private static Function<Integer, String> toString = new Function<Integer, String>() {

		@Override
		public String apply(Integer value) {			
			return String.valueOf("The number is " + value);
		}
    }; 	
	
	public static void main(String[] args) {
		System.out.println(toString.apply(1));		
	}
}