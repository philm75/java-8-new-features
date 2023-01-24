package com.mcs.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Streams. 
 * - It does not hold any data
 * - It pulls the data it processes from a source
 * - Does not modify the data it processes, we want to process in parallel
 * - The source may be unbounded, which can mean it is not finite, the size of the source is not known at build time
 * - A Stream is a typed interface
 * - public interface Stream<T> extends BaseStream<T, Stream<T>> {
 *   }
 * - Efficient way of processing large amounts of data and smaller ones
 * - In parallel, to leverage the computing power of multicore CPU
 * - Pipelined, to avoid unnecessary intermediary computations
 * - Collections is not a stream, stream is a new concept
 * - Its an object which one can define operations
 * - Processes data in one pass
 * - Object is optimised from the algorithm point of view, and able to process data in parallel 
 * 
 * @merri
 *
 */
public class Main {
	
	public static void main (String[] args) {
		Stream<String> stream = Stream.empty();		
		stream = Arrays.asList("phil", "lyndsey", "ollie", "sofia").stream();
		System.out.println(stream.count());

		// When builder is used the desired type should be additionally specified in the right part of the statement, 
		// otherwise the build() method will create an instance of the Stream<Object>:
		Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();
		System.out.println(streamBuilder.findFirst().get().equals("a"));
		
		Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10);
		System.out.println(streamGenerated.findFirst().get());
		
		//
		// Streams of primitives, with forEach terminal operation.
		//
		IntStream intStream = IntStream.rangeClosed(1, 20);
		intStream.forEach(System.out::println);
		
		//
		// Intermediate operations example, in this example intermediate operations are chained.
		//
		Stream<String> intermediateStream = Arrays.asList("phil", "lyndsey", "ollie", "sofia").stream();
		Stream<String> twiceModifiedStream = intermediateStream.skip(1).map(element -> element.substring(0, 3));
		twiceModifiedStream.forEach(System.out::println);
		
		//
		// Get distinct list of vessel names 
		//		
        List<String> vesselDtos  = new ArrayList<>();
        List<String> vessels = Arrays.asList("Vessel1","Vessel1","Vessel2","Vessel3","Vessel3");
        
        vesselDtos = vessels.stream().map(vessel -> vessel.toUpperCase())
                                     .distinct()
                                     .sorted()
                                     .collect(Collectors.toList());
        
        System.out.println("Number of distinct vessels=" + vesselDtos.size());
	}	
}
