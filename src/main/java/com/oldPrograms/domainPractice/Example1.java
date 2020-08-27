/**
 * 
 */
package com.oldPrograms.domainPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author Harshal-Git
 *	Counting London-based artists using a for loop
 */
public class Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Artist> allArtists= prepareArtists();

		String location= "London";
		
		iteratorApproach(allArtists, location);
		
		forLoopApproach(allArtists, location);

		int count= streamApproach(allArtists, location);
		
		System.out.println("Total artists from "+location+": "+count);
	}

	// stream approach (internal iteration)
	/*
	 * Unless any terminal operation is initiated (here count()), all other intermediate options are not initiated. Those types of intermediate operations are lazy.
	 * The terminal operations are eager which only will allow to execute the other functions (here intermediate operations) provided on the stream.
	 * 
	 *  This can be checked here. The sysout statement will only execute if there is a count(). If it is removed and code is executed, no sysout will happen. 
	 */
	private static int streamApproach(List<Artist> allArtists, String location) {

		// original output 1
		/*return (int) allArtists.stream().
													filter(artist -> artist.isFrom(location)).
													count();*/
		
		// original output 2
		/*return (int) allArtists.stream().
													filter(artist -> {
																			System.out.println("filtering artists...");
																			return artist.isFrom(location);
																		 }).
													count();*/

		// Test 1: to understand lazy initialization  stream is ready but it won't print the sysout statement
		allArtists.stream().
									filter(artist -> {
															System.out.println("filtering artists...");
															return artist.isFrom(location);
															});
		return 1;
	}

	// iterator approach (external iteration)
	private static int iteratorApproach(List<Artist> allArtists, String location) {
		
		int count= 0;
		
		Iterator<Artist> artistIterator= allArtists.iterator();
		
		while (artistIterator.hasNext()) {
			Artist artist = (Artist) artistIterator.next();
			if(artist.isFrom(location)) {
				count++;
			}
		}
		return count;
	}

	// for loop approach (external iteration)
	private static int forLoopApproach(List<Artist> allArtists, String location) {
		int count= 0;
		for(Artist artist : allArtists) {
			if(artist.isFrom(location)) {
				count++;
			}
		}
		return count;
	}

	// prepare some data
	private static List<Artist> prepareArtists() {
		List<Artist> artists= new ArrayList<>();
		artists.add(new Artist("Beatles", getBeatlesArtists(), "London"));
		return artists;
	}

	private static Set<Artist> getBeatlesArtists() {
		Set<Artist> beatles= new HashSet<>();
		beatles.add(new Artist("John Lennon", null, "London"));
		beatles.add(new Artist("Paul McCartney", null, "London"));
		beatles.add(new Artist("George Harrison", null, "London"));
		beatles.add(new Artist("Ringo Starr", null, "London"));
		return beatles;
	}
}
