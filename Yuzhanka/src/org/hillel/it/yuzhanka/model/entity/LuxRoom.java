package org.hillel.it.yuzhanka.model.entity;

public class LuxRoom extends Room {

	private boolean tv;
	private boolean bathroom;
	private boolean airconditioner;

	public LuxRoom(boolean active, int numberOfPlaces, int roomNumber) {
		super();
		this.airconditioner = true;
		this.bathroom = true;
		this.tv = true;
		this.active = active;
		this.numberOfPlaces = numberOfPlaces;
		this.roomNumber = roomNumber; 
	}

}
