/**
 * 
 */
package com.domainPractice;

import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Harshal-Git
 * Problem 1 - find the nationality of every band playing on that album.
 * 
 * Breakdown:
 * 
 * 1. Here album is the input. Find artists for that particular album which are a band.
 * 				album -> getmusicians() - list of artists
 * 
 * 2. Find nationality of all artists who are a band
 * 				from list of artists -> filter bands (predicate - artist name starts with "the") -> find origin (map with origin)
 * 
 * 3. Collect the data and populate.
 * 				collect origins as set of string and print
 * 
 * Assumption: The artists who play each track can be solo artists or they can be in a band. 
 * 						We’re going to use domain knowledge and artistic license to pretend that a band is really an artist whose name begins with "The".
 */
public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// assume we have ready Album object with all the data provided
		Album album= new Album();
		
		// predicate function - used with filter to find the band artists (names starting from "The")
		Predicate<Artist> bandPredicate= new Predicate<Artist>() {
			
			@Override
			public boolean test(Artist artistObj) {
				if(artistObj.getName().startsWith("The")) {
					return true;
				}
				return false;
			}
		};
		
		// Function to map artist for their origin
		Function<Artist, String> mapFunction= new Function<Artist, String>() {
			@Override
			public String apply(Artist t) {
				return t.getOrigin();
			}
		};

		/*
		 * using anonymous impl functions
		 */
		Set<String> data1= album.getMusicians().stream().
																				filter(bandPredicate).
																				map(mapFunction).
																				collect(Collectors.toSet());
		System.out.println("Data - "+data1.toString());
		
		/*
		 * using lambda directly in the methods
		 */
		Set<String> data2= album.getMusicians().stream().
																filter(artist -> artist.getName().startsWith("The")).
																map(Artist :: getOrigin).
																collect(Collectors.toSet());
	
		System.out.println("Data - "+data2.toString());
	}
}
