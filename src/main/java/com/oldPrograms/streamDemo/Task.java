/**
 * 
 */
package com.oldPrograms.streamDemo;

/**
 * @author Harshal-Git
 *
 */
public class Task {

	// members of Task class
	private final String taskName;
	private final TaskStatus status;
	private final int points;
	
	// declare Task class - containing points (time limit) and status
	public Task(final String name, final TaskStatus status, final int points) {
		if(name== null) {
			throw new NullPointerException("No null value allowed.");
		}
		this.taskName= name;
		this.status= status;
		this.points= points;
	}
	
	public int getPoints() {
		return this.points;
	}
	
	public TaskStatus getStatus() {
		return this.status;
	}
	
	public String getName() {
		return new String(this.taskName);
	}
	
	@Override
	public String toString() {
		return String.format("[%s -> %s : %d ]", this.taskName , this.status.toString(), this.points);
	}
}
