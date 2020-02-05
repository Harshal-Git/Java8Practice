/**
 * 
 */
package com.domainPractice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Harshal-Git
 * -> This example finds the names of all tracks that are over a minute in length, given some albums.
 * 
 * -> This example explains how the transformation happens from legacy code into actual lambda expressions when we are rewriting the legacy code.
 */
public class Refactoring {

	/**
	 * -> the conventional method - using nested loops to iterate over complete collection
	 * @param albums - list of albums
	 * @return unique track names which are over a minute in length
	 */
	public Set<String> findLongTracks1(List<Album> albums) {
		Set<String> trackNames = new HashSet<>();
		for(Album album : albums) {
			for (Track track : album.getTracks()) {
				if (track.getLength() > 60) {
					String name = track.getName();
					trackNames.add(name);
				}
			}
		}
		return trackNames;
	}

	/**
	 * -> Step 1: removing loops and replacing those with forEach()
	 * 					the method inner body will remain mostly as it is 
	 * 
	 * @param albums - list of albums
	 * @return unique track names which are over a minute in length
	 */
	public Set<String> findLongTracks2(List<Album> albums) {
		Set<String> trackNames = new HashSet<>();
		albums.stream().forEach(album -> {
			album.getTracks().forEach( track -> {
				if(track.getLength() > 60) {
					trackNames.add(track.getName());
				}
			});
		});
		return trackNames;
	}
	
	/**
	 * -> Refinement to above method: 
	 * We’re really doing three things here: finding only tracks over a minute in length, getting their names, and adding their names into our name Set. 
	 * That means we need to call three Stream operations in order to get the job done. Finding tracks that meet a criterion sounds like a job for filter. 
	 * Transforming tracks into their names is a good use of map. 
	 * For the moment we’re still going to add the tracks to our Set, so our terminal operation will still be a forEach.
	 * @param albums - list of albums
	 * @return unique track names which are over a minute in length
	 */
	public Set<String> findLongTracks3(List<Album> albums) {
		Set<String> trackNames = new HashSet<>();
		albums.stream().forEach( album -> {
			album.getTracks().stream().
			filter(tracks -> tracks.getLength() > 60).
			map(Track :: getName).
			forEach(name -> trackNames.add(name));
		});
		return trackNames;
	}
	
	/**
	 * What we really want to do is find a way of transforming our album into a stream of tracks. 
	 * We know that whenever we want to transform or replace code, the operation to use is map. 
	 * This is the more complex case of map, flatMap, for which the output value is also a Stream and we want them merged together.
	 * @param albums - list of albums
	 * @return unique track names which are over a minute in length
	 */
	public Set<String> findLongTracks4(List<Album> albums) {
		return albums.stream().
				flatMap(album -> album.getTracks().stream()).
				filter(track -> track.getLength() > 60).
				map(Track :: getName).
				collect(Collectors.toSet());
	}
}
