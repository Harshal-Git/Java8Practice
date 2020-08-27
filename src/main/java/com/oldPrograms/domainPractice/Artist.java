/**
 * 
 */
package com.oldPrograms.domainPractice;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Harshal-Git
 *
 * An individual or group who creates music
 */
public class Artist {

	// name of the artist (e.g.,  “The Beatles”).
	private String name;
	
	// A set of other artists who comprise this group (e.g., “John Lennon”).  This field might be empty.
	private Set<Artist> members;
	
	// The primary location of origin of the group (e.g., “Liverpool”)
	private String origin;
	
	// constructor
	private Artist() {
	}

	/**
	 * 
	 * @param name - Artist/Group name
	 * @param members - Members of the group (if any) - can be empty
	 * @param origin - Artist / Group origin
	 */
	public Artist(String name, Set<Artist> members, String origin) {
		
		if(name==null || origin== null) {
			throw new NullPointerException("Artist name and origin is mandatory.");
		}
		if(members== null) {
			members= new HashSet<Artist>();
		}
		this.name= name;
		this.members= members;
		this.origin= origin;
	}
	
	// method to know location
	public boolean isFrom(String location) {
		boolean isValidLocation= false;
		if(location== null) {
			isValidLocation= false;
		}
		else {
			if(this.origin.equalsIgnoreCase(location)) {
				isValidLocation= true;
			}
		}
		return isValidLocation;
	}

	public String getName() {
		return name;
	}

	public Set<Artist> getMembers() {
		return members;
	}

	public String getOrigin() {
		return origin;
	}
	
}
