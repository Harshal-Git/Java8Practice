/**
 * 
 */
package com.oldPrograms.domainPractice;

/**
 * @author Harshal-Git
 * A single piece of music
 */
public class Track {

	// The name of the track (e.g., “Yellow Submarine”)
	private String name;
	
	// track length - in seconds
	private short length;
	
	/**
	 * 
	 * @param trackName
	 * @param length - track length in seconds 
	 */
	public Track(String trackName, short length) {
		if(trackName== null || length < 0) {
			throw new IllegalArgumentException("Illegal arguments");
		}
		this.name= trackName;
		this.length= length;
	}

	public String getName() {
		return name;
	}

	/**
	 * album length
	 * @return length in seconds
	 */
	public short getLength() {
		return length;
	}
	
	@Override
	public String toString() {
		return "Track: "+this.getName()+" -> Length: "+(this.getLength()/60)+" m.";
	}
}
