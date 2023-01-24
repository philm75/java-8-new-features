package com.mcs.defaultinterfacemethods;

import com.mcs.java.methodreferences.Name;

/**
 * Example of default and static methods in interfaces.
 * 
 * - new default method forEach is an example in the Iterable<E> interface
 * - Allows old interfaces to change without breaking existing implementations
 * 
 * - Static methods can be implemented, they don't belong to a
 *   particular object, they are called by using the interface name
 *   preceding the method name. 
 *  
 * @author merri
 *
 */
public interface NameService {

	void addName(Name name);
	
	void updateName(Name name);
	
	Name getName(String name);
	
	default void printName(Name name) {
		System.out.println("Printing name " + name.getName());
	}	
	
	static String toUpperCase(String value) {
		return (value != null ? value.toUpperCase() : "");
	}
}