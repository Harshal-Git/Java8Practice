/**
 * 
 */
package com.domainPractice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Harshal-Git
 * 
 * A single release of music, comprising several tracks
 */
public class Album {

	// The name of the album (e.g., “Revolver”)
	private String name;
	
	// A list of tracks
	private List<Track> tracks;
	
	// A list of artists who helped create the music on this album
	private List<Artist> musicians;

	//
	public Album() {
		this.name= null;
		this.tracks= new ArrayList<>();
		this.musicians= new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}

	public List<Track> getTracks() {
		return tracks;
	}

	public List<Artist> getMusicians() {
		return musicians;
	}
	
}
