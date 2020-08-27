/**
 * 
 */
package com.oldPrograms.domainPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author Harshal-Git
 * 
 * -> find shortest track 
 * -> find longest track 
 * -> find all tracks with length over 60 seconds OR 1 minute from albums
 */
public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Track> tracks = Arrays.asList(new Track("Bakai", (short) 524),
															new Track("Violets for Your Furs", (short) 378),
															new Track("Time Was", (short) 451));

		Track shortestTrack= tracks.stream().
															/* if lambda used; then type casting is needed */
															//min(Comparator.comparing(track -> ((Track)track).getLength())).
				
															/* if method reference is used; easy operation - and comparing() API prefers this approach */
															min(Comparator.comparing(Track :: getLength)). 
															get();
		System.out.println("Shortest track: "+shortestTrack.toString());

		Track longestTrack= tracks.stream().
															/* if lambda used; then type casting is needed */
															//max(Comparator.comparing(track -> ((Track)track).getLength())).
				
															/* if method reference is used; easy operation - and comparing() API prefers this approach */
															max(Comparator.comparing(Track :: getLength)). 
															get();
		System.out.println("Longest track: "+longestTrack.toString());
		
		
		/*
		 * If we are not sure whether the collection is empty OR not, we should return an optional object. 
		 * This will avoid any possibility of unexpected exception
		 */
		Optional<Track> trackObj= new ArrayList<Track>().stream().
																			min(Comparator.comparing(Track :: getLength));
		if(trackObj.isPresent()) {
			System.out.println("What did you find...?");
		}else {
			System.out.println("Stream is empty. Nothing to find.");
		}
		
		/*
		 * Find all tracks with length more than 1 minute from albums (no specific album is given)
		 * 
		 * Breakdown
		 * 
		 * 	1. Iterate over albums
		 * 
		 * 2. Iterate over tracks for each albums
		 * 				-> find list of tracks from each album
		 * 
		 * 3. Iterate over all tracks and find tracks with length more than 60 seconds
		 * 				-> find single track from list of tracks and filter albums with length more than a minute
		 *  
		 * 4. collect data into set
		 * 				-> collect data into set
		 */
		List<Album> albums= new ArrayList<>();
		
		/*
		 * approach 1 - using for each
		 * -> for album.getTracks() - .stream() method is not needed as in parent collection, .stream() is already applied. 
		 */
		List<String> longTracks= new ArrayList<>();
		
		albums.stream().forEach( album -> {
													album.getTracks().forEach( track -> {
														if(track.getLength() > 60) {
															longTracks.add(track.getName());
														}
													}); });
		System.out.println("Long tracks: "+longTracks.toString());
		
		/*
		 * approach 2 - 
		 */
		
	}

}
