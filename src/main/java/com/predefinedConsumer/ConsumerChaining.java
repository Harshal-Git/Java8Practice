/**
 * 
 */
package com.predefinedConsumer;

import java.util.function.Consumer;

/**
 * @author Harshal-Git
 *
 */
public class ConsumerChaining {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// consumer for hit movie
		Consumer<Movie> c1 = (movie) -> System.out.println(movie.getName()+" movie is in production."); 
		
		// consumer for flop movie
		Consumer<Movie> c2 = (movie) -> System.out.println(movie.getName()+" movie reviews released.");
		
		// consumer to store movie into DB
		Consumer<Movie> c3 = (movie) -> System.out.println(movie.getName()+" reviews getting stored in DB.");
		
		// movie data
		Movie m1 = new Movie("Hello");
		
		// apply consumer in chain
		c1.andThen(c2).andThen(c3).accept(m1);
	}
}

class Movie {
	
	private String movieName;
	
	public Movie(String name) {
		this.movieName = name;
	}
	
	public String getName() {
		return this.movieName;
	}
}