package com.mcs.java.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main (String[] args) {
		Predicate<Integer> lesserthan = i -> (i < 20);  
        System.out.println(lesserthan.test(10)); 
	}
}