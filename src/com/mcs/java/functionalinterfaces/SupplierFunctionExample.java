package com.mcs.java.functionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * Supplier Function takes no arguments returns a value calling its get method.
 * 
 * @author merri
 *
 */
public class SupplierFunctionExample {

	public static void main(String[] args) { 
        List<String> names = new ArrayList<String>();
        names.add("Phil");
        names.add("Lyndsey");
        names.add("Ollie");       
        names.add("Sofia");
 
        names.stream().forEach((item)-> {
            printNames(()-> item);
        });
	}
	
	private static void printNames(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }	
}
