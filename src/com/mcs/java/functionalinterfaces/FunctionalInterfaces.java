package com.mcs.java.functionalinterfaces;

/**
 * Functional Interfaces.
 * 
 * - New package java.util.function, with a rich set of interfaces
 * - A lambda expression is an instance of a functional interface
 * - An interface with only one abstract method
 * - Default methods do not count in the number of methods
 * - Static methods do not count in the number of methods
 * - Methods from the object class don't count
 * - Maybe annotated with the @FunctionalInterface annotation
 * - 4 categories of 43 interfaces
 * - The 4 categories are:- 
 *    - Consumer  - Consumes an object and does not return anything
 *	  - Supplier  - provides an object, takes no parameter
 *	  - Function  - Takes an object and returns another object
 *	  - Predicate - Takes an object and returns a boolean
 */
public class FunctionalInterfaces {

	
	  /**
	   * Supplier
	   */
	  @FunctionalInterface 
	  public interface Supplier<T> {
		T get();
	  }
	   
	  /** 
	   * Consumer
	   */
	  @FunctionalInterface 
	  public interface Consumer<T> {
		void accept(T t);
	  }
  
	  /**
	   * BiConsumer
	   */
	  @FunctionalInterface 
	  public interface BiConsumer<T, U> {
		void accept(T t, U u);
	  }
	  
	  /**
	   * Predicate
	   */	
	  @FunctionalInterface 
	  public interface Predicate<T> {
		boolean test(T t);
	  }	
	  
	  /**
	   * BiPredicate
	   */
	  @FunctionalInterface 
	  public interface BiPredicate<T, U> {
		boolean test(T t, U u);
	  }	
	 
	  /**
	   * Function
	   */
	  @FunctionalInterface 
	  public interface Function<T, R> {
		R apply(T t);
	  }	
	  	
	  /**
	   * BiFunction
	   */
	  @FunctionalInterface 
	  public interface BiFunction<T, R> {
		R apply(T t);
	  }

	  /**
	   * UnaryOperator e.g. UnaryOperator<String> i  = (x)-> x.toUpperCase();
	   */
	  @FunctionalInterface
	  public interface UnaryOperator<T> {
		  T identity();
	  }
	  
	  /**
	   * BinaryOperator represents an operation upon two operands of the same type, producing a result of the same type.
	   * e.g. BinaryOperator<Integer> adder = (n1, n2) -> n1 + n2;
	   */	
}
