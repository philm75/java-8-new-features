package com.mcs.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

import java.util.stream.Collectors;

import com.mcs.java.methodreferences.Name;
import com.mcs.java.methodreferences.NameComparator;

/**
 * Class shows new methods on collections, lists, map, etc in Java 8.
 * 
 * @author merri
 *
 */
public class Main {

	private static Consumer<String> printNames = name -> System.out.println(name);
	
	private static Predicate<String> greaterThanSixCharacters = value -> value.length() > 6;
	
	public static void main (String[] args) {
		Collection<String> names = new ArrayList<>();
		names.add("Phil");
		names.add("Lyndsey");
		names.add("Ollie");
		names.add("Sofia");
		names.add("Harry");
		
		/**
		 * New method on Iterable, added as a default method to the Iterable interface
		 */
		names.forEach(printNames);
				
		/**
		 * removeIf with predicates, in this instance startsWith() is the predicate as it returns a true/false result
		 * for each item in the collection.
		 */		
		List<String> result = names.stream().filter(name -> name.startsWith("H")).collect(Collectors.toList());
		System.out.println("Result size after predicate = " + result.size());
							
		names.removeIf(greaterThanSixCharacters);
		System.out.println("Names size after predicate = " + names.size());
		
		
		/**
		 * New methods on List, boolean replaceAll(UnaryOperator operator) 
         * and boolean sort(Comparator comparator)
		 */
		List<String> titles = Arrays.asList("mr.","mrs.","miss","master");
		titles.replaceAll(String::toUpperCase);
		titles.forEach(printNames);
		
		List<Name> nameObjs = new ArrayList<>();
		nameObjs.add(new Name("zPhil"));
		nameObjs.add(new Name("bPhil"));
		nameObjs.add(new Name("yPhil"));
		nameObjs.add(new Name("cPhil"));
			
		nameObjs.sort(new NameComparator());		
		nameObjs.forEach(name -> System.out.println(name.getName()));
		
		/**
		 * Maps....
		 * 
		 * void forEach(Consumer consumer) e.g. map.forEach(city, list) -> println(city + list.size())
		 * V getOrDefault(Object key, V defaultValue) -- Allows to check if a key is present in a map or not
         * V putIfAbsent(K key, V value);
         * V replace(K key, V newValue);
         * boolean replace (K key, V existingValue, V newValue);
         * void replaceAll(BiFunction function);
         * void remove(Object key, Object);
         * compute*();
         * computeIfAbsent();
         * computeIfPresent(); 
         * V merge(K key, V new Value, BiFunction remapping); - Used to merge maps
         * 
		 */
		
		Map<String, String> mapOfNames = new HashMap<>();
		mapOfNames.put("Phil", "Merriees");
		mapOfNames.put("Lyndsey", "Merriees");
		mapOfNames.put("Ollie", "Merriees");
		mapOfNames.putIfAbsent("Sofia", "Merriees");
		
		System.out.println("Map Size=" + mapOfNames.size());
		mapOfNames.putIfAbsent("Phil", "Smith");
		System.out.println("Map Size after putIfAbsent=" + mapOfNames.size());
		
		String defaultName = mapOfNames.getOrDefault("Bill", "Smith");
		System.out.println("defaultName=" + defaultName);
		
		mapOfNames.replace("Phil", "Merrilees");
		System.out.println("replace=" + mapOfNames.get("Phil"));	
		
		mapOfNames.remove("Hazza");
	}
}