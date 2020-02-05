/**
 * 
 */
package com.domainPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Harshal-Git
 * Iteration problem - Convert this code sample from using external iteration to internal iteration:
 */
public class Exercise2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Artist> artistsList= new ArrayList<>();
		
		// external iteration
		external(artistsList);
		
		// internal iteration
		internal(artistsList);
	}

	
	/**
	 * internal iteration
	 * @param artistsList
	 */
	private static void internal(List<Artist> artistsList) {
		int totalMembers= (int) artistsList.stream().flatMap(artist -> artist.getMembers().stream()).count();
		System.out.println("Total members: "+totalMembers);
	}

	/**
	 * external iteration
	 * @param artists
	 */
	public static void external(List<Artist> artists) {
		int totalMembers = 0;
		for (Artist artist : artists) {
			Stream<Artist> members = artist.getMembers().stream();
			totalMembers += members.count();
		}
		System.out.println("Total members: "+totalMembers);
	}
}
